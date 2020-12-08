package com.easy.learn;

import com.easy.learn.entity.User;
import com.easy.learn.services.RedisServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author noseparte
 * @link github.com/noseparte
 * @date 2020/12/8 - 20:13
 * @implSpec
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        RedisServer redisServer = (RedisServer) ctx.getBean("myserver");
        User u = redisServer.getUserByName("大白");
        Thread.sleep(2000);
        User u2 = redisServer.getUserByName("大白");
        System.out.println(u);
        System.out.println(u2);
        System.out.println(u == u2);
    }

}
