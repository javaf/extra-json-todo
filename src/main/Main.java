// @wolfram77
package main;

// required modules
import org.data.json.*;



public class Main {
    
    public static void main(String[] args) {
        Text text = new Text("\\uabcd", 0, 6);
        System.out.println("text = "+text);
        Parser parser = new Parser();
        ParseToken token = parser.escSeq(text);
        System.out.println("token = "+token);
    }
}
