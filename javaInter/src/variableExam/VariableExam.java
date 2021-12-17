package variableExam;

public class VariableExam {

	public static void main(String[] args) {
		/*	Variable(변수)란?
		 * 		: 단 하나의 값을 저장 할 수 있는 메모리 공간
		 * 		: 변수를 사용하기 위해서는 초기화를 해야 한다.
		 * 			ex) int age; (변수타입		변수이름)
		 * 				-> age라는 이름의 변수를 선언
		 * 		: 변수이름 - 메모리공간에 이름을 붙임. 같은 이름은 존재 할 수 없다.
		 * 		: 변수타입 - 변수에 저장 된  값의 종류를 저장하는 것. 정수int/실수double/문자String/....
		 * 			
		 * 			ex) int age = 25;		//변수 age를 선언하고 25로 초기화 한다.
		 * 				
		 * 				int a;
		 * 				int b;		-> int a,b;	//같은 변수는 같이 선언 할 수 있다.
		 * 
		 * 				int x = 0;
		 * 				int y = 0;	-> int x =0 , y = 0;
		 * 		: 변수를 사용하기 전에 적절한 값(0, 1, "")로 초기화를 한다.
		 * 	  변수의 초기화란?
		 * 		: 변수를 사용하기 전에 처음으로 값을 정하는 것을 말한다.
		 *   변수선언 규칙!
		 *  	1. 대소문자를 구분한다. 길이에는 제한이 없다.
		 *  	2. 예약어를 사용 할 수 없다.
		 *  	3. 숫자로 시작할 수 없다.(top10 -o  10top -x)
		 *  	4. 특수문자 '_','$'외 사용불가
		 *    ##권장 : 클래스명의 첫글자는 항상 대문자로 한다.
		 *    ##권장 : 변수명과 메소드명의 첫글자는 항상 소문자로 한다.
		 *    ##권장 : 여러번 사용할 수 있는 단어의 첫글자를 대문자로 사용한다.
		 *    ##권장 : 상수 이름은 전부 대문자 사용을 한다. 
		 *  
		 *   변수의 타입
		 * 		: 주로 사용하는 값은 크게 문자, 숫자 가 있고, 숫자는 정수/실수..로 나눠진다.
		 * 		: 값(data)의 종류(type)에 따라 저장될 공간의 크기와 형식을 정하는 것이 자료형
		 * 		
		 * 		: 자료형에는 크게 기본형, 참조형이 있다.
		 * 			기본형(primitive type) - 실제값이 저장, 총 8개
		 * 						논리(boolean) 문자(char) 정수(int long /byte short) 실수(double float).
		 * 		 	참조형(reference type) - 실제값이 저장 되어있는 주소값을 갖는다.
		 * 						기본형을 제외한 나머지
		 *   기본형(primitive type)
		 * 		: 논리형(boolean) - true or false, 조건식, 논리계산...에 사용
		 * 		: 문자(char) - 변수 하나에 한글자만 저장, 내부적으로는 숫자(정수-아스키코드값)로 저장이 된다.
		 * 		: 정수(int long /byte short) - 주로 int만 사용된다.
		 * 		: 실수(double float) - 주로 double만 사용된다. 
		 * 		
		 * 		int -              -2,147,483,648 ~ 2,147,483,648 까지만 담을 수 있다
		 * 		long - -9,223,372,036,845,775,808 ~ 9,223,372,036,845,775,807 까지 담을 수 있다.
		 * 
		 * 변수와 함께 많이 사용 되는 printf()
		 * 		: 지금까지 println을 많이 사용 했지만, println은 변수값을 그대로 출력하기 때문에 다른 형태로 출력하기 힘들다.
		 * 		   예를 들면 소수 2자리까지만 출력..
		 * 
		 *		: printf();는 println처럼 줄바꿈을 하지 않는다. 고로 줄바꿈 할 때는 %n을 넣어준다
		 *
		 * 	ex) int age = 14;
		 * 		int year = 2021;
		 * 		System.out.printf("age:%d", age);
		 * 		System.out.printf("age:%d", age);
		 * 		System.out.printf("age:%d year:%d", age, year);
		 * System.out.printf("age:%d%n year:%d", age, year);
		 * 
		 * 		%d - 정수형 출력	:10진수 decimal
		 * 		%s - 문자형 출력	:String 
		 * 		%f - 실수형 출력	
		 * 		%c -문자열 출력		
		 * 		%n - 줄 바꿈	
		 * 		%b - boolean출력
		 * 		
		 * Constant 상수란?
		 * 		: 변수와 마찬가지로 값을 저장 할 수 있는 공간변수와는 달리 한번 값을 저장하면 변경하지 않고 사용한다.
		 * 		: 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수선언
		 * 		: 관습적으로 상수는 대문자로 표기한다. 
		 * 	final int MAX_SPEED = 100; //	상수를 final로 선언하면 변경이 불가능하다. (절대값)
		 * 		: 상수 선언은 반드시 선언과 동시에 초기화 해야만 한다.
		 * 	final int MAX_SPEED; (x)
		 *  MIN_SPEED = 30; (x) //상수의 값은 변경 할 수 없다. 
		 *  	: 상수의 이름 모두 대문자로하는 것이 암묵적인 관례이다.
		 *  
		 *   int i = 'A'; 		// 문자 'A'의 코드 값이 저장된다.
		 *   long l = 123;		// int 의 크기보다 long의 크기가 더 크다.
		 *   double d = 3.14f	// double의 크기가 float보다 크다.
		 *   
		 *   float f = 3.14; (x)// **에러 double을 float에 넣을 수 없다.
		 *   					// 무조건 double은 float에 넣을 수 없다.(크기와 상관 없이)
		 *   int i = 4532156584548542151254L;	(x)//**에러 long의 크기가 더 크기때문에 int에 넣을 수 없다.
		 *   									   //형이다른것보다 작은 것을 큰것에 넣을 수 없다. 
		 * 		
		 */
		
		
		
		
//		String url = "www.naver.com";
//		float f1 = .10f;
//		float f2 = 3.14e3f;
//		double d = 1.23456789;
//				
////		System.out.printf("f1 : %f",f1);
////		System.out.printf("f2 : %f",f2);
////		
//		System.out.printf("d : %10.2f%n",d);// %뒤10은 자리 확보  
//											//**(많이사용).뒤에 는 소수점아래 2자리를 의미
//		
//		System.out.printf("Address : %s%n", url);
//		System.out.printf("Address : %10.8s%n", url); //조금만 나타내고 싶을때 인덱싱에서 처리
//													  //10칸을 만들어 놓고 8개를 나타냄 - 총자리수 
//													  //기본 오른쪽 정렬
//		System.out.printf("Address : %-10.8s%n", url);//-는 왼쪽 정렬
		
		
		
		
		
		
		int curPos = 0; //현재 위치 current position
		int lastPos = -1; //마지막위치 last position
		
		
		
		
		//두 변수의 값 교환
		int x = 10;
		int y = 20;
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//		
//		x= y;//x20 y20
//		y= x;//x20 y20 
//		System.out.println(x);
//		System.out.println(y);
		
		//int x = 10; int y = 20;
		int temp;//임시변수
		temp = x;	//temp 10 	x10		y20
		x = y;		//temp 10 	x20		y20
		y = temp;	//temp 10 	x20 	y10
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		//파리썬에서의 두변수 값 교환  x,y = y,x
		
		//알고리즘 - 문제해결방법/회사에서 입사시 알고리즘 테스트 多
		
		/*
		 * int year = 0; int age = 15; 
		 * System.out.println(year);
		 * System.out.println(age);
		 * 
		 * year = age + 2000; //15 + 2000 -> 2015 year 
		 * age = age + 1; //15 + 1 -> 16 age
		 * 
		 * System.out.println(year); System.out.println(age);
		 */
		

	}

}
