// @wolfram77
package org.data.json;

// required modules
import java.util.*;



// suggest json -> jap / jmap
// suggest jsonlist -> jist / jlist
public class Jap extends HashMap<String, Object> {
    
    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("{");
        for(Map.Entry<String, Object> o : entrySet()) {
            ans.append('\"').append(o.getKey()).append("\":");
            ans.append(o.getValue()).append(",");
        }
        if(ans.length() > 1) ans.deleteCharAt(ans.length()-1);
        ans.append("}");
        return ans.toString();
    }
}
