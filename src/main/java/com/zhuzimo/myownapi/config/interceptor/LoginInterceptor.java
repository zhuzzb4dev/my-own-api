package com.zhuzimo.myownapi.config.interceptor;

import com.zhuzimo.myownapi.config.constant.AttributeConstant;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute(AttributeConstant.USER_ID,2l);

        return true;
    }
}
