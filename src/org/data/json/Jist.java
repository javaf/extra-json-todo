// @wolfram77
package org.data.json;

// required modules
import java.io.*;
import java.util.*;



public class Jist extends ArrayList<Object> implements Json {
    
    
    public Jist() {
        super();
    }
    
    public Jist(Collection<? extends Object> coll) {
        super(coll);
    }
    
    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder().append("[");
        for(Object o : this) {
            if(!(o instanceof CharSequence)) ans.append(o);
            else ans.append("\"").append(o).append("\"");
            ans.append(",");
        }
        if(ans.length() > 1) ans.setLength(ans.length()-1);
        return ans.append("]").toString();
    }
    
    
    /**
     * Write JSON to appendable object.
     * @param out appendable object
     * @return appendable object (same as input)
     * @throws IOException 
     */
    @Override
    public Appendable to(Appendable out) throws IOException {
        out.append('[');
        int i = 0, end = size() - 1;
        for(Object val : this) {
            if(val instanceof CharSequence) out.append('\"').append((CharSequence)val).append('\"');
            else if(val instanceof Json) ((Json)val).to(out);
            else out.append(val!=null? val.toString() : "null");
            if(i != end) out.append(',');
            i++;
        }
        return out.append(']');
    }
}
