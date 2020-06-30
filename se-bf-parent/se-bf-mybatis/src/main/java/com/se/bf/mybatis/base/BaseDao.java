package com.se.bf.mybatis.base;

import java.io.Serializable;
import java.util.List;

/**
 * 数据库操作基类，如果需要调用下列方法，需要在对应的mapper.xml配置
 */
public interface BaseDao<T> {
    /**
     * 删除
     * @param id 数据标识
     * @return 删除的数据条数
     */
    public int deleteByPrimaryKey(Serializable id);

    /**
     * 插入
     * @param t 插入的对象
     * @return 插入数据条数
     */
    public int insert(T t);

    /**
     * 批量插入
     * @param list 数据列表
     * @return 插入数据条数
     */
    public int insertList(List<T> list);

    /**
     * 通过id查询数据
     * @param id 数据标识
     * @return 数据对象
     */
    public T selectByPrimaryKey(Serializable id);

    /**
     * 非空条件更新
     * @param t
     * @return
     */
    public int updateByPrimaryKeySelective(T t);

    /**
     * 更新操作
     * @param t
     * @return
     */
    public int updateByPrimaryKey(T t);

    /**
     * 通过条件查询数据列表
     * @param t 查询条件
     * @return 数据列表
     */
    public List<T> getList(T t);
}
