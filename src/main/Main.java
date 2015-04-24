// @wolfram77
package main;

// required modules
import org.data.json.*;



public class Main {
    
    public static void main(String[] args) {
        Jist jist = new Jist();
        System.out.println(jist);
        jist.add(null);
        System.out.println(jist);
        jist.add(false);
        System.out.println(jist);
        jist.add(1);
        System.out.println(jist);
        jist.add("1");
        System.out.println(jist);
        jist.add(new Jap());
        System.out.println(jist);
        Jap jap = new Jap();
        System.out.println(jap);
        jap.put("0", null);
        System.out.println(jap);
        jap.put("1", false);
        System.out.println(jap);
        jap.put("2", 1);
        System.out.println(jap);
        jap.put("3", "1");
        System.out.println(jap);
        jap.put("4", new Jist());
        System.out.println(jap);
    }
}
