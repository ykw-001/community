package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;

/**
 * 测试敏感词过滤
 *
 * @author ykw 2562551895@qq.com
 * @version 2022/7/12 17:01
 * @since JDK8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "赌赌博博 --->赌***博";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        String text1 = "☆f☆a☆b☆c☆";
        text1 = sensitiveFilter.filter(text1);
        System.out.println(text1);
    }

    @Test
    public void test(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split("\\s+");
        int len = words.length;
        System.out.println(words[len-1].length());
    }

}
