package com.bf.demo;

import com.bf.core.utils.pay.FastJsonUtil;
import com.bf.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BfDemoApplicationTests {

    @Test
    void contextLoads() {
        User u = new User();
        u.setId(11l);
        u.setName("xujinlei");
        System.out.println("hell starter:" + FastJsonUtil.toJSONString(u));
    }

}
