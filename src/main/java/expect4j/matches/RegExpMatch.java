/*
 * RegExpMatch.java
 *
 * Created on November 20, 2006, 9:44 PM
 *
 */

package expect4j.matches;

import expect4j.*;
import org.apache.oro.text.regex.*;

/**
 * Simulates "expect { -regexp {..*} { code } }
 *
 * @author justin
 */
public class RegExpMatch extends PatternPair {

    /** Creates a new instance of RegExpMatch */
    public RegExpMatch(String patternStr, Closure closure) throws MalformedPatternException {
        super(patternStr, closure);
    }
    
    protected static Perl5Compiler compiler;
    public Perl5Compiler getCompiler() {
        if( compiler == null)
            compiler = new Perl5Compiler();
        return compiler;
    }
    
    public Pattern compilePattern(String patternStr) throws MalformedPatternException  {
        Perl5Compiler compiler = getCompiler();
        return compiler.compile(patternStr, Perl5Compiler.DEFAULT_MASK|Perl5Compiler.SINGLELINE_MASK); // |Perl5Compiler.MULTILINE_MASK
    }
}
