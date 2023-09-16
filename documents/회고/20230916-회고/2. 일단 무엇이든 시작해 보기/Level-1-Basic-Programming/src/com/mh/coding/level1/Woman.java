package com.mh.coding.level1;

public class Woman implements People{

	@Override
	public void say() {
		System.out.println("저는 여자 입니다");
	}

	@Override
	public String listen(String message) {
		return "여자는 잘 들어요 " + message;
	}

	@Override
	public void sin() {
		System.out.println("사과를 먹었어요");
	}

	@Override
	public void breath() {
		System.out.println("숨을 쉬어요");
	}

}
