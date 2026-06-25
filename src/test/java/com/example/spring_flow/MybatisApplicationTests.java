package com.example.spring_flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring_flow.features.user.domain.dto.UserRequestDTO;
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
   public void selectusers(){
    // 관리자로서 전체회원 정보를 조회
    //given


    //when
    userService.selectService();

    //then

   }
    
    
}
