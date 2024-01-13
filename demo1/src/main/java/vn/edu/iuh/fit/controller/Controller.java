package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.entity.User;
import vn.edu.iuh.fit.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/api/user/{id}")
    public User getUser(@PathVariable("id") long id){
User user=userRepository.findById(id).get();
return user;
    }
    @GetMapping("/api/user")
    public List<User> getAllUser(){
        List<User> list = userRepository.findAll();
        return list;
    }
}
