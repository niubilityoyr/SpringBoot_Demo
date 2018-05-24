package com.jysp2p.springbootdemo1.utils;

import com.jysp2p.springbootdemo1.VO.ResultVO;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 2:40
 */
public class ResultVoUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }


    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
