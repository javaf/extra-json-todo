// @wolfram77
package org.data.json;

// required modules
import java.util.*;
import java.io.*;



public class Jap extends HashMap<String, Object> implements Json {
    
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
        try { return to(new StringBuilder()).toString(); }
        catch(IOException e) { throw new RuntimeException(e); }
    }
    
    
    /**
     * Write JSON to appendable object.
     * @param out appendable object
     * @return appendable object (same as input)
     * @throws IOException 
     */
    @Override
    public Appendable to(Appendable out) throws IOException {
        out.append('{');
        Set<Map.Entry<String, Object>> entrySet = entrySet();
        int i = 0, end = entrySet.size() - 1;
        for(Map.Entry<String, Object> o : entrySet) {
            Object val = o.getValue();
            out.append('\"').append(o.getKey()).append("\":");
            if(val instanceof CharSequence) out.append('\"').append((CharSequence)val).append('\"');
            else if(val instanceof Json) ((Json)val).to(out);
            else out.append(val!=null? val.toString() : "null");
            if(i != end) out.append(',');
            i++;
        }
        return out.append('}');
    }
}
