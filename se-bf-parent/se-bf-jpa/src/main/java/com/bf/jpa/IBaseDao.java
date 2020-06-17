package com.bf.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseDao<T, ID> extends JpaRepository<T, ID> {

}
