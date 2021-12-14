package javaStudy;

public class Car1Exam extends Car1{

	public Car1Exam(String name, int number) {
		super(name, number);
		
	}

	public static void main(String[] args) {
		
		Car1 car = new Car1("포니",1234);
		
		System.out.println("name: "+ car.name);
		System.out.println("number: "+ car.number);

	}

}
