/*
 * Closure.java
 *
 * Created on November 21, 2006, 7:10 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j;

/**
 *
 * @author justin
 */
public interface Closure {
    public void run(ExpectState state) throws Exception;
}
