// @wolfram77
package org.data.json;

// required modules
import java.util.*;
import java.io.*;



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
        System.out.println("internal:"+text.subSequence(0, i).toString().toUpperCase());
        if(hex) value = Integer.parseInt(text.subSequence(2, i).toString(), 16);
        else if(floating) value = Double.parseDouble(text.subSequence(0, i).toString().toUpperCase());
        else value = Integer.parseInt(text.subSequence(0, i).toString());
        return new ParseToken(value, i);
    }
    
    private static void property(Reader in) {
        
    }
    
    public static void parse(Map<String, Object> out, String in) {
        String state = "value";
        for(int i=0; i<in.length(); i++) {
            char c = in.charAt(i);
            switch(state) {
                case "value":
                    if(c <= ' ') state = "value";
                    else if(c == '\'') state = "value-string1-start";
                    else if(c == '\"') state = "value-string2-start";
                    else state = "value-start";
                    break;
                case "":
            }
        }
    }
}
