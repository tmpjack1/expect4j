/*
 * MatchFound.java
 *
 * Created on January 9, 2007, 6:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j;

/**
 * Small bean to hold the results from a match. Maybe extends to hold multiple 
 * match patterns. Existance of this object implies a match, to show a no match
 * use a null.
 *
 * @author justin
 */
public class MatchFound {
    int posEndOfMatch; // to know where to cut off the buffer
}
