package uk.co.taidev.redisexperiment;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * RedisExperimentTest
 */
public class RedisExperimentTest {

    private static final String TEST_KEY = "test";
    private static final String TEST_VALUE_1 = "test_1";
    private static final String TEST_VALUE_2 = "test_2";
    private static final String TEST_VALUE_3 = "test_3";

    private Jedis jedis = new Jedis("localhost");


    @Before
    public void setUp() {
        jedis.del("*");
    }


    @Test
    public void canWriteAndReadSimple() {
        jedis.set(TEST_KEY, TEST_VALUE_1);
        String value = jedis.get(TEST_KEY);

        assertThat(value, is(TEST_VALUE_1));
    }


    @Test
    public void todo() {
        jedis.lpush(TEST_KEY, TEST_VALUE_1);
        jedis.lpush(TEST_KEY, TEST_VALUE_2);

        List<String> results = jedis.lrange(TEST_KEY, 0, -1);

        assertTrue(results.containsAll(Arrays.asList(TEST_VALUE_1, TEST_VALUE_2)));
    }


}
