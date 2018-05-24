package com.jysp2p.springbootdemo1.controller;

import com.jysp2p.springbootdemo1.QO.UserQO;
import com.jysp2p.springbootdemo1.VO.ResultVO;
import com.jysp2p.springbootdemo1.enmus.ResultEnum;
import com.jysp2p.springbootdemo1.exception.MyException;
import com.jysp2p.springbootdemo1.pojo.User;
import com.jysp2p.springbootdemo1.service.UserService;
import com.jysp2p.springbootdemo1.utils.ResultVoUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 2:07
 */
@Api(tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService service;


    @ApiOperation(httpMethod = "POST", value = "新增用户")
    @RequestMapping(method = RequestMethod.POST)
    public ResultVO save(@Valid UserQO user, BindingResult result){
        if(result.hasErrors()){
            throw new MyException(ResultEnum.PARAM_ERROR.getCode(),
                    result.getFieldError().getDefaultMessage());
        }
        return ResultVoUtil.success();
    }

    @ApiOperation(httpMethod = "GET", value = "根据id查询用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResultVO findById(@PathVariable Long id){
        User user = service.findById(id);
        return ResultVoUtil.success(user);
    }

}
