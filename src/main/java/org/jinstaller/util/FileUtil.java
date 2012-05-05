/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class FileUtil {

    public static List<String> readString(String path) {
        List<String> string = new ArrayList<String>();
        if (!path.startsWith("/") && !path.toLowerCase().startsWith("c")
                || !path.toLowerCase().startsWith("d")
                || !path.toLowerCase().startsWith("e")
                || !path.toLowerCase().startsWith("f")) {
            try {
                path = new File(".").getCanonicalPath()
                        + System.getProperty("file.separator") + path;
            } catch (IOException ex) {
                Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        try {

            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            String s;
            while ((s = reader.readLine()) != null) {
                string.add(s);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return string;
    }

    public static String readText(String path) {
        List<String> txt = readString(path);
        StringBuilder b = new StringBuilder();
        for (String s : txt) {
            b.append(s).append("\n");
        }
        return b.toString();
    }
    public static void copyFile(String original,String target){
        copyFile(new File(original), new File(target));
    }
    public static void copyFile(File original, File target) {
        
        try {
            InputStream in = new FileInputStream(original);

            OutputStream out = new FileOutputStream(target);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
            Logger.getLogger(FileUtil.class.getSimpleName()).log(Level.INFO, 
                    "Coping file:{0}", original.getCanonicalPath());
            Logger.getLogger(FileUtil.class.getSimpleName()).log(Level.INFO, 
                    "to:{0}", target.getCanonicalPath());
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
            System.exit(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void writeToFile(File file, String text) throws FileNotFoundException, IOException{
        OutputStream w = new FileOutputStream(file);
        
        w.write(text.getBytes());
        w.close();
        
    }
}
