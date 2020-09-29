package com.usercenter.service;

import com.usercenter.entity.User;

/**
 * @Author F*WT
 * @Date 2020/9/29 20:38
 * @Description
 */
public interface UserService {
    /**
     * 根据id获得用户详情
     * @param id
     * @return User
     */
    User findById(Integer id);
}
