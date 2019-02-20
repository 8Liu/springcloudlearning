package com.liudehuang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liudehuang
 * @date 2019/2/20 17:10
 */
@Service
public class MemberService {
    @Autowired
    RestTemplate restTemplate;

    public List<String> getOrderByUserList(){
        return restTemplate.getForObject("http://service-member/getUserList",List.class);
    }
}
