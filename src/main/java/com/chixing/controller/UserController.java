package com.chixing.controller;

import com.chixing.common.Const;
import com.chixing.pojo.Register;
import com.chixing.service.RegisterService;
import com.guanweiming.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户接口")
@AllArgsConstructor
@RequestMapping( "user")
public class UserController {

    private RegisterService registerService;
    @ApiOperation("注册用户接口")
    @PostMapping("register")
    public Result<Register> register(@RequestParam String tel,
                                 @RequestParam String password){
        return registerService.addUser(tel, password);

    }

}
