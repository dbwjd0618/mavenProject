package hello.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

	@GetMapping("/signUp")
	public String signUp() {
		return "members/signUp";
	}
}
