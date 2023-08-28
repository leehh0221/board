package com.hh.board.entity.user;

import com.hh.board.entity.board.BoardType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardTypeRepository extends JpaRepository<BoardType, Long> {
}
