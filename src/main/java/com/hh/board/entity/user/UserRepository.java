package com.hh.board.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByUserId(String userId);

//    Optional<User> findByNickName(String nickName);

    boolean existsByUserId(String userId);
}
