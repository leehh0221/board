package com.hh.board.entity.post;

import java.util.Objects;

public enum Status {
    ACTIVE(0), DELETE(1), BLOCK(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public Boolean isActiveBoard() { return Objects.equals(code, ACTIVE.code); }
}
