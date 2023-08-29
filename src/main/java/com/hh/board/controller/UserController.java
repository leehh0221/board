package com.hh.board.controller;

import com.hh.board.entity.user.User;
import com.hh.board.entity.user.dto.RegisterRequestDto;
import com.hh.board.entity.user.dto.RegisterResponseDto;
import com.hh.board.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
//@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDto> register(@Valid @RequestBody RegisterRequestDto registerRequestDto) {
        User user = userService.register(registerRequestDto);
        RegisterResponseDto responseDto = new RegisterResponseDto().toResponseDto(user);
        return ResponseEntity.ok(responseDto);
    }

}

