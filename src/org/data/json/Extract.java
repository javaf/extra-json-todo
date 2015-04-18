// @wolfram77
package org.data.json;

// required modules
import java.io.*;



class Extract implements CharSequence {

    // data
    Object source;
    int offset;
    int length;
    
    @Override
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
        return null;
    }

    @Override
    public char charAt(int index) {
        return '\0';
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
