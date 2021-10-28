package com.example.url.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.model.User;
import com.example.url.service.UserService;
import com.example.url.utils.SHA256Util;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping
	public ResponseEntity<List<User>> allUser() {
		return new ResponseEntity<List<User>>(service.selectAllUser(), HttpStatus.OK);

	}

	@GetMapping("/find")
	public ResponseEntity<User> user(@RequestParam String nick) {
		User user = service.findByNickname(nick);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping("signup")
	public ResponseEntity<String> insertUser(@RequestBody User user) {
		String salt = SHA256Util.generateSalt();
		user.setSalt(salt);
		String password = user.getPassword();
		password = SHA256Util.getEncrypt(password, salt);
		user.setPassword(password);

		if (service.save(user) == 1) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		}
		return new ResponseEntity<>("이미 존재합니다", HttpStatus.NO_CONTENT);
	}

	@DeleteMapping()
	public ResponseEntity<String> deleteUser(@RequestParam String nick) {
		User user = service.findByNickname(nick);
		String password = user.getPassword();
		if (service.delete(nick) == 1) {
			return new ResponseEntity<>("삭제완료", HttpStatus.OK);
		}
		return new ResponseEntity<>("삭제 실패", HttpStatus.NO_CONTENT);
	}
	
	@PutMapping()
	public ResponseEntity<String> updateUser(@RequestBody User user){
		if (service.updateUser(user) == 1) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}
		return new ResponseEntity<String>("fail", HttpStatus.NO_CONTENT);
	}
}
