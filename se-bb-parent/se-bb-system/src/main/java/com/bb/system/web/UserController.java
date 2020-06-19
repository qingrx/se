package com.bb.system.web;

import com.alibaba.fastjson.JSONObject;
import com.bb.system.model.User;
import com.bb.system.service.IUserService;
import com.bf.core.utils.pay.FastJsonUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @ApiOperation(value = "根据主键查询用户对象", notes = "主键为Long类型")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "用户id",defaultValue = "0")})
    @GetMapping(value = "/getById/{id}")
    public JSONObject unFinishCheckPoint(
            @ApiParam(value = "ID", required = true) @PathVariable Long id) {
        User u = userService.getById(id);
        return JSONObject.parseObject(FastJsonUtil.toJSONString(u));
    }
}
