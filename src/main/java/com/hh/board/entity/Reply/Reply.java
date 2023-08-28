package com.hh.board.entity.Reply;

import com.hh.board.entity.board.Board;
import com.hh.board.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "board_id", foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Board board;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private User user;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime modifyDate;

    @Enumerated(EnumType.STRING)
    private Status status;


}
