// @wolfram77
package main;

// required modules
import org.data.json.*;



public class Main {
    
    public static void main(String[] args) {
        Jist jist = new Jist();
        jist.add(null);
        jist.add(false);
        jist.add(1);
        jist.add("1");
        System.out.println(jist);
    }
}
