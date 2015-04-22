// @wolfram77
package org.data.json;

// required modules
import java.util.*;



public class Jap extends HashMap<String, Object> {
    
    // data
    Deque<Object> state;
    Part unparsed;
    Object object;
    
    
    // http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_Escape_Sequences.htm
    private ParseToken parseEscapeSequence(Part text) {
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
    
    private String parseString() {
        char start = unparsed.charAt(0);
        for(int i=1; i<unparsed.length(); i++) {
            char c = unparsed.charAt(i);
        }
        return null;
    }
    
    
    private void parseTill() {
        for(int i=0; i<unparsed.length(); i++) {
            
        }
    }
    
    public Jap() {
        super();
    }
    
    public Jap(Map<String, ?> map) {
        super(map);
    }
    
    public Jap(String s) {
    }
    
    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("{");
        for(Map.Entry<String, Object> o : entrySet()) {
            ans.append('\"').append(o.getKey()).append("\":");
            if(!(o.getValue() instanceof CharSequence)) ans.append(o.getValue());
            else ans.append("\"").append(o.getValue()).append("\"");
            ans.append(",");
        }
        if(ans.length() > 1) ans.setLength(ans.length()-1);
        return ans.append("}").toString();
    }
}
