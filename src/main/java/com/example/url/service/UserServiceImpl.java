package com.example.url.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url.dao.UserDao;
import com.example.url.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    UserDao dao;

    @Override
    public int save(User c) {
        return dao.save(c);
    }

    @Override
    public int delete(String nick) {
        return dao.delete(nick);
    }

    @Override
    public User findByUid(String uid) {
        return dao.findByUid(uid);
    }

    @Override
    public User findByNickname(String nickname) {
        return dao.findByNickname(nickname);
    }

	@Override
	public List<User> selectAllUser() {
		return dao.selectAllUser();
	}

}
