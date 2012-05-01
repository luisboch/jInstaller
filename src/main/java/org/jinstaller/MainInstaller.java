/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller;

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
}
