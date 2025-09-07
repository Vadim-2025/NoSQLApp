package ru.netology.nosqlapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.netology.nosqlapp.model.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findUserByAge(int age);

    List<User> findUserByName(String name);
}
