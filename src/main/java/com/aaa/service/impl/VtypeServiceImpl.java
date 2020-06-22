package com.aaa.service.impl;

import com.aaa.entity.Vtype;
import com.aaa.mapper.VtypeMapper;
import com.aaa.service.VtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VtypeServiceImpl implements VtypeService {
    @Autowired
    private VtypeMapper vtypeMapper;
    @Override
    public List<Vtype> vList() {
        return vtypeMapper.vList();
    }
}
