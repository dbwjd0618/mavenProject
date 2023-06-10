package hello.maven.service.Impl;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;

import hello.maven.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public int saveMember(Member member) {
		System.out.println("abd");
		return 0;
	}

}
