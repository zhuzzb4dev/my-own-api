package com.zhuzimo.myownapi.controller;

import com.zhuzimo.myownapi.entity.RequestEntity;
import com.zhuzimo.myownapi.mapper.RequestEntityMapper;
import com.zhuzimo.myownapi.req.RequestAddReq;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("request")
public class RequestController {

    @Resource
    private RequestEntityMapper requestEntityMapper;

    @PostMapping("add")
    public ResponseEntity addRequest(@Validated @RequestBody RequestAddReq addReq, HttpServletRequest request) {
        RequestEntity record = new RequestEntity();
        BeanUtils.copyProperties(addReq, record);
        record.setUserId((Long) request.getAttribute("user_id"));
        requestEntityMapper.insertSelective(record);
        return ResponseEntity.ok().build();
    }
}
