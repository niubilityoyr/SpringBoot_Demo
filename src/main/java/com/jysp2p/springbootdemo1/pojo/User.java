package com.jysp2p.springbootdemo1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import java.io.Serializable;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 1:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{

    private Long id;

    private String name;

    private String sex;

    private Integer age;

}
