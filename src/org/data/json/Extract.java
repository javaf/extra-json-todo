// @wolfram77
package org.data.json;



class Extract implements CharSequence {
    
    // data
    final Object origin;
    final long offset;
    final int length;
    String value;
    
    
    // create extract
    public Extract(Object origin, long offset, int length) {
        this.origin = origin;
        this.offset = offset;
        this.length = length;
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
        return length;
    }
    
    
    // get character
    @Override
    public char charAt(int index) {
        if(value != null) return value.charAt(index);
        return ((CharSequence)origin).charAt((int)offset+index);
    }
    
    
    // get a smaller extract
    @Override
    public Extract subSequence(int start, int end) {
        return new Extract(origin, this.offset+start, end-start);
    }
    
    
    // convert to string
    @Override
    public String toString() {
        if(value != null) return value;
        return ((CharSequence)origin).subSequence((int)offset, (int)offset+length).toString();
    }
}
