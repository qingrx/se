package com.se.bf.mybatis.base.impl;



import com.github.pagehelper.PageHelper;
import com.se.bf.mybatis.base.BaseDao;
import com.se.bf.mybatis.base.BaseService;
import com.se.bf.mybatis.model.Pager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import java.io.Serializable;
import java.util.List;

/**
 * service抽象类，实现部分公共方法
 *
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    private static Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    /**
     * 抽象方法，必须实现，返回DAO实例
     * @return DAO实例
     */
    public abstract BaseDao<T> getDao();

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false)
    public int insert(T t){
        return getDao().insert(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false)
    public void insertList(List<T> list) {
        getDao().insertList(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false)
    public void update(T t) {
        getDao().updateByPrimaryKey(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false)
    public void updateByPrimaryKeySelective(T t) {
        getDao().updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false)
    public void delete(Serializable id) {
        getDao().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = true)
    public List<T> getList(T t) {
        return getDao().getList(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = true)
    public T get(Serializable id) {
        return getDao().selectByPrimaryKey(id);
    }

    @Override
    public Pager<T> getPage(T t, Pager pageInfo) {
        List<T> list = null;
        if (!StringUtils.isEmpty(pageInfo.getOrderBy())){
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize(),pageInfo.getOrderBy());
            list = getList(t);
        }else{
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
            list = getList(t);
        }
        pageInfo.setList(list);
        return pageInfo;
    }
}
