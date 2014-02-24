package uk.co.taidev.redisexperiment.repository;

import org.junit.Test;
import uk.co.taidev.redisexperiment.model.User;

/**
 * UserRepoRedisTest
 */
public class UserRepoRedisTest {

    private UserRepo userRepo = new UserRepoRedis();

    @Test
    public void saveTest() {
        User user = createTestUser();

        User persistedUser = userRepo.save(user);

    }


    private User createTestUser() {
        User user = new User();
        user.setFirstName("Daniel");
        user.setSurname("Bryant");
        user.setEmailAddress("daniel.bryant@tai-dev.co.uk");
        return user;
    }

}
