package com.rabbit.redis;

import com.rabbit.redis.kit.RedisKit;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class RedisApplicationTests {

    @Resource
    private RedisKit redisKit;

    @Test
    void contextLoads() {

        redisKit.set("caojunming","123",60);
        log.info(redisKit.get("caojunming").toString());
        System.out.println();

    }

}
