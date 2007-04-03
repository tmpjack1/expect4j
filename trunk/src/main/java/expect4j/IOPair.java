/*
 * IOPair.java
 *
 * Created on November 20, 2006, 8:50 PM
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
public interface IOPair {
    public Reader getReader();
    public Writer getWriter();
    public void reset();
    public void close();
}
