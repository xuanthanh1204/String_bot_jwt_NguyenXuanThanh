package com.example.spring_boot_jwt_NguyenXuanThanh.repository;

import com.example.spring_boot_jwt_NguyenXuanThanh.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
