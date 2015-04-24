// @wolfram77
package org.data.json;

// required modules
import java.util.*;
import java.io.*;



public class Jap extends HashMap<String, Object> {
    
    // data
    Deque<Object> state;
    Text unparsed;
    Object object;
    
    
    private void parseFast(String in) {
        String state = "default";
        switch(state) {
            case "default":
                break;
            case "property":
                break;
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
        StringBuilder ans = new StringBuilder();
        try {
            serialize(ans);
            return ans.toString();
        }
        catch(IOException e) { throw new RuntimeException(e); }
    }
    
    void serialize(Appendable out) throws IOException {
        out.append('{');
        Set<Map.Entry<String, Object>> entrySet = entrySet();
        int i = 0, end = entrySet.size() - 1;
        for(Map.Entry<String, Object> o : entrySet) {
            out.append('\"').append(o.getKey()).append("\":");
            if(!(o.getValue() instanceof CharSequence)) out.append(o.getValue().toString());
            else out.append('\"').append((CharSequence)o.getValue()).append('\"');
            if(i != end) out.append(',');
            i++;
        }
        out.append('}');
    }
}
