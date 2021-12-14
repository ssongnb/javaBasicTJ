package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		//생성자는 반드시 1개 이상 존재해야만 한다.
		//개발자가 만들지 않으면 자동으로 
		//기본생성자 default constructor를 자바가 만들어준다.
		//Car c1 = new Car();//밑에 생성자를 만들어 냄으로서 기본생성자인 c1을 사용할 수 없다.
		Car c2 = new Car("Grandeur");
		
		System.out.println(c2.name);

//		//메소드 호출, 직접 찍어내는 경우 많이 없, 자동으로 다 찍어낸(bin)
//		c1.print();
		
		
		
	}

}
