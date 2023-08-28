package com.hh.board.entity.Reply;

import java.util.Objects;

public enum Status {
    ACTIVE_REPLY(0), DELETE_REPLY(1), BLOCK_REPLY(2);

    private final Integer code;

    Status(Integer code) { this.code = code; }

    public boolean isActiveReply() { return Objects.equals(code, ACTIVE_REPLY.code); }
}
