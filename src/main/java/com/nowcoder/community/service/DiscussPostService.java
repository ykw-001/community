package com.nowcoder.community.service;

import com.nowcoder.community.dao.DisscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 社区首页
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/7/4 15:31
 * @since JDK8
 */
@Service
public class DiscussPostService {

    @Autowired
    private DisscussPostMapper disscussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
        return disscussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId){
        return disscussPostMapper.selectDiscussPostRows(userId);
    }

}
