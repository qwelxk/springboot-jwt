package com.lxk.demo;

import com.lxk.demo.util.JwtUtil;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2020/3/24 21:26
 * Description :
 */
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class JwtTest {


    @Test
    void verifyTest(){
        log.info("测试verifyTest");
    }
    @Test
    void signTest(){
        log.info("测试signTest");
        String result =JwtUtil.sign("test","irmp");
        log.info(result);
        log.info("test");
        System.out.println(JwtUtil.getUsername(result));
    }
}
