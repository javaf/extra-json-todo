// @wolfram77
package org.data.json;



public class Parser {
    
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
        return null;
    }
}
