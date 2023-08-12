package hello.maven.service.user.impl;

import org.springframework.stereotype.Service;

import hello.maven.domain.UserInfo;
import hello.maven.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public int saveUser(UserInfo user) {
		System.out.println("abd");
		return 0;
	}

}
