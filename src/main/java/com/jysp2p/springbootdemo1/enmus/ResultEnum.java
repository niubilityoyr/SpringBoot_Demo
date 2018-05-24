package com.jysp2p.springbootdemo1.enmus;

import lombok.Getter;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/24 0024上午 8:50
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数异常"),

    URL_NOT_FIND(404, "url未找到"),

    SERVER_ERROR(500, "服务器异常"),

    UNKNOWN_ERROR(600, "未知错误");



    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
