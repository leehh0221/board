package com.hh.board.entity.board;

import java.util.Objects;

public enum Notice {
    NOTICE_BOARD(0), COMMON_BOARD(1);

    private final Integer code;

    Notice(Integer code) { this.code = code; }

    public boolean isNotice() { return Objects.equals(code, NOTICE_BOARD.code); }
}
