package com.example.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weizhenfang on 2018/12/13.
 */
@RestController
@RequestMapping
public class RegisterController {

    @GetMapping("/register")
    private Map<String,String> register() {
        Map<String,String> map = new HashMap<>();
        map.put("msg","你提交的账号申请以提交，审核通过后会通过邮箱通知你");
        return map;
    }
}
