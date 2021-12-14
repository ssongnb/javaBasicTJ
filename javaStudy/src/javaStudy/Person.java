package javaStudy;

public class Person {
	
	String name;
	int age;
	
	public Person(int a) {
		this.age=a;
		//숫자 하나만 들어왔을 때 age로 입력받게끔
	}
	public Person(String n, int a) {
		this.name = n;
		this.age =a;
		//this를 생략해도 되지만 웹개발시 꼭 넣어
		//지금은 개게가 하나라 의미가 크지 않지만 웹개발시 객체가 많이 사용되므로
		//많아지면 에러가 날 수있음. this를 넣음으로 더 명확하게 person의 값이라는 것을 알리자
		
	}
	public Person(int a, int b) {
		this.age =a;
		this.age = b;
	}
	
}


