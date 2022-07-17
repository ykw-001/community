package com.nowcoder.community.entity;

import java.util.Date;

/**
 * 评论
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/7/15 14:38
 * @since JDK8
 */
public class Comment {

    private int id;
    private int userId;
    private int entityType;
    private int targetId;

    private int entityId;

    private int status;
    private String content;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", entityType=" + entityType +
                ", targetId=" + targetId +
                ", entityId=" + entityId +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
