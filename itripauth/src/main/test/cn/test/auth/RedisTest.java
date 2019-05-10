package cn.test.auth;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
    Jedis jedis = null;
    @Before
    public void Init1(){
        jedis=new Jedis("localhost");
   }

    @Test
    public  void setTest(){
        //连接本地的redis服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
       jedis.set("token-1","name:tongtong");

    }
    @Test
    public  void  del(){
        jedis.del("token-1");
        System.out.println("删除成功");
    }

}
