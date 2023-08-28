package com.hh.board.entity.user;

import java.util.Objects;

public enum Status {
    ACTIVE_USER(0), EXIT_USER(1), BLOCK_USER(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public boolean isActiveUser() { return Objects.equals(code, ACTIVE_USER.code); }
}
