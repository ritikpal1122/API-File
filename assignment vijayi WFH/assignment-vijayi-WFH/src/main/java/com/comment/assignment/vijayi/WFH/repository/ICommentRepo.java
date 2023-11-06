package com.comment.assignment.vijayi.WFH.repository;

import com.comment.assignment.vijayi.WFH.model.Comment;
import com.comment.assignment.vijayi.WFH.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommentRepo extends JpaRepository<Comment, Long> {

    List<Comment> findByCommentByUser(User user);

    User findByName(String username);
}
