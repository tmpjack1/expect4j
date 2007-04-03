/*
 * ConsumerImpl.java
 *
 * Created on March 15, 2007, 10:54 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j;

import java.util.logging.*;
import java.io.Writer;
import java.io.IOException;

/**
 *
 * @author justin
 */
public abstract class ConsumerImpl implements Consumer {
    static final public Logger log = Logger.getLogger(ConsumerImpl.class.getName());
    
    public static final int BUFFERMAX = 16 * 1024;
    
    StringBuffer buffer;
    
    IOPair pair;
    boolean stopRequested = false;
    boolean foundEOF = false;
    
    /** Creates a new instance of ConsumerImpl */
    public ConsumerImpl(IOPair pair) {
        this.pair = pair;
        buffer = new StringBuffer();
    }
    
    /**
     * A few easy functions that a generic Consumer can do for its children
     */
    // TODO add some synch
    public void send(String str) throws IOException {
        String printStr = str;
        printStr = printStr.replaceAll("\\r", "\\\\r");
        printStr = printStr.replaceAll("\\n", "\\\\n");
        
        log.fine("Sending: >>>" + printStr + "<<<");
        Writer writer = pair.getWriter();
        writer.write( str );
        writer.flush();
    }
    
    public void resume() {
        resume(-1);
    }
    
    public void stop() {
        log.fine("Requesting stop");
        stopRequested = true;
    }
    
    public boolean foundEOF() {
        return foundEOF;
    }
}
