package com.zhuzimo.myownapi.controller;

import com.zhuzimo.myownapi.component.UserComponent;
import com.zhuzimo.myownapi.mapper.UserEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {

    @Resource
    private UserComponent userComponent;

    @Resource
    private UserEntityMapper userEntityMapper;

    @PostMapping("addAmount")
    public ResponseEntity addAmount() {
        Long userId = userComponent.getUserId();
        userEntityMapper.addAmount(userId,1000);
        return ResponseEntity.ok().build();
    }
}
