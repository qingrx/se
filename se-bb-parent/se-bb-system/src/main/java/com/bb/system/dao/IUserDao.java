package com.bb.system.dao;

import com.bb.system.model.User;
import com.bf.jpa.IBaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends IBaseDao<User,Long> {
    User getByName(String name);
}
