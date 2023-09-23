package com.hh.board.entity.board.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hh.board.entity.board.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterBoardResponseDto {
    @JsonProperty("board_name")
    private String boardName;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("create_dt")
    private LocalDateTime createDt;

    @JsonProperty("update_dt")
    private LocalDateTime updateDt;
}
