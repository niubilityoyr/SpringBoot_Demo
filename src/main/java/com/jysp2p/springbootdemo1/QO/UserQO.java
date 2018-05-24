package com.jysp2p.springbootdemo1.QO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 2:47
 */
@ApiModel(value = "前台传值给后台的用户对象")
@Data
public class UserQO {

    @ApiModelProperty(required = true, value = "用户名", dataType = "String")
    @NotBlank(message = "用户名不能为空")
    private String name;

    @ApiModelProperty(required = true, value = "性别", dataType = "String")
    @NotBlank(message = "性别不能为空")
    @Length(min = 1, max = 1, message = "请输入正确的性别")
    private String sex;

    @ApiModelProperty(required = true, value = "年龄", dataType = "Integer")
    @NotNull(message = "请输入年龄")
    @Min(value = 0, message = "请输入正确的年龄")
    @Max(value = 120, message = "请输入正确的年龄")
    private Integer age;


}
