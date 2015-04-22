// @wolfram77
package org.data.json;



class Parser {

    
    
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
        }
        if(ans != null) return new ParseToken(ans, 2);
        if(c != 'u' || text.length() < 6) return null;
        return null;
    }
    
}
