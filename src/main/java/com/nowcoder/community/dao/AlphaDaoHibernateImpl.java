package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * AlphaDao
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/6/30 17:52
 * @since JDK8
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
