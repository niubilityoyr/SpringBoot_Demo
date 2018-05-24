package com.jysp2p.springbootdemo1.handler;

import com.jysp2p.springbootdemo1.VO.ResultVO;
import com.jysp2p.springbootdemo1.enmus.ResultEnum;
import com.jysp2p.springbootdemo1.exception.MyException;
import com.jysp2p.springbootdemo1.utils.ResultVoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;


/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 1:56
 */
@Slf4j
@ControllerAdvice   //这是一个全局异常处理类
public class MyExceptionHandler {

    /**
     * 指定处理MyException的异常
     * @param e
     * @return
     */
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ResultVO handle1(MyException e){
        return ResultVoUtil.error(e.getCode(), e.getMessage());
    }

    /**
     *处理400 500 异常等
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO defaultErrorHandle(Exception e){
        ResultVO resultVO = null;
        if(e instanceof NoHandlerFoundException){
            //404异常
            log.error("404 error:{}", e.getMessage());
            resultVO = ResultVoUtil.error(ResultEnum.URL_NOT_FIND.getCode(), ResultEnum.URL_NOT_FIND.getMessage());
        }else if(e instanceof ConstraintViolationException){
            //500异常
            log.error("500 error:{}", e.getMessage());
            resultVO = ResultVoUtil.error(ResultEnum.SERVER_ERROR.getCode(), ResultEnum.SERVER_ERROR.getMessage());
        }else{
            //未知异常
            log.error("未知错误 error:{}", e.getMessage());
            resultVO = ResultVoUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMessage());
        }
        return resultVO;
    }

}
