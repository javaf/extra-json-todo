// @wolfram77
package org.data.json;

// required modules
import java.io.*;
import java.nio.charset.Charset;


/*
Extract should be able to perform additions, and deletions
(static) For a given object(file) and a list of delection pos, len
(static) For a given object(file) and a list of addition pso, values
(stream) scan and dump in output, unless change required
*/
// String, StringBuilder/Buffer, File, InputStream
// StringBuilder/Buffer, File, OutputStream
class Extract implements CharSequence {
    
    // data
    BufferedReader buff;
    final Object origin;
    final long offset;
    final int length;
    String value;
    
    
    // read bytes from file
    private static byte[] readFile(File file, long offset, int length) {
        RandomAccessFile fread = null;
        try {
            fread = new RandomAccessFile(file, "r");
            fread.seek(offset);
            byte[] data = new byte[length];
            fread.read(data);
            fread.close();
            return data;
        }
        catch(Exception e) {
            try { if(fread != null) fread.close(); }
            catch(Exception ex) {}
            throw new RuntimeException(e);
        }
    }
    
    
    // remove bytes from file
    private static void fileRemove(File file, long offset, int length) {
        RandomAccessFile fread = null;
        try {
            fread = new RandomAccessFile(file, "r");
            fread.seek(offset);
            byte[] data = new byte[length];
            fread.read(data);
            fread.close();
            return data;
        }
        catch(Exception e) {
            try { if(fread != null) fread.close(); }
            catch(Exception ex) {}
            throw new RuntimeException(e);
        }
    }
    
    
    // create extract from a given object
    public Extract(Object origin, int start, int end) {
        this.origin = origin;
        this.start = start;
        this.end = end;
    }
    
    
    // set the value of extract
    public Extract set(String value) {
        this.value = value;
        return this;
    }

    
    // get the value of extract
    public String get() {
        return (value = toString());
    }
    
    
    // get length of extract
    @Override
    public int length() {
        return end - start;
    }

    
    
    @Override
    public char charAt(int index) {
        return '\0';
    }

    @Override
    public Extract subSequence(int start, int end) {
        return new Extract(origin, this.start+start, this.start+end);
    }
    
    @Override
    public String toString() {
        if(value != null) return value;
        if(origin instanceof CharSequence) return ((CharSequence)origin).subSequence(start, end).toString();
        if(origin instanceof File) return File
    }
}
