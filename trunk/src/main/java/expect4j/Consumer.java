/*
 * Consumer.java
 *
 * Created on March 14, 2007, 9:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package expect4j;

import java.io.IOException;

/**
 *
 * @author justin
 */
public interface Consumer extends Runnable {
    public void run();
    public void waitForBuffer(long timeoutMilli);
    public void send(String str) throws IOException;
    public String pause();
    public void resume();
    public void resume(int offset);
    public void stop();
    public boolean foundEOF();    
}
