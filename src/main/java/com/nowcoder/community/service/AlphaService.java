package com.nowcoder.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * test
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/6/30 18:03
 * @since JDK8
 */
@Service
//@Scope("prototype")  设置为多次实例化，默认为single即单次
public class AlphaService {

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

}
