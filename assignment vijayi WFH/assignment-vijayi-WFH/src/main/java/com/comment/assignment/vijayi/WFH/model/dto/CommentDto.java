package com.comment.assignment.vijayi.WFH.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private String commentFrom;
    private String commentTo;
    private String message;

}
