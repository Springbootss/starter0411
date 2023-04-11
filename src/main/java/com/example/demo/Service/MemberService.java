package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Ponjiri;
import com.example.demo.Entity.Member;

@Service
public class MemberService {
	
	@Autowired
	private Ponjiri p;
	
	
	public Member savetor(Member member) {
		Member result=p.save(member);
		return result;
		
			
	}
	
//	
//	public Member showMember(Member member) {
//		
//		
//		
//		
//		return result;
		
//			
//	}
	



	public Member postMember(Member member) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	


}
