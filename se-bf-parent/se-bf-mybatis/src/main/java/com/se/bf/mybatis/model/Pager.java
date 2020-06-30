package com.se.bf.mybatis.model;


import com.github.pagehelper.PageInfo;
import java.io.Serializable;
import java.util.List;

/**
 * 分页包装类
 * @author seamoney
 * @date 2018/4/3 17:45
 */
public class Pager<T> extends PageInfo implements Serializable{
    /**
     * 排序
     */
    private String orderBy;

    public Pager(){
        setIsFirstPage(false);
        setIsLastPage(false);
        setHasPreviousPage(false);
        setHasNextPage(false);
        setPageNum(1);
        setPageSize(10);
    }

    public Pager(Integer pageNum, Integer pageSize) {
        if(pageNum == null){
            pageNum = 1;
        }
        if(pageSize == null){
            pageSize = 10;
        }
        setIsFirstPage(false);
        setIsLastPage(false);
        setHasPreviousPage(false);
        setHasNextPage(false);
        setPageNum(pageNum);
        setPageSize(pageSize);
    }

    public Pager(List<T> list) {
        super(list);
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
