package com.hh.board.entity.post;

import com.hh.board.entity.Reply.Reply;
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
import jakarta.persistence.OneToMany;
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
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_type_id")
    private Board board;

    @Column
    private String title;

    @Column
    private String Comment;

//    @OneToMany(mappedBy = "image")
//    private List<Image> images;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private User user;

    @OneToMany(mappedBy = "reply")
    private List<Reply> replies;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Notice notice;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime modifyDate;

}
