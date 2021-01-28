package com.southwind.controller;

import com.southwind.entity.User;
import com.southwind.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    @ApiOperation(("save"))
    public Integer save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    @ApiOperation(("deleteById"))
    public void deleteById(@PathVariable("id") String id){
        userService.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    @ApiOperation(("findById"))
    public User findById(@PathVariable("id") String id){
        return userService.findById(id);
    }

    @GetMapping("/findByUsername/{username}")
    @ApiOperation(("findByUsername"))
    public User findByUsername(@PathVariable("usernmae") String username) {
        return userService.findByUsername(username);
    }

//    @PutMapping("/userUpdate")
//    @ApiOperation(("userUpdate"))
//    public Integer update(@RequestBody User user){
//        return userService.update(user);
//    }
}
