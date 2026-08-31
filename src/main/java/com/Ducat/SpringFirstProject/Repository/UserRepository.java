package com.Ducat.SpringFirstProject.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Ducat.SpringFirstProject.Entity.UserEntity;



@Component
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

 
}
