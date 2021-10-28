package com.example.url.service;

import java.util.List;

import com.example.url.model.User;

public interface UserService {
	 int save(User c); // 회원 가입
	 int delete(String nick); // 회원 탈퇴
	 User findByUid(String uid); // 회원 정보 확인
	 User findByNickname(String nickname); // 회원 정보 확인
	 List<User> selectAllUser();
	 int updateUser(User user);
}
