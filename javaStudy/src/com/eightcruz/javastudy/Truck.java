package com.eightcruz.javastudy;

public class Truck extends Car{

	public Truck() {
		super("트럭");
		//super가 생략되어 있는 상테이다 - 자동으로 추가되어있다
		System.out.println("Truck의 기본 생성자 입니다.");
	}
}
