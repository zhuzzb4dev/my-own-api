package com.zhuzimo.myownapi.component;

import com.zhuzimo.myownapi.config.constant.AttributeConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;

@Component
public class UserComponent {

    @Autowired
    private HttpServletRequest request;


    public Long getUserId() {
        return (Long) request.getAttribute(AttributeConstant.USER_ID);
    }
}
