package com.comment.assignment.vijayi.WFH.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//columns - user id (primary key, big int, unique, not null), comment from (varchar(25), not unique, not
//null), comment to(varchar(25), not unique, not null).
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;
    @Column(length = 25, unique = false, nullable = false)
    private String commentFrom;
    @Column(length = 25, unique = false, nullable = false)
    private String commentTo;


    public User(String commentTo) {
    }
}
