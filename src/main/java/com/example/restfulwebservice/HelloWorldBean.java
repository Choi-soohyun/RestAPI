package com.example.restfulwebservice;
// lombok (빈클래스 만들 때 get, set, equals등등 다 자동생성이 됨.)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	// get, set 만들겠다.
@AllArgsConstructor // 모든 아규먼트를 가지고 있는 컨스트럭터 만들겠다.
@NoArgsConstructor // 기본생성자 생성하겠다.
public class HelloWorldBean {
	private String message;

	// 이게 AllArgsConstructor가 알아서 만들어준다.
//	public HelloWorldBean(String message) {
//		this.message = message;
//	}
	
	
}
