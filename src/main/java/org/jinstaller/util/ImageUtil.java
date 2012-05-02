/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author luis
 */
public class ImageUtil {

    public static ImageIcon getImageIcon(String path) {

        return new javax.swing.ImageIcon(getImage(path));
    }

    public static ImageIcon getRelativeImageIcon(String path) {
        try {

            File f = new File(".");
            String separator = System.getProperty("file.separator");

            path = f.getCanonicalPath() + separator + path;

            System.out.println("loading image:" + path);
            return new javax.swing.ImageIcon(getImage(path));
        } catch (Exception ex) {
        }
        return null;
    }

    public static Image getImage(String path) {
        File file = new File(path);
        try {
            return ImageIO.read(file);
        } catch (IOException ex) {
        }
        return null;
    }
}
