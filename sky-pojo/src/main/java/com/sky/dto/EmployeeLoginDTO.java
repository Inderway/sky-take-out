package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "员工登录时传递的数据模型") //Swagger注解，说明实体
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名") // Swagger注解，描述实体属性
    private String username;

    @ApiModelProperty("密码")
    private String password;

}
