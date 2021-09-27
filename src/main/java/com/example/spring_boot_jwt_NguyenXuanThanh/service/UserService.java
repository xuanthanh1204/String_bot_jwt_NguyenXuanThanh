package com.example.spring_boot_jwt_NguyenXuanThanh.service;

import com.example.spring_boot_jwt_NguyenXuanThanh.authen.UserPrincipal;
import com.example.spring_boot_jwt_NguyenXuanThanh.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
