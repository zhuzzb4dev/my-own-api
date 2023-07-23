package com.zhuzimo.myownapi.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * API请求表
 * @TableName t_request
 */
@Data
public class RequestEntity implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 所属用户
     */
    private Long userId;

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

    /**
     * 是否删除 0：未删除 非0：已删除
     */
    private Long isDel;

    /**
     * 添加人uuid
     */
    private String creatorUuid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人uuid
     */
    private String updaterUuid;

    /**
     * 业务更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RequestEntity other = (RequestEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNameSpace() == null ? other.getNameSpace() == null : this.getNameSpace().equals(other.getNameSpace()))
            && (this.getRequestName() == null ? other.getRequestName() == null : this.getRequestName().equals(other.getRequestName()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getRequestType() == null ? other.getRequestType() == null : this.getRequestType().equals(other.getRequestType()))
            && (this.getRequestHeaders() == null ? other.getRequestHeaders() == null : this.getRequestHeaders().equals(other.getRequestHeaders()))
            && (this.getRequestBody() == null ? other.getRequestBody() == null : this.getRequestBody().equals(other.getRequestBody()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getCreatorUuid() == null ? other.getCreatorUuid() == null : this.getCreatorUuid().equals(other.getCreatorUuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdaterUuid() == null ? other.getUpdaterUuid() == null : this.getUpdaterUuid().equals(other.getUpdaterUuid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNameSpace() == null) ? 0 : getNameSpace().hashCode());
        result = prime * result + ((getRequestName() == null) ? 0 : getRequestName().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        result = prime * result + ((getRequestHeaders() == null) ? 0 : getRequestHeaders().hashCode());
        result = prime * result + ((getRequestBody() == null) ? 0 : getRequestBody().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getCreatorUuid() == null) ? 0 : getCreatorUuid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdaterUuid() == null) ? 0 : getUpdaterUuid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", nameSpace=").append(nameSpace);
        sb.append(", requestName=").append(requestName);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", requestType=").append(requestType);
        sb.append(", requestHeaders=").append(requestHeaders);
        sb.append(", requestBody=").append(requestBody);
        sb.append(", isDel=").append(isDel);
        sb.append(", creatorUuid=").append(creatorUuid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updaterUuid=").append(updaterUuid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}