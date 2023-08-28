package com.hh.board.service;

import com.hh.board.entity.board.Board;
import com.hh.board.entity.board.BoardRepository;
import com.hh.board.entity.board.BoardType;
import com.hh.board.entity.user.BoardTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public Board register(Board board) {
        return boardRepository.save(board);
    }
}
