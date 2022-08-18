package redies.a5.a23;

import redis.clients.jedis.Jedis;

public class am1redies {
    public static void main(String[] args) {
        Jedis je = new Jedis("localhost");
        System.out.println(je.ping("连接成功"));

        System.out.println(je.keys("*"));
        je.select(6);
        System.out.println(je.keys("*"));

    }
}
