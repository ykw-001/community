package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * 线程隔离
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/7/8 17:12
 * @since JDK8
 */
// 起到容器作用，持有用户信息，用于代替session对象
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
