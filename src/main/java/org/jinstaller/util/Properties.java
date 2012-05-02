/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.util;

import java.io.File;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luis
 */
public class Properties {

    private static final Map<String, String> properties= new LinkedHashMap<String, String>();

    static {

        List<String> string = FileUtil.readString("data.prop");

        //additing default values

        properties.put("licence", "licence.txt");
        properties.put("terms", "licence.txt");
        properties.put("left-image", "left-image.png");
        properties.put("welcome-image", "welcome-image.png");
        properties.put("welcome-image", "welcome-image.png");
        properties.put("installaction-folder", System.getProperty("user.dir"));

        properties.put("data-folder", "files");


        String key;
        String value;
        for (String str : string) {
            String[] split = str.split("=");
            if (split.length == 0) {
                throw new MalformedParameterizedTypeException();
            }
            key = split[0];
            if (split.length == 2) {
                value = split[1];
            } else {
                value = null;
            }
            if (value!= null && !value.startsWith("#")) {
                properties.put(key, value);
            }

        }

    }

    public static String getProperty(String property) {
        return properties.get(property);
    }

    protected static Map<String, String> getProperties() {
        return properties;
    }

    public static void put(String key, String value) {
        properties.put(key, value);
    }
}
