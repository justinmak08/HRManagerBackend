package com.southwind.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserVO {
    private Integer total;
    private List<User> data;
    private Integer pageSize;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
