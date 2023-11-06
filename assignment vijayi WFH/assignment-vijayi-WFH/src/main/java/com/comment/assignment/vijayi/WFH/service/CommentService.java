package com.comment.assignment.vijayi.WFH.service;

import com.comment.assignment.vijayi.WFH.model.Comment;
import com.comment.assignment.vijayi.WFH.model.User;
import com.comment.assignment.vijayi.WFH.model.dto.CommentDto;
import com.comment.assignment.vijayi.WFH.repository.ICommentRepo;
import com.comment.assignment.vijayi.WFH.repository.IUserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class  CommentService {
    @Autowired
    private ICommentRepo commentRepository;

    @Autowired
    private ICommentRepo userRepository;
    @Autowired
    IUserRepo iUserRepo;

    @Transactional


    public List<Comment> getComments(String username) {
        User user = userRepository.findByName(username);
        if (user != null) {
            return commentRepository.findByCommentByUser(user);
        } else {
            return Collections.emptyList();
        }
    }


    public String addComment(String commentTo, String commentFrom, String message) {
        long recipient=iUserRepo.findByUserId(commentTo);
        if(recipient>0){
            iUserRepo.save(new User(commentTo));
        }
        Comment comment = new Comment();
        long recipient2=iUserRepo.findByUserId(commentFrom);
        if(recipient>0){
            iUserRepo.save(new User(commentFrom));
        }
        comment.setRecipient(iUserRepo.findByUserId(commentTo));

        comment.setCommentText(message);
        comment.setCommentDateTime(LocalDateTime.now());
        return "comment added successfully";
    }
}
