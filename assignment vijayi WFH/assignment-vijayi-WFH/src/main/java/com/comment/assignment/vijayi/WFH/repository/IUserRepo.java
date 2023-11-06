package com.comment.assignment.vijayi.WFH.repository;

import com.comment.assignment.vijayi.WFH.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {

    long findByUserId(String commentTo);

}
