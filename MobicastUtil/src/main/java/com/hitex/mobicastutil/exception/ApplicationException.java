package com.hitex.mobicastutil.exception;

import com.hitex.mobicastutil.constant.ApplicationCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 *
 * @author MSI
 */
@AllArgsConstructor
@Data
public class ApplicationException extends Exception{
    
    private int code;
    private String message;

    public ApplicationException(int code) {
        this.code = code;
    }
  
    @Override
    public String getMessage() {
        if(!StringUtils.hasText(message)){
           return ApplicationCode.getMessage(code);
        }
        return message;
    }
    
}
