package uk.co.taidev.redisexperiment.repository;

import redis.clients.jedis.Jedis;

/**
 * BaseRepoRedis
 */
public class BaseRepoRedis {

    Jedis jedis = new Jedis("localhost");

}
