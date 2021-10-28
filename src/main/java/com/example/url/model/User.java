package com.example.url.model;

public class User {
	    private int id;            // (PK) 회원이 가지고 있는 고유키
	    private String nickname;       // 회원 닉네임
	    private String email;          // (UN) 이메일
	    private String password;       // 비밀번호
	    private String username;
	    
	    public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		private String salt;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSalt() {
			return salt;
		}
		public void setSalt(String salt) {
			this.salt = salt;
		}
		public User() {
			super();
		}
		public User(int id, String nickname, String email, String password, String username, String salt) {
			super();
			this.id = id;
			this.nickname = nickname;
			this.email = email;
			this.password = password;
			this.username = username;
			this.salt = salt;
		}
}
