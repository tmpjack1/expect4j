/*
 * StringPair.java
 *
 * Created on March 7, 2007, 9:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j;

import java.io.*;

/**
 *
 * @author justin
 */
public class StringPair implements IOPair {
    StringBuffer outBuffer;
    StringReader is;
    StringWriter os;
    
    /** Creates a new instance of StringPair */
    public StringPair(String baseStr) {
        is = new StringReader(baseStr);
        os = new StringWriter();
    }
    
    public Reader getReader() { return is; }
    public Writer getWriter() { return os; }
    
    public String getResult() {
        os.flush();
        return os.getBuffer().toString();
    }
    
    /**
     * TODO evaluate if this is even needed
     */
    public void reset() {
        try {
            os.flush();
            os = new StringWriter();
            is.reset();
        }catch(IOException ioe) {
        }
    }
    
    public void close() {
        try { is.close(); } catch(Exception e) { }
        try { os.close(); } catch(Exception e) { }
    }
    
}
