/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.panels;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.jinstaller.InstallerFase;
import org.jinstaller.MainInstaller;
import org.jinstaller.util.Properties;
import org.jinstaller.util.ImageUtil;

/**
 *
 * @author luis
 */
public class JPanelStart extends javax.swing.JPanel implements InstallerFase{

    MainInstaller main;
    ImageIcon welcomeImage = null;
    /**
     * Creates new form JPanelStart
     */
    public JPanelStart() {
        welcomeImage = ImageUtil.getRelativeImageIcon(Properties.getProperty("welcome-image"));
        
        if(welcomeImage == null){
            welcomeImage = new ImageIcon(getClass().getResource("/org/jinstaller/resources/start.png"));
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(650, 250));
        setMinimumSize(new java.awt.Dimension(650, 250));
        setPreferredSize(new java.awt.Dimension(650, 250));

        jLabel1.setIcon(welcomeImage);
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public boolean onContinue() {
        return true;
    }

    public void prepare() {
       setVisible(true);
       main.changeMessage(Properties.getProperty("welcome-message"));
       main.changeTitle("Welcome!");
    }
    
    public void setMainInstaller(MainInstaller main) {
        this.main = main;
    }

    public JPanel getPanel() {
        return this;
    }
}
