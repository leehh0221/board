package com.hh.board.entity.boardType;

import java.util.Objects;

public enum Status {
    ACTIVE_BOARD_TYPE(0), DELETE_BOARD_TYPE(1), BLOCK_BOARD_TYPE(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public Boolean isActiveBoardType() { return Objects.equals(code, ACTIVE_BOARD_TYPE.code); }
}
