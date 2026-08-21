package com.Ducat.SpringFirstProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ducat.SpringFirstProject.Entity.UserEntity;
import com.Ducat.SpringFirstProject.Service.UserService;
import java.util.Map;
import java.util.List;




@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userServiceBean){  //Consturtor ways dependencies Injection
        this.userService = userServiceBean;
    }
    @GetMapping("/getAll")
    public List<Map<String, String>> dashBoardEndpoint(){
        return userService.getUsers();


    }

    @GetMapping("/get")
    public String getEndpoit(){
        return "userController working";

    }
    @PostMapping("/signUp")
    public void signUpEndpoint(@RequestBody Map<String, String> userDataSent){
        System.out.println("Data receive in controller layer "+ userDataSent);
          userService.saveUser(userDataSent);
        
    }

    
}
