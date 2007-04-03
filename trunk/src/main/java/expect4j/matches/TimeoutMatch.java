/*
 * TimeoutMatch.java
 *
 * Created on November 20, 2006, 9:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j.matches;

import expect4j.*;

/**
 *
 * @author justin
 */
public class TimeoutMatch extends Match {
        
    long timeout;
    
    /** 
     * Creates a new instance of TimeoutMatch with a default timeout of 
     * ten seconds
     */
    public TimeoutMatch(Closure closure) {
        this(Expect4j.TIMEOUT_NOTSET, closure);
    }

    public TimeoutMatch(long milli, Closure closure) {
        super(closure);
        this.timeout = milli;
    }
    
    public long getTimeout() {
        return timeout;
    }

}
