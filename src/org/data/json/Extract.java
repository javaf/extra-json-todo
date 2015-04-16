// @wolfram77
package org.data.json;

// required modules
import java.io.*;



class Extract {
    
    // data
    Object source;
    int offset;
    int length;
    
    public int length() {
        return length;
    }

    public char take(int off) throws IOException {
        if(source instanceof CharSequence) {
            offset += off+1;
            length -= off+1;
            return ((CharSequence)source).charAt(offset);
        }
        BufferedReader bsrc = (BufferedReader)source;
        if(off > 0) bsrc.skip(off);
        return (char)bsrc.read();
    }
    
    public String take(int off, int len) {
        if(source instanceof CharSequence) {
            offset += off+1;
            length -= off+1;
        }
        FileReader f = new FileReader(null);
        File fd;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
