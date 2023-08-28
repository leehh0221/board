package com.hh.board.service;

import com.hh.board.entity.user.User;
import com.hh.board.entity.user.UserRepository;
import com.hh.board.entity.user.dto.RegisterUserReqDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
/*
    - 비밀번호 암호화 추가 예정
    - Token 관련 공부 후 추가 예정
 */
    @Transactional  //
    public User register(RegisterUserReqDto registerUserReqDto) {
        User user = registerUserReqDto.toEntity();
        return userRepository.save(user);
    }
}
