/*
 * StreamPair.java
 *
 * Created on November 20, 2006, 8:52 PM
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
public class StreamPair implements IOPair {
    Reader is;
    Writer os;
    
    /** Creates a new instance of ReaderConsumer */
    public StreamPair(InputStream is, OutputStream os ) {
        this.is = new InputStreamReader(is );
        this.os = new OutputStreamWriter( os );
    }
    
    public Reader getReader() {
        return is;
    }
    
    public Writer getWriter() {
        return os;
    }
    
    /**
     * TODO evaluate if this is even needed
     */
    public void reset() {
        try {
            is.reset();
        }catch(IOException ioe) {
        }
    }
    
    public void close() {
        try { is.close(); } catch(Exception e) { }
        try { os.close(); } catch(Exception e) { }
    }
}
