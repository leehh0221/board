package com.hh.board.service;

import com.hh.board.entity.board.Board;
import com.hh.board.entity.board.BoardRepository;
import com.hh.board.entity.board.dto.RegisterBoardRequestDto;
import com.hh.board.entity.board.dto.RegisterBoardResponseDto;
import com.hh.board.entity.user.User;
import com.hh.board.entity.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    /*
        등록완료 : RegisterBoardResponseDto 반환
        등록실패 : Null 반환
    */
    @Transactional
    public RegisterBoardResponseDto registerBoard(RegisterBoardRequestDto registerBoardRequestDto, Long userId){
        Optional<User> userEntity = userRepository.findById(userId);

        if(userEntity.isPresent()){
            Board buildBoard = registerBoardRequestDto.toEntity(userEntity.get());

            Board board = boardRepository.save(buildBoard);

            return RegisterBoardResponseDto.builder()
                    .boardName(board.getBoardName())
                    .userId(board.getUser().getUserId())
                    .status(board.getStatus())
                    .createDt(board.getCreateDt())
                    .build();
        }

        log.info("cannot find user info");
        return null;
    }
}
