package com.leizhou.controller;

import com.leizhou.dto.Users;
import com.leizhou.mapper.UsersMapper;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SecurityRequirement(name = "javainuseapi")
public class UsersController {

    @Autowired
    UsersMapper usersMapper;

    @GetMapping(value="/users")
    public List<Users> getAllUser(){
        return usersMapper.selectAll();
    }

    @GetMapping(value="/users/{id}")
    public Users getUserById(@PathVariable("id") int id){
        return usersMapper.selectOne(id);
    }
}
