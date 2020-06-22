package com.aaa.service.impl;

import com.aaa.entity.Members;
import com.aaa.mapper.MembersMapper;
import com.aaa.service.MembersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersServiceImpl implements MembersService {
    @Autowired
    private MembersMapper membersMapper;
    @Override
    public PageInfo mlist(String searchname, Integer currentpage, Integer pagesize) {
        PageHelper.offsetPage((currentpage-1)*pagesize,pagesize);
        List<Members> mlist = membersMapper.mlist(searchname);
        PageInfo<Members> pageInfo = new PageInfo<>(mlist);
        return pageInfo;
    }

    @Override
    public int delete(Members members) {
        return membersMapper.delete(members);
    }

    @Override
    public int add(Members members) {
        return membersMapper.add(members);
    }
}
