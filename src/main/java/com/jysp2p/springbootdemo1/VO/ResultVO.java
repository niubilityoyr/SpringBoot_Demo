package com.jysp2p.springbootdemo1.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 2:38
 */
@Data
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = 3236329195874147801L;

    /** 错误码. */
    @ApiModelProperty()
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

}
