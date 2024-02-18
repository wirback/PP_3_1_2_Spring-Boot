package ru.dmitriiladnov.PP_3_1_2_SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitriiladnov.PP_3_1_2_SpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
