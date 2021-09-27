package com.example.spring_boot_jwt_NguyenXuanThanh.service;

import com.example.spring_boot_jwt_NguyenXuanThanh.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
