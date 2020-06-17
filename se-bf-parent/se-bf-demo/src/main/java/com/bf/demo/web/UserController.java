package com.bf.demo.web;

import com.alibaba.fastjson.JSONObject;
import com.bf.core.utils.pay.FastJsonUtil;
import com.bf.demo.model.User;
import com.bf.demo.service.IUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "根据主键查询用户对象", notes = "主键为Long类型")
    @GetMapping(value = "/getById/{id}")
    public JSONObject unFinishCheckPoint(
            @ApiParam(value = "ID", required = true) @PathVariable Long id) {
        User u = userService.getById(1l);
        return JSONObject.parseObject(FastJsonUtil.toJSONString(u));
    }
}
