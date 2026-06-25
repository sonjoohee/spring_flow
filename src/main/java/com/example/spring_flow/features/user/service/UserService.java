package com.example.spring_flow.features.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_flow.features.user.domain.dto.UserRequestDTO;
import com.example.spring_flow.features.user.repository.UserMapper;

import org.springframework.stereotype.Service;

@Service
@Transactional
//service: 비즈니스 로직을 구현하는 역할
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public int insertService(UserRequestDTO request) {
        System.out.println(">>>debug insertService");
        System.out.println(">>>debug insertService request: " + request);
        return userMapper.insertRow(request);
    }


    public UserRequestDTO selectService(String userId) {
        System.out.println(">>>debug selectService");
        List<UserResponseDTO> list = userMapper.selectRow(userId);
        return userMapper.selectRow(userId);
    }
    
}
