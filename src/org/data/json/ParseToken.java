// @wolfram77
package org.data.json;



/**
 * Represents a parsed token from a parser. <p>
 * Parser takes in a text, parses it, and generates
 * a parsed value, which it returns along with the length
 * of text it parsed. This is stored in a parse token. </p>
 * @author wolfram77
 */
public class ParseToken {
    
    // data
    public Object value;
    public int length;
    
    
    /**
     * Create a parse token.
     * @param value parsed value
     * @param length length of text parsed
     */
    public ParseToken(Object value, int length) {
        this.value = value;
        this.length = length;
    }
    
    
    /**
     * Convert parse token to string.
     * @return string value
     */
    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("{value=");
        ans.append(value).append(", length=").append(length).append(length).append("}");
        return ans.toString();
    }
}
