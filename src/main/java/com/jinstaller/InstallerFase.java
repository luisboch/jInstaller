/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jinstaller;

/**
 *
 * @author luis
 */
public interface InstallerFase {
    boolean onContinue();
    void prepare();
    void setMainInstaller(MainInstaller main);
}
