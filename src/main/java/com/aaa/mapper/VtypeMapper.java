package com.aaa.mapper;

import com.aaa.entity.Vtype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VtypeMapper {
    @Select("select * from vtype where deleted=0")
    public List<Vtype> vList();
}
