package com.bf.demo.dao;

import com.bf.demo.model.User;
import com.bf.jpa.IBaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends IBaseDao<User, Long> {
    User getByName(String name);
}
