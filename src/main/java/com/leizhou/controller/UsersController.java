package com.leizhou.controller;

import com.leizhou.dto.Users;
import com.leizhou.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersMapper usersMapper;

    @RequestMapping("/users")
    public List<Users> getAllUser(){
        List<Users> users = usersMapper.selectAll();
        return users;
    }

    @RequestMapping("/users/{id}")
    public Users getUserById(@PathVariable("id") int id){
        Users users = usersMapper.selectOne(id);
        return users;
    }
}
