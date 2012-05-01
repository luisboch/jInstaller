/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.util;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jinstaller.util.FileUtil;

/**
 *
 * @author luis
 */
public class Properties {

    private static Map<String, String> properties;

    static {
        properties = new LinkedHashMap<String, String>();

        List<String> string = FileUtil.readString("data.prop");

        //additing default values

        properties.put("licence", "licence.txt");
        properties.put("terms", "licence.txt");
        properties.put("left-image", "left-image.png");
        properties.put("welcome-image", "welcome-image.png");


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
            properties.put(key, value);

        }

    }

    public static String getPropertie(String property) {
        return properties.get(property);
    }
    protected static Map<String,String> getProperties(){
        return properties;
    }
    
    public static void put(String key, String value){
        properties.put(key, value);
    }
}
