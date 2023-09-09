package com.hh.board.entity.user;

import java.util.Objects;

public enum Status {
    ACTIVE(0), EXIT(1), BLOCK(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public boolean isActiveUser() { return Objects.equals(code, ACTIVE.code); }
}
