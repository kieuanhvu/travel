package com.hitex.mobicastutil.constant;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.util.ReflectionUtils;

/**
 *
 * @author MSI
 */
public class ApplicationCode {

    public static final int SUCCESS = 0;
    public static final int UNKNOW_ERROR = 1;
    public static final int WRONG_DATA_FORMAT = 2;
    public static final int API_NOT_FOUND = 3;
    
    public static final int FILE_NOT_FOUND = 4;
    
    public static final int IMAGE_INVALID = 5;

    private static final ApplicationCode instance = new ApplicationCode();
    private static final String[] messages = new String[2000];

    static {
        Field[] fields = ApplicationCode.class.getFields();
        for (Field field : fields) {
            try {
                String name = field.getName();
                int value = field.getInt(ApplicationCode.instance);
                messages[value] = name;
            } catch (Exception ex) {
                // continue
            }
        }
    }

    public static String getMessage(int code) {
        if (code >= messages.length) {
            return null;
        }
        return messages[code];
    }
    
    public static void main(String[] strs){
        System.out.println("" + getMessage(SUCCESS));
    }
}
