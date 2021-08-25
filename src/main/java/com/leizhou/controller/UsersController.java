package com.leizhou.controller;

import com.leizhou.dto.Users;
import com.leizhou.mapper.UsersMapper;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersMapper usersMapper;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public List<Users> getAllUser(){
        List<Users> users = usersMapper.selectAll();
        return users;
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
    public Users getUserById(@PathVariable("id") int id){
        Users users = usersMapper.selectOne(id);
        return users;
    }
}
