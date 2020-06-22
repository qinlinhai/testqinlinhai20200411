package com.aaa.mapper;

import com.aaa.entity.Members;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Repository
public interface MembersMapper {
    public List<Members> mlist(@RequestParam("searchname") String searchname);

    @Update("update members set deleted=1 where vid=#{vid}")
    public int delete(Members members);
   @Insert("insert into members (fullname,sex,code,phone,integrate,sfz,createtime,birthday,vtypeid,deleted,comment) " +
           "values(#{fullname},#{sex},#{code},#{phone},#{integrate},#{sfz},#{createtime},#{birthday},6,0,#{comment})")
    public int add(Members members);
}
