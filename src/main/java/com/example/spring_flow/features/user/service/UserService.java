package com.example.spring_flow.features.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_flow.features.user.domain.dto.UserRequestDTO;
import com.example.spring_flow.features.user.domain.dto.UserResponseDTO;
import com.example.spring_flow.features.user.repository.UserMapper;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
//service: 비즈니스 로직을 구현하는 역할
public class UserService {

   private final UserMapper userMapper;


    public int insertService(UserRequestDTO request) {
        System.out.println(">>>debug insertService");
        System.out.println(">>>debug insertService request: " + request);
        return userMapper.insertRow(request);
    }


    public List<UserResponseDTO> selectService() {
        System.out.println(">>>debug selectService");
        return userMapper.selectRow();
    }
    
    public Optional<UserResponseDTO> loginService(UserRequestDTO request) {
        System.out.println(">>>debug selectService");
        return userMapper.loginRow(request);
    }
}
