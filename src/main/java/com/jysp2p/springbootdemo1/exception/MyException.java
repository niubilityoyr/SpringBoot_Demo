package com.jysp2p.springbootdemo1.exception;

import com.jysp2p.springbootdemo1.enmus.ResultEnum;
import lombok.Getter;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 1:50
 */
@Getter
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(Integer code, String message){
        super(message);
        this.code=code;
    }

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
