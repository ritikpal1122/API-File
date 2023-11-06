package com.comment.assignment.vijayi.WFH.controller;

import com.comment.assignment.vijayi.WFH.model.Comment;
import com.comment.assignment.vijayi.WFH.model.dto.CommentDto;
import com.comment.assignment.vijayi.WFH.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class messageController {
    @Autowired
    private CommentService commentService;

    public String addComment(
            @RequestParam String commentFrom,
            @RequestParam String commentTo,
            @RequestParam String message
    ) {
        return  commentService.addComment(commentTo, commentFrom, message);
    }

    @GetMapping("/get-comments")
    public ResponseEntity<List<Comment>> getComments(@RequestParam String recipientUsername) {
        List<Comment> comments = commentService.getComments(recipientUsername);
        return ResponseEntity.ok(comments);
    }

}
