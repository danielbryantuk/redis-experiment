package uk.co.taidev.redisexperiment.repository;

import uk.co.taidev.redisexperiment.model.User;

import java.util.List;

/**
 * UserRepo
 */
public interface UserRepo {

    User get(Long id);

    User save(User user);

    List<User> findBySurname(String surname);

}
