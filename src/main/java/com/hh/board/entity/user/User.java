package com.hh.board.entity.user;

import com.hh.board.entity.board.Board;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(
        name = "Users",
        uniqueConstraints = {
                @UniqueConstraint(name = "UniqueUserIdForPreventingDupRegistration", columnNames = {"userId"})
        }
)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userId;

    @Column
    private String password;

    @Column
    private String nickName;

    @Enumerated(EnumType.STRING)
    private IsAdmin isAdmin;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "board")
    private List<Board> boards;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime exitDate;

}



