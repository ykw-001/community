package com.nowcoder.community.entity;

import java.util.Date;

/**
 * 登陆相关实体类
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/7/7 15:13
 * @since JDK8
 */
public class LoginTicket {

    private int id;
    private int userId;
    private int status;
    private String ticket;
    private Date expired;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "LoginTicket{" +
                "id=" + id +
                ", userId=" + userId +
                ", status=" + status +
                ", ticket='" + ticket + '\'' +
                ", expired=" + expired +
                '}';
    }
}
