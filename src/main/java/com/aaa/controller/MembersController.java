package com.aaa.controller;

import com.aaa.entity.Members;
import com.aaa.service.MembersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MembersController {
    @Autowired
    private MembersService membersService;
    @GetMapping("/query")
    public PageInfo query(String search,@RequestParam("currentpage") Integer currentpage,@RequestParam("pagesize") Integer pagesize){
        PageInfo pageInfo = membersService.mlist(search, currentpage, pagesize);
        return pageInfo;
    }
    @GetMapping("/delete")
    public int delete(Members members){
        return membersService.delete(members);
    }

    @PostMapping("/add")
    public int add(@RequestBody Members members){
        return  membersService.add(members);
    }

    @PostMapping("/ceshi")
    public String ceshi(@RequestBody String a){
        return a;
    }
}
