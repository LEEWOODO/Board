package com.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "/members")
	@ResponseBody // public @ResponseBody String testByResponseBody()와 같이 리턴 타입 좌측에 지정 가능
	public Map<Integer, Object> testByResponseBody() {
		
		Map<Integer, Object> members = new HashMap<>();
		
		for(int i = 0 ; i<=20 ; i++) {
			Map<String, Object> member = new HashMap<>();
			member.put("idx", i);
			member.put("nickname", i+"길동");
			member.put("height", i+20);
			member.put("weight", i+30);
			members.put(i, member);;
			
		}
		
		
		return members;
	
		
	}
	
}
