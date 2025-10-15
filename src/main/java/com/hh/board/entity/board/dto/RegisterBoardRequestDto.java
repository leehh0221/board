package com.hh.board.entity.board.dto;

import com.hh.board.entity.board.Board;
import com.hh.board.entity.board.Status;
import com.hh.board.entity.user.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterBoardRequestDto {
    @NotBlank
    private String boardName;

    @NotBlank
    private String status;

    public Board toEntity(User user) {
        return Board.builder()
                .boardName(boardName)
                .user(user)
                .status(Status.ACTIVE)
                .createDt(LocalDateTime.now())
                .build();
    }
}
