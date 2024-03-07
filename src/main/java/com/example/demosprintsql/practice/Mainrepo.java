package com.example.demosprintsql.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/king")
public class Mainrepo {


    @Autowired
    private com.example.demosprintsql.practice.userRespo userRespo;

    @PostMapping("/boss")
    public @ResponseBody user addNewUser(@RequestParam String name, @RequestParam String email){
        user springuser=new user();
        springuser.setName(name);
        springuser.setEmail(email);
        userRespo.save(springuser);
        return springuser;
    }

    @GetMapping("/run")
    public @ResponseBody Iterable<user> getalluser(){
        return userRespo.findAll();
    }
}
