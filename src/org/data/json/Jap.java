// @wolfram77
package org.data.json;

// required modules
import java.util.*;



public class Jap extends HashMap<String, Object> {
    
    
    
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
