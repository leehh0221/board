package com.hh.board.service;

import com.hh.board.entity.post.Post;
import com.hh.board.entity.post.BoardRepository;
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
    public Post register(Post post) {
        return boardRepository.save(post);
    }
}
