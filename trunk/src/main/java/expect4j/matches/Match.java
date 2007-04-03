/*
 * Match.java
 *
 * Created on November 30, 2006, 8:56 AM
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
public class Match {
    
    Closure closure;
    
    /** Creates a new instance of EofMatch */
    public Match(Closure closure) {
        this.closure = closure;
    }

    public Match() {
        this.closure = null;
    }

    public Closure getClosure() {
        return closure;
    }
}
