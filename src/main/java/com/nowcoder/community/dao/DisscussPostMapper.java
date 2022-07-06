package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DisscussPostMapper {

    // offset表示起始行数，limit表示一页最多几个帖子
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 若动态查询某一个条件，且该方法只有这一个参数并且在<if>中使用，就必须使用注解@Param（“”）给参数起别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
