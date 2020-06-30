package com.se.bf.user.service.impl;

import com.se.bf.mybatis.base.BaseDao;
import com.se.bf.mybatis.base.impl.BaseServiceImpl;
import com.se.bf.user.mapper.UserMapper;
import com.se.bf.user.model.User;
import com.se.bf.user.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseDao<User> getDao() {
        return userMapper;
    }
}
