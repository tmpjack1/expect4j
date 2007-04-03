/*
 * PatternPair.java
 *
 * Created on November 20, 2006, 9:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j.matches;

import expect4j.*;
import org.apache.oro.text.regex.*;

/**
 *
 * @author justin
 */
public abstract class PatternPair extends Match {
    
    String patternStr;
    Pattern pattern;        
    
    /**
     * Creates a new instance of PatternPair
     */
    public PatternPair(String patternStr, Closure closure) throws MalformedPatternException {
        super(closure);
        this.patternStr = patternStr;
        pattern = compilePattern(patternStr);
    }        
    
    abstract public Pattern compilePattern(String patternStr) throws MalformedPatternException;
    
    public Pattern getPattern() {
        return pattern;
    }
}
