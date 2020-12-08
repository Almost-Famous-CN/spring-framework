package com.easy.learn.services;

import com.easy.learn.entity.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author noseparte
 * @link github.com/noseparte
 * @date 2020/12/8 - 20:15
 * @implSpec
 */
@Service
public class RedisServer {

    @Cacheable(value = "cacheA")
    public User getUserByAgeAndName(String name, int age){
        return new User(name,age,System.currentTimeMillis());
    }

    @Cacheable(value = "cacheB")
    public User getUserByName(String name){
        User u=new User();
        u.setName(name);
        u.setCreatTime(System.currentTimeMillis());
        return u;
    }

    @CacheEvict(value = {"cacheA","cacheB"},allEntries = true)
    public void clearCache(){
        System.out.println("clear over");
    }


}
