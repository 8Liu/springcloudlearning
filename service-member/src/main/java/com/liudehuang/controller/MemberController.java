package com.liudehuang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author liudehuang
 * @date 2019/2/20 16:56
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/getUserList")
    public List<String> getUserList(){
        List<String> list = Arrays.asList("zhangsan","lisi","wangwu",port);
        return list;
    }
}
