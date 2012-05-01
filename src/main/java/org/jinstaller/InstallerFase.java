/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller;

import javax.swing.JPanel;

/**
 *
 * @author luis
 */
public interface InstallerFase {
    boolean onContinue();
    void prepare();
    void setMainInstaller(MainInstaller main);
    JPanel getPanel();
}
