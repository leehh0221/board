package com.hh.board.entity.board;

import com.hh.board.entity.post.Post;
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
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String boardName;

    @OneToMany(mappedBy = "post")
    private List<Post> posts;

    @OneToOne(mappedBy = "user") // 생성 유저
    private User user;

    @Enumerated
    private Status status;

    @Column
    private LocalDateTime createDt;

    @Column
    private LocalDateTime updateDt;
}
