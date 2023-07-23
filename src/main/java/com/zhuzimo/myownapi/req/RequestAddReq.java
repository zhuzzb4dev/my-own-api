package com.zhuzimo.myownapi.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestAddReq {
    /**
     * 命名空间
     */
    private String nameSpace;

    /**
     * 请求名称
     */
    private String requestName;

    /**
     * url
     */
    private String requestUrl;

    /**
     * 请求类型
     */
    private String requestType;

    /**
     * 请求头
     */
    private String requestHeaders;

    /**
     * 请求体
     */
    private String requestBody;
}
