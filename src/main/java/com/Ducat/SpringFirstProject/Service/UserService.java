package com.Ducat.SpringFirstProject.Service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.Ducat.SpringFirstProject.Repository.UserRepository;
import com.Ducat.SpringFirstProject.Entity.UserEntity;
@Service
public class UserService {
    
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<UserEntity> getUsers(){
        return userRepository.findAll();
        
    }
    public void deleteUserService(int id) throws Exception{
        userRepository.deleteById(id);
        //userRepository.delete(id);
    }
    public void saveUser(UserEntity name){
          userRepository.save(name);
    }

    
}
