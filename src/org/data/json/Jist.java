// @wolfram77
package org.data.json;

// required modules
import java.util.*;



public class Jist extends ArrayList<Object> {
    
    
    public Jist() {
        super();
    }
    
    public Jist(Collection<? extends Object> coll) {
        super(coll);
    }
    
    public Jist(int size) {
        super(size);
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
}
