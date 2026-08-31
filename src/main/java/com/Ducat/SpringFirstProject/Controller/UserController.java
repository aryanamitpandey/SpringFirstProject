package com.Ducat.SpringFirstProject.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ducat.SpringFirstProject.Entity.UserEntity;
import com.Ducat.SpringFirstProject.Service.UserService;

import java.util.List;




@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userServiceBean){  //Consturtor ways dependencies Injection
        this.userService = userServiceBean;
    }
    @GetMapping("/getAll")
    public List<UserEntity> dashBoardEndpoint() throws Exception{
        System.out.println("inside getAll " + userService.getUsers());
        return userService.getUsers();


    }

    @DeleteMapping("/delete/{id}")
    public void deleteEndPoint(@PathVariable int id) throws Exception{
        userService.deleteUserService(id);
    }

    // @PostMapping("/update")
    // public UserEntity updateEndpoint(@RequestBody UserEntity userEntity) throws Exception{
    //     return userService.updateUserService(userEntity);
    // }

    // @GetMapping("/get")
    // public String getEndpoit(){
    //     return "userController working";

    // }
    @PostMapping("/signUp")
    public void signUpEndpoint(@RequestBody UserEntity userDataSent){
          userService.saveUser(userDataSent);
        
    }

    
}
