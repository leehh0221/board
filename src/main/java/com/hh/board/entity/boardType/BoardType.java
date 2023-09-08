package com.hh.board.entity.boardType;

import com.hh.board.entity.board.Board;
import com.hh.board.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class BoardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Board_Type_id") // BoardType 의 id 가 'board_type_id'로 잘 들어가는지 확인 후 삭제여부 결정 (Board.class에서 JoinColumn에 기재하기 위함)
    private Long id;

    @Column
    private String TypeName;

    @OneToMany(mappedBy = "board")
    private List<Board> boards;

    @OneToOne(mappedBy = "user") // 생성 유저
    private User user;

    @Enumerated
    private Status status;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime modifyDate;
}
