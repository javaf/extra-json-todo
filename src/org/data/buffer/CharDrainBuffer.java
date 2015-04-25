// @wolfram77
package org.data.buffer;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;



public class CharDrainBuffer implements Appendable {
    
    // data
    final CharsetEncoder enc;
    final ByteBuffer out;
    
    public CharDrainBuffer(ByteBuffer out, CharsetEncoder enc) {
        this.out = out;
        this.enc = enc;
    }
    
    public CharDrainBuffer(ByteBuffer out, Charset cs) {
        this(out, cs.newEncoder());
    }
    
    @Override
    public Appendable append(CharSequence csq) throws IOException {
        return this;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return this;
    }
    
    
}
