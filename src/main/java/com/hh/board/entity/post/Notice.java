package com.hh.board.entity.post;

import java.util.Objects;

public enum Notice {
    NOTICE(0), COMMON(1);

    private final Integer code;

    Notice(Integer code) { this.code = code; }

    public boolean isNotice() { return Objects.equals(code, NOTICE.code); }
}
