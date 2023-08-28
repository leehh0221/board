package com.hh.board.entity.board;

import java.util.Objects;

public enum Status {
    ACTIVE_BOARD(0), DELETE_BOARD(1), BLOCK_BOARD(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public Boolean isActiveBoard() { return Objects.equals(code, ACTIVE_BOARD.code); }
}
