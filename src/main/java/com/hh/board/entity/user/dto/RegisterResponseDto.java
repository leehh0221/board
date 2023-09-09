package com.hh.board.entity.user.dto;

import com.hh.board.entity.user.IsAdmin;
import com.hh.board.entity.user.Status;
import com.hh.board.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponseDto {
    private String userId;
    private String nickName;

    private IsAdmin isAdmin;
    private Status status;

    private LocalDateTime createDate;
    private LocalDateTime exitDate;

    public RegisterResponseDto toResponseDto(User user) {
        return RegisterResponseDto.builder()
                .userId(user.getUserId())
                .nickName(user.getNickName())
                .isAdmin(user.getIsAdmin())
                .status(user.getStatus())
                .createDate(user.getCreateDt())
                .exitDate(user.getExitDt())
                .build();
    }
}
