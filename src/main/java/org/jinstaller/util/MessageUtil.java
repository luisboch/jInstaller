/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jinstaller.util;

import java.util.Map;

/**
 *
 * @author luis
 */
public class MessageUtil {
     public static String getMessage(String message){
        Map<String,String> props = Properties.getProperties();

        for(String key:props.keySet()){
            message = message.replaceAll("%"+key+"%", props.get(key));
        }
        
        return message;
    }
}
