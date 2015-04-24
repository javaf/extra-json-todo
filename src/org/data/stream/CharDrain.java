// @wolfram77
package org.data.stream;

// required modules
import java.io.*;
import java.nio.charset.*;



public class CharDrain extends BufferedWriter {
    
    public CharDrain(Writer out) {
        super(out);
    }
    
    public CharDrain(OutputStream out, CharsetEncoder enc) {
        super(new OutputStreamWriter(out, enc));
    }
    
    public CharDrain(OutputStream out, Charset cs) {
        super(new OutputStreamWriter(out, cs));
    }
    
    public CharDrain(OutputStream out) {
        super(new OutputStreamWriter(out));
    }
    
    public CharDrain(File out, Charset cs) throws FileNotFoundException {
        super(new OutputStreamWriter(new FileOutputStream(out), cs));
    }
    
    public CharDrain(File out) throws FileNotFoundException {
        super(new OutputStreamWriter(new FileOutputStream(out)));
    }
}
