// @wolfram77
package main;

// required modules
import org.data.json.*;



public class Main {
    
    public static void main(String[] args) {
        Text text = new Text("0x11                 ", 0, 15);
        System.out.println("text = "+text);
        Parser parser = new Parser();
        ParseToken token = parser.number(text);
        System.out.println("token = "+token);
    }
}
