package com.mtopgul.springmongodbdoc.controller;

import com.mtopgul.springmongodbdoc.model.UserModel;
import com.mtopgul.springmongodbdoc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 16:17
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/ex01")
    public List<UserModel> findAll01(){
        return userService.findAll01();
    }

    @GetMapping("/ex02")
    public List<UserModel> findAll02(){
        return userService.findAll02();
    }

    @GetMapping("/search")
    public void searchByFirstName(@RequestParam("name") String firstName) {
        userService.searchByFirstName(firstName);
    }
}
