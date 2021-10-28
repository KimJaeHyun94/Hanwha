package com.example.url.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.url.model.User;

@Mapper
public interface UserDao {
    int save(User c); // 회원 가입
    int delete(String uid); // 회원 탈퇴
    User findByUid(String uid); // 회원 정보 확인
    User findByNickname(String nickname); // 회원 정보 확인
    List<User> selectAllUser();
    int updateUser(User user);
}
