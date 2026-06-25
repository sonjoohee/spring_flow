package com.example.spring_flow;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring_flow.features.user.domain.dto.UserRequestDTO;
import com.example.spring_flow.features.user.domain.dto.UserResponseDTO;
import com.example.spring_flow.features.user.repository.UserMapper;
import com.example.spring_flow.features.user.service.UserService;

import lombok.RequiredArgsConstructor;

import com.example.spring_flow.features.user.service.UserService;

//단위 테스트를 위한 (Junit) + TDD(Test Driven Development)
@SpringBootTest
public class MybatisApplicationTests {
    
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void mapperInsert() {

        // given(데이터 준비))
        UserRequestDTO request = UserRequestDTO.builder()
                .name("test")
                .password("test")
                .email("test@gmail.com")
                .build();


        //when(실행_테스트)
        int insertFlag = userMapper.insertRow(request);

        //then(검증)
        //Assertions.assertNotNull();
        //Assertions.assertEquals("jjj",result.getName());

        System.out.println("insertFlag = " + insertFlag);

   }



    @Test
    public void serviceInsert() {

        // given(데이터 준비))
        UserRequestDTO request = UserRequestDTO.builder()
                .name("test")
                .password("test")
                .email("test@test.com")
                .build();


        //when(실행_테스트)
        int insertFlag = userService.insertService(request);

        //then(검증)
        //Assertions.assertNotNull();
        //Assertions.assertEquals("jjj",result.getName());

        System.out.println("insertFlag = " + insertFlag);

   }


   @Test 
   public void selectUsers(){
    // 관리자로서 전체회원 정보를 조회
    //given 


    //when
    List<UserResponseDTO> list = userService.selectService();

    //then
    list.stream().forEach(System.out::println);

   }


      @Test 
   public void loginUSer(){
    // 사용자 로그인에 대한 검증
    // given(데이터 준비))
        UserRequestDTO request = UserRequestDTO.builder()
                .password("test")
                .email("test@test.com")
                .build();




    //when
    Optional<UserResponseDTO> user = userService.loginService(request);

    //then
    // 1. Optional 객체가 비어있지 않고 값을 가지고 있는지 먼저 검증합니다.
    Assertions.assertThat(user).isPresent();
    // 2. 값이 존재함을 확인한 후, 그 안의 내용(이메일)을 검증합니다.
    Assertions.assertThat(user.get().getEmail()).isEqualTo("test@test.com");

   }
    
    
}
