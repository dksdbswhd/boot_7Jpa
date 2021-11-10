package com.jcpdev.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jcpdev.board.entity.Users;
import com.jcpdev.board.repository.UsersRepository;

@SpringBootTest
class Boot7JpaApplicationTests {
	
	@Autowired
	UsersRepository udao;

	@Test
	void insertUser() {
		Users user = Users.builder()
				.email("momo@gmail.com")
				.password("1111")
				.name("모모")
				.build();
		udao.save(user);		//save 메소드는 insert,update sql 
	}

}
