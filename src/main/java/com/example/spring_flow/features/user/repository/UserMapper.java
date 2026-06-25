
package com.example.spring_flow.features.user.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.spring_flow.features.user.domain.dto.UserRequestDTO;
import com.example.spring_flow.features.user.domain.dto.UserResponseDTO;

//mybatis를 구현하는 Data Access Object
/*
//JDBC
try{
- 특정 벤더사의 드라이버를 로딩
- 접속(root,12354)
- query 작성
- query 실행
- 결과 반환
- 핸들링 
}catch(Exception e){
    try{
    - 외부 리소스 연결을 종료
    }catch(Exception e){
    }
}
*/

@Mapper
public interface UserMapper {
    public int insertRow(UserRequestDTO request);
    public List<UserResponseDTO> selectRow(String userId);
    
}
