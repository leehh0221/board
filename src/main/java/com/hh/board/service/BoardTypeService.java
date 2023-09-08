package com.hh.board.service;

import com.hh.board.entity.boardType.BoardType;
import com.hh.board.entity.boardType.BoardTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BoardTypeService {
    private final BoardTypeRepository boardTypeRepository;

    @Transactional
    public BoardType register(BoardType boardType) {
        return boardTypeRepository.save(boardType);
    }
}
