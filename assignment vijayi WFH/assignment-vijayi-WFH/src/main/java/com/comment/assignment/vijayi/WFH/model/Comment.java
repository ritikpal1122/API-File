package com.comment.assignment.vijayi.WFH.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//columns - comment id (primary key, big int, unique, not null), message(varchar(255), not unique, not
//null), comment date time(not null), posted by user id(big int, not unique, not null)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentor_id", unique = true, nullable = false)
    private Long userId;
    @Column(length = 25, unique = false, nullable = false)
    private String message;
    @Column(nullable = false)
    private LocalDateTime commentDateTime;
    @Column(unique = false, nullable = false)
    private Long postedByUserId;

    public void setRecipient(long commentTo) {

    }

    public void setCommentText(String message) {
        this.message=message;
    }

    public void setCommentDateTime(LocalDateTime now) {
        this.commentDateTime=now;
    }
}
