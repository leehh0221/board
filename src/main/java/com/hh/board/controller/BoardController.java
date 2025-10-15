package com.hh.board.controller;

import com.hh.board.entity.board.dto.RegisterBoardRequestDto;
import com.hh.board.entity.board.dto.RegisterBoardResponseDto;
import com.hh.board.entity.user.User;
import com.hh.board.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/board")
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/registerBoard")
    public ResponseEntity<RegisterBoardResponseDto> registerBoard(@Valid @RequestBody RegisterBoardRequestDto registerBoardRequestDto){

//      등록하려는 User의 userId를 session에서 받아와 registerBoard()로 넘김
        Long userId = 0L;
        RegisterBoardResponseDto registerBoardResponseDto = boardService.registerBoard(registerBoardRequestDto, userId);
        return ResponseEntity.ok(registerBoardResponseDto);
    }
}
