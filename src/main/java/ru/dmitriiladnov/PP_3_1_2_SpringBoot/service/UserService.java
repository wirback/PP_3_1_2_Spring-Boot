package ru.dmitriiladnov.PP_3_1_2_SpringBoot.service;

import ru.dmitriiladnov.PP_3_1_2_SpringBoot.model.User;

public interface UserService {
    Iterable<User> findAll();
    User findById(Long id);
    void save(User user);
    void deleteById(Long id);
}
