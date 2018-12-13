package com.example.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weizhenfang on 2018/12/13.
 */
@RestController
@RequestMapping
public class RegisterController {

    @GetMapping("/register")
    private String register() {
        return "你提交的账号申请以提交，审核通过后会通过邮箱通知你";
    }
}
