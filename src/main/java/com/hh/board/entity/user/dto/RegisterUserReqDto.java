package com.hh.board.entity.user.dto;

import com.hh.board.entity.user.IsAdmin;
import com.hh.board.entity.user.Status;
import com.hh.board.entity.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterUserReqDto {
    @NotBlank
    private String userId;

    @NotBlank
    private String password;

    @NotBlank
    private String nickName;

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .password(password)
                .nickName(nickName)
                .isAdmin(IsAdmin.COMMON_USER)
                .status(Status.ACTIVE_USER)
                .createDate(LocalDateTime.now())
                .build();
    }

}
