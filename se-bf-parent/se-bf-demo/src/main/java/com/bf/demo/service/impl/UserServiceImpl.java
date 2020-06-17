package com.bf.demo.service.impl;

import com.bf.demo.dao.IUserDao;
import com.bf.demo.model.User;
import com.bf.demo.service.IUserService;
import com.bf.jpa.IBaseDao;
import com.bf.jpa.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public IBaseDao getDao() {
        return userDao;
    }
}
