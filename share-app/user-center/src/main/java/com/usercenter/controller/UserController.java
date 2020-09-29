package com.usercenter.controller;

import com.usercenter.entity.User;
import com.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author F*WT
 * @Date 2020/9/29 20:35
 * @Description
 */
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable Integer id) {
        log.info("我被请求了...");
        return this.userService.findById(id);
    }

}
