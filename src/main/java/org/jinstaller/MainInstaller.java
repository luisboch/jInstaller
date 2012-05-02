/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller;

import java.awt.Cursor;

/**
 *
 * @author luis
 */
public interface MainInstaller {
    void changeMessage(String message);
    void forceContine();
    void lock();
    void unlock();
    void changeTitle(String title);
    void setCursor(int cursor);
}
