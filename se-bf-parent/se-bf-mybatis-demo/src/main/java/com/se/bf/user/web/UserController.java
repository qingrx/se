package com.se.bf.user.web;

import com.alibaba.fastjson.JSONObject;
import com.se.bf.user.service.IUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("user")
@RestController
public class UserController{

    @Autowired
    private IUserService userService;

    /**
     * 得到最新版本
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "得到最新版本", notes = "得到最新版本")
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getById(
            @ApiParam(value = "ID", required = true) @PathVariable Long id) {
        JSONObject datas = new JSONObject();
        datas.put("users",userService.get(id));
        return datas;
    }




}
