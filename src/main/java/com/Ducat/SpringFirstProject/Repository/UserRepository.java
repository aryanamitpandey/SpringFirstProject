package com.Ducat.SpringFirstProject.Repository;


import org.springframework.stereotype.Component;

import com.Ducat.SpringFirstProject.Entity.UserEntity;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<Map<String, String>> tempDb;
    public UserRepository(){
        this. tempDb = new ArrayList<>();
    }

    public void save(Map<String, String> name){
        System.out.println("Data receive i persistant layer" + name);

         tempDb.add(name);
         System.out.println(tempDb);

    }

    public List<Map<String, String>> getAll(){
        System.out.println("List size " + this.tempDb);
        return this.tempDb;
    }
}
