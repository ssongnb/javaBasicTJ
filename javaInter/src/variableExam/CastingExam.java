package variableExam;

public class CastingExam {

	public static void main(String[] args) {
		/* Casting 형변환 
		 * 		: 자료형의 타입을 일치시킨다.
		 * 		: 형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는것 
		 * 
		 *   ex) int 값과 double값을 계산하려면 먼저 두 값을 같은 타입으로 변화한 후  계산한다.
		 * 		 ***방법은 간단하다
		 * 			(타입)피연산자 
		 * 		 
		 * 
		 * 			괄호()는 "캐스트 연산자(형변환 연산자)" 라고 한다
		 * 		double d = 85.4;
		 * 		int score = d;		(x) //double이 더 크기에 int에 담기지 않는다.
		 * 		int score = (int)d;	(o)
		 * 		int score = 85;		//정수이기 떄문에  .4는 날라간다.
		 * 
		 * 		: boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
		 * 		: 기본형과 참조형간의 형변환은 불가능하다. 
		 * 
		 * 	정수형간의 형변환
		 * 		: 큰타입에서 작은타입으로 변환, 예를 들면 int의 값을 byte타입으로 변환하는 경우 그 크기의 차이만큼 잘려 나간다.
		 * 		     경우에 따라 '값 손실' "loss of data"가 발생할 수 있다.
		 *  	: 작은타입에서 큰타입으로 변환, 예를 들면 byte에서 int로 변환하는 경우 잘려나가는 경우가 없다. 
		 *  	     따라서 값 손실이 발생하지 않는다.
		 *  	     나머지 빈공간들은 0 또는 1로 채워진다.
		 *  
		 *  	byte 00001010
		 *  	int  000......00001010
		 * 
		 * 
		 * 	정수와 실수형간의 형변환
		 * 		: 정수형과 실수형은 완전히 다르기 때문에 정수형간의 변환처럼 간단히 처리 할 수 없다. 좀 더 복잡한 과정을 거친다.
		 * 	
		 * 		: 정수를 실수형으로 형변환
		 *			 
		 * 	
		 * 		: 실수를 정수형으로 형변환
		 * 
		 * 		
		 * 		: 자동 형변환
		 * 			서로다른 타입간에 대입이나 연산을 할 때는 형변환을 통해 일치시키는 것이 원칙이다.
		 * 			하지만, 경우에 따라 생략할 수 있다.
		 * 			 이것은 형변환을 하지 않는 것이 아니라 java가 형변환을 해주는 것이다.
		 * 		
		 * 			특히 계산할 때 자동형변화가 많이 일어난다. 연산과정에서 자동으로 현변환이 이루어지는 것을 "산술변환" 이라고 한다.
		 * 
		 * 			자동형변환은 값을 최대한 보존 할 수 있는 타입으로 자동 형변환이 된다.
		 * 		 *
		 */
		
		int i = 3;
		double d = 1.0;
		
		double s = i + d;
		int y = i + (int)d;
		System.out.println(s);
		System.out.println(y);
		
		
		
		
		
		
		
//		float f = 1234;
//		
//		System.out.println(f); //결과값: 1234.0으로 자동으로 .0 형변환 해주었다.
//		
//		byte b = (byte)1234;//byte는 크기가 작아1234가 전부 안들어가기에 byte로 값을 형변화 시켜주면 -46이란 값이 나온다.
//		System.out.println(b);
		
		
		
		
		
//		int i = 91234567;
//		float f = i;
//		
//		int i2 = (int)f;
//		
//		double d = i;
//		
//		int i3 = (int)d;
//		

		
		
		
		
		
		
//		float f = 9.1234567F;
//		double d = 9.1234567;
//		
//		//double d2 = f;
//		double d2 = (double)f;
//		System.out.println(d2);
//		System.out.printf("d=%-10.4f입니다.", d2);

		
		
		
//		int i = 10;
//		byte b = (byte)i;
//		
//		System.out.printf("[int]->[byte] i=%d -> b=%d%n", i, b);
//		
//		i = 300;
//		b = (byte)i;
//		System.out.printf("[int]->[byte] i=%d -> b=%d%n", i, b);
//		//loss of byte 발생
//
//		b = 10;
//		i = b; // i = (int)byte;
//		System.out.printf("[byte]->[int] b=%d -> i=%d%n", b, i);
//		
//		b = -2;
//		i = b;
//		System.out.printf("[byte]->[int] b=%d -> i=%d%n", b, i);
		
		
		
//		double d = 85.4;
//		//int score = d;
//		int score = (int)d;
//		
//		System.out.println(score);
	}

}
