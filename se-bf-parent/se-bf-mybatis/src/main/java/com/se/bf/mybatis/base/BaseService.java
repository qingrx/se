package com.se.bf.mybatis.base;


import com.se.bf.mybatis.model.Pager;
import java.io.Serializable;
import java.util.List;

/**
 * 为service实现提供的基础接口
 */
public interface BaseService<T> {
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
    public void insertList(List<T> list);
    
    /**
     * 修改
     * @param t 修改的数据
     * @return 修改的数据条数
     */
    public void update(T t);

    /**
     * 非空判断修改数据
     * @param t 修改的数据
     * @return 修改的数据条数
     */
    public void updateByPrimaryKeySelective(T t);

    /**
     * 删除
     * @param id 数据标识
     * @return 删除的数据条数
     */
    public void delete(Serializable id);
    
    /**
     * 通过条件查询数据列表
     * @param t 查询条件
     * @return 数据列表
     */    
    public List<T> getList(T t);

    /**
     * 通过id查询数据
     * @param id 数据标识
     * @return 数据对象
     */
    public T get(Serializable id);

    /**
     * 分页获取信息
     * @param t
     * @param pageInfo
     * @return
     */
    public Pager<T> getPage(T t, Pager pageInfo);
}
