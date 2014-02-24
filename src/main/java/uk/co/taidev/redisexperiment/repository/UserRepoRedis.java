package uk.co.taidev.redisexperiment.repository;

import uk.co.taidev.redisexperiment.model.User;

import java.util.List;

/**
 * UserRepoRedis
 */
public class UserRepoRedis extends BaseRepoRedis implements UserRepo {


    private static final String USER_ID_COUNTER_KEY = "userIdCounter";
    private static final String USER_KEY_PREFIX = "user:";


    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(getNewId());
        }

        jedis.set(USER_KEY_PREFIX + user.getId(), user);
    }

    @Override
    public List<User> findBySurname(String surname) {
        return null;
    }

    private Long getNewId() {
        return jedis.incr(USER_ID_COUNTER_KEY);
    }
}
