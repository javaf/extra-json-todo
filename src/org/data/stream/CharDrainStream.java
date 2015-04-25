// @wolfram77
package org.data.stream;

// required modules
import java.io.*;
import java.nio.charset.*;



public class CharDrainStream extends BufferedWriter {
    
    public CharDrainStream(Writer out) {
        super(out);
    }
    
    public CharDrainStream(OutputStream out, CharsetEncoder enc) {
        super(new OutputStreamWriter(out, enc));
    }
    
    public CharDrainStream(OutputStream out, Charset cs) {
        super(new OutputStreamWriter(out, cs));
    }
    
    public CharDrainStream(OutputStream out) {
        super(new OutputStreamWriter(out));
    }
    
    public CharDrainStream(File out, Charset cs) throws FileNotFoundException {
        super(new OutputStreamWriter(new FileOutputStream(out), cs));
    }
    
    public CharDrainStream(File out) throws FileNotFoundException {
        super(new OutputStreamWriter(new FileOutputStream(out)));
    }
}
