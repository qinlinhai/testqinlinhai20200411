package com.aaa.service;

import com.aaa.entity.Members;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MembersService {
    public PageInfo mlist(String searchname,Integer currentpage,Integer pagesize);

    public int delete(Members members);

    public int add(Members members);
}
