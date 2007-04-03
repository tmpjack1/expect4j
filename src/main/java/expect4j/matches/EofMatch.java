/*
 * EofMatch.java
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
public class EofMatch extends Match {
    public EofMatch(Closure closure) {
        super(closure);
    }

    public EofMatch() {
        super();
    }
}
