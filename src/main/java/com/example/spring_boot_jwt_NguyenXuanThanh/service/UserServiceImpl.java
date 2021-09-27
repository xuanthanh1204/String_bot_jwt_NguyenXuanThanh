package com.example.spring_boot_jwt_NguyenXuanThanh.service;

import com.example.spring_boot_jwt_NguyenXuanThanh.entity.User;
import com.example.spring_boot_jwt_NguyenXuanThanh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
