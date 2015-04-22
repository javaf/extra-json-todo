// @wolfram77
package org.data.json;

// required modules
import java.util.*;



public class Jap extends HashMap<String, Object> {
    
    // data
    Deque<Object> state;
    Extract unparsed;
    Object object;
    
    
    // http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_Escape_Sequences.htm
    private char parseEscapeSequence(Extract text) {
        for(int i=1; i<text.length(); i++) {
            char c = text.charAt(i);
            if(c == 'n') return '\n';
            if(c == 't') return '\t';
            if(c == 'b') return '\b';
            if(c == 'f') return '\f';
            if(c == 'r') return '\r';
            
        }
        return '\0';
    }
    
    private String parseString() {
        char start = unparsed.charAt(0);
        for(int i=1; i<unparsed.length(); i++) {
            char c = unparsed.charAt(i);
            if(c=='\\')
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
