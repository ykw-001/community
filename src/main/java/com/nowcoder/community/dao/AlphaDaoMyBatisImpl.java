package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Mybatis
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/6/30 17:57
 * @since JDK8
 */
@Repository
@Primary  /*加上这个注解后优先调用*/
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
