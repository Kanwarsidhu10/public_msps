package com.kanwarsidhu.spring_security_jwt.repository;

import com.kanwarsidhu.spring_security_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findbyUserName (String username);
    boolean existsByUsername (String username);

}
