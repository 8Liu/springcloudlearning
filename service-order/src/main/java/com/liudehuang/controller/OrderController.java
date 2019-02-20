package com.liudehuang.controller;

import com.liudehuang.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liudehuang
 * @date 2019/2/20 17:17
 */
@RestController
public class OrderController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("/getOrderByUserList")
    public List<String> getOrderByUserList(){
        return memberService.getOrderByUserList();
    }
}
