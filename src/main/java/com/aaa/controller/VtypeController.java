package com.aaa.controller;

import com.aaa.entity.Vtype;
import com.aaa.service.VtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vtype")
public class VtypeController {
    @Autowired
    private VtypeService vtypeService;
    @GetMapping("/query")
    public List<Vtype> query(){
        return vtypeService.vList();
    }
}
