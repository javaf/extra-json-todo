// @wolfram77
package org.data.json;



public class Parser {
    
    // constants
    final static String errInvalidEscSeq = "Invalid Escape Sequence";
    
    
    /**
     * Parse an escape sequence text.
     * @param text starts with '\'
     * @return parse token
     */
    public ParseToken escSeq(Text text) {
        Character ans = null;
        char c = text.charAt(1);
        switch(c) {
            case 'n':
                ans = '\n';
                break;
            case 't':
                ans = '\t';
                break;
            case 'b':
                ans = '\b';
                break;
            case 'f':
                ans = '\f';
                break;
            case 'r':
                ans = '\r';
                break;
            case '\"':
                ans = '\"';
                break;
            case '\'':
                ans = '\'';
                break;
            case '\\':
                ans = '\\';
                break;
            case 'u':
                if(text.length() < 6) break;
                ans = (char)Integer.parseInt(text.subSequence(2, 6).toString(), 16);
                return new ParseToken(ans, 6);
        }
        if(ans != null) return new ParseToken(ans, 2);
        throw new IllegalArgumentException(errInvalidEscSeq);
    }
    
    
    public ParseToken number(Text text) {
        int i = 0;
        Object value;
        boolean hex = false, floating = false;
        for(; i<text.length(); i++) {
            char c = text.charAt(i);
            if(c=='x' || c=='X') hex = true;
            if(c=='.' || c=='e' || c=='E') floating = true;
            if(!(c>='0' && c<='9') && c!='+' && c!='-' && c!='.' && !(c>='A' && c<='Z') && !(c<='a' && c<='z')) break;
        }
        String num = text.subSequence(0, i).toString();
        if(hex) value = Integer.parseInt(num, 16);
        else if(floating) value = Float.parseFloat(num);
        else value = Integer.parseInt(num);
        return new ParseToken(value, i);
    }
}
