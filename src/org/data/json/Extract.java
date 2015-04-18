// @wolfram77
package org.data.json;

// required modules
import java.io.*;


// String, StringBuilder/Buffer, File, InputStream
// StringBuilder/Buffer, File, OutputStream
class Extract implements CharSequence {
    
    // data
    String val;
    Object obj;
    int off, len;
    
    public Extract(Object obj, int off, int len) {
        this.obj = obj;
        this.off = off;
        this.len = len;
    }
    
    @Override
    public int length() {
        return len;
    }

    @Override
    public char charAt(int index) {
        return '\0';
    }

    @Override
    public Extract subSequence(int start, int end) {
        return new Extract(obj, off+start, off+end-start);
    }
    
    @Override
    public String toString() {
        if(val != null) return val;
        if(obj instanceof CharSequence) val = ((CharSequence)obj).subSequence(off, off+len).toString();
        File a;
        return null;
    }
}
