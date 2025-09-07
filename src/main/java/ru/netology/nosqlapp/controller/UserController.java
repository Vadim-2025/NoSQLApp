package ru.netology.nosqlapp.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.netology.nosqlapp.service.UserService;
import ru.netology.nosqlapp.model.User;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {

        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {

        return service.getUsers();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable String id) {

        return service.getUserById(id);
    }

    @GetMapping("name/{name}")
    public List<User> getUsersByName(@PathVariable String name) {

        return service.getUsersByName(name);
    }


    @GetMapping("age/{age}")
    public List<User> getUsersByAge(@PathVariable int age) {

        return service.getUsersByAge(age);
    }

    @PostMapping
    public User addUser(@RequestBody @Valid User user) {

        return service.addUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody @Valid User user) {

        return service.updateUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable String id) {

        service.deleteUser(id);
    }
}
