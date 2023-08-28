package com.hh.board.entity.user;

import java.util.Objects;

public enum IsAdmin {
    ADMIN_USER(0), COMMON_USER(1);

    private final Integer code;

    IsAdmin(Integer code) { this.code = code; }

    public boolean isAdminUser() { return Objects.equals(code, ADMIN_USER.code); }

}
