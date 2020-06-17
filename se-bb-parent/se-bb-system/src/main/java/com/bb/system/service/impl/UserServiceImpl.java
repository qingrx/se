package com.bb.system.service.impl;
import com.bb.system.dao.IUserDao;
import com.bb.system.model.User;
import com.bb.system.service.IUserService;
import com.bf.jpa.IBaseDao;
import com.bf.jpa.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public IBaseDao getDao() {
        return userDao;
    }
}
