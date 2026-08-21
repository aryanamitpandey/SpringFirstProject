package com.Ducat.SpringFirstProject.Service;


import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.Ducat.SpringFirstProject.Repository.UserRepository;
import com.Ducat.SpringFirstProject.Entity.UserEntity;
@Service
public class UserService {
    
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<Map<String, String>> getUsers(){
        return userRepository.getAll();
        

        
    }
    public void saveUser(Map<String, String> name){
        //send to  repository data
         //return Map.of("data-receive-in service",Map.of("controllerData",userData));
         System.out.println("Data receive in service layer" + name);
          userRepository.save(name);
    }
    
}
