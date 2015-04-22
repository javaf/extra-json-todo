// @wolfram77
package org.data.json;

// required modules
import java.util.*;



public class Jap extends HashMap<String, Object> {
    
    // data
    Deque<Object> state;
    Text unparsed;
    Object object;
    
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
