package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Member;
import com.example.demo.Service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	
	@RequestMapping("join")
	public String NewRegister() {

		return "join";

	}

	@PostMapping("join")
	public String SavetoMember(Member member, @RequestParam String name, @RequestParam String mail, Model model) {
		Member result = memberService.savetor(member);

		result.setName(null);
		result.setMail(null);
		result.setPassword(null);

		model.addAttribute("name", name);
		model.addAttribute("mail", mail);

		return "registsuccess";

	}
	
	@RequestMapping("login")
	public String login() {
		System.out.println("aaa");
		return "login";
	}



}
