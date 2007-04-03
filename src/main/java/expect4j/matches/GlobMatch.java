/*
 * RegExpMatch.java
 *
 * Created on November 20, 2006, 9:44 PM
 *
 */

package expect4j.matches;

import expect4j.*;
import org.apache.oro.text.GlobCompiler;
import org.apache.oro.text.regex.*;

/**
 * Simulates "expect { -gl {..*} { code } }
 *
 * @author justin
 */
public class GlobMatch extends RegExpMatch {
    
    /** Creates a new instance of RegExpMatch */
    public GlobMatch(String pattern, Closure closure) throws MalformedPatternException {
        super(pattern, closure);
    }
        
    public Pattern compilePattern(String patternStr) throws MalformedPatternException {                
        int globOptions = GlobCompiler.DEFAULT_MASK | GlobCompiler.QUESTION_MATCHES_ZERO_OR_ONE_MASK;
        char [] patternCh = patternStr.toCharArray();
        String perl5PatternStr = GlobCompiler.globToPerl5(patternCh, globOptions);
        
        return super.compilePattern(perl5PatternStr);
    }
}
