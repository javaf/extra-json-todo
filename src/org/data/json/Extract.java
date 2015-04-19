// @wolfram77
package org.data.json;

// required modules
import java.util.*;
import java.io.*;



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
    RandomAccessFile file;
    final Object origin;
    final long offset;
    final int length;
    String value;
    
    
    // read bytes from file
    private static byte[] readFromFile(RandomAccessFile file, long offset, int length) throws IOException {
        file.seek(offset);
        byte[] data = new byte[length];
        file.read(data);
        return data;
    }
    
    private static void deleteFromFile(Collection<Extract> coll) {
        
    }
    
    
    // create extract
    public Extract(Object origin, long offset, int length) {
        this.origin = origin;
        this.offset = offset;
        this.length = length;
    }
    
    
    // get length of extract
    @Override
    public int length() {
        return length;
    }

    
    
    @Override
    public char charAt(int index) {
        return '\0';
    }

    
    // get a smaller extract
    @Override
    public Extract subSequence(int start, int end) {
        return new Extract(origin, this.offset+start, end-start);
    }
    
    
    @Override
    public String toString() {
        if(value != null) return value;
        if(origin instanceof CharSequence) return ((CharSequence)origin).subSequence((int)offset, (int)offset+length).toString();
        return null;
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
}
