package variableExam;

import java.util.Scanner;
public class OperatorExam {

	public static void main(String[] args) {
		/*  연산자 Operator
		 * 		: 연산자는 '연산을 수행하는 기호 ' "+,-,/..."
		 * 		: 연산자는 연산을 수행하는 기호이며 피연산자는 작업대상 
		 * 		: 연산자는 피연산자로 연산을 수행하고나서 항상 그 결과값을 반환한다.
		 * 			(연산대산, 변수, 상수, 수식 ...)
		 *	ex) 연산자 +  
		 *		x + 3 		- 식
		 *		x,3이 피연산자
		 *		: 연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라하고
		 *		   그 식을 계산하여 결과를 얻는 것을 '평가 evaluation'이라고 한다.
		 *
		 *	연산자의 종류
		 *  1. 산술연산자 : + , - , # , %(나머지 연산자**홀수,짝수,배수..) , / 
		 *  2. 비교연산자 : > , < , <= , >= , ==(같다) , !=(같지 않다)
		 *  3. 대입연산자 : = (우변의 내용을 좌변으로 저장)		
		 *  4. 논리연산자 : || , && . | , &
		 *  5. 기타연산자 : 삼항연산자(if없이 조건문)...
		 * 
		 * 
		 *	연산자의 갯수에따라
		 *	1. 단항 연산자
		 *	2. 이항 연산자
		 *	3. 삼항 연산자  ((조건식) ? true : false);
		 *
		 *	연산자의 우선순위
		 *		:일반 수학계산의 순서와 동일, 상식적인 선에서 해결
		 *		  - *이 +보다 먼저 수행/괄호 안의 것을 먼저 계산한다.
		 *			5 + 3 * 4
		 *				1) 3 * 4 = 12	2) 5 + 12 = 17
		 *
		 *	-.단항 연산자
		 *		: 증가 연산자 - 피연산자의 값을 1 증가 시킨다.
		 *			- ++
		 * 		: 증감 연산자 - 피연산자의 값을 1 감소 시킨다.
		 *			- --
		 *			i++ : 값이 먼저 참고 되고 나서 증가 - 후위형
		 *			++i : 값이 먼저 증가 되고 나서 참조 - 전위형
		 *		: 단항 연산자 하나만 단독으로 사용될 때는 차이가 없다.
		 *
		 *
		 *	 -.이항 연산자
		 *
		 *	 -.삼항 연산자
		 *
		 *
		 *	나머지연산자%
		 *		: 나머지연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 그 나머지만 결과로 반환하는 연산자이다.
		 *		: 나머지 연산자는 ***(홀수, 짝수, 배수) 검사에 많이 사용된다.
		 *	
		 *	등가비교연산자  == !=
		 *		: 두개의 피 연산자의 값이 같은지 == 또는 다른지 !=를 비교하여 
		 *		: == 같으면 true 다르면 false
		 *		: != 다르면 true 같으면 false
		 *
		 *	무자열 비교 .equals()
		 *		: 문자열을 비교할 떄는 ==를 쓰지말고 반드시 .equals()를 사용하자.
		 *		: 
		 *
		 *
 		 */
		
		//q 1. 정수를 하나 키보드로 입력받아 그 수가 홀수인지 짝수인지 출력하는 프로그램을 작성
	    // "입력하신 수 ???는 홀수 입니다.""
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		
		int i= sc.nextInt();	
		String s = (i%2==0)?"짝수":"홀수";
		
		System.out.printf("입력하신 수 %d 는 %s입니다.",i,s);
		
		
//		String str1 = "abc";
//		String str2 = new String("abc");
//		String str3 = "abc";
//		//똑같은 글자지만 다른 메모리에 저장되어 있어 ==은 같은 메모리 주소가 같니?를 물어 보는거라 문자열을 비교할 때 글자가 같아도 false가 나올 수 있다.
//		//.equals()는 정말 내용이 같은지를 비교 하는 것으로 문자열 비교 할 때 사용한다.  
//		
//		System.out.printf("\"abc\"==\"abc\"? %b%n", "abc" == "abc" );
//		System.out.printf("str1==\"abc\"? %b%n", str1 == "abc" );
//		System.out.printf("str2==\"abc\"? %b%n", str2 == "abc" );
//		//글자를 비교할때는 ==를 쓰지말고 .equals()을 써야한다.
//		
//		System.out.println();
//		
//		System.out.printf("\"abc\".equals(\"abc\"?) %b%n", "abc".equals("abc"));
//		System.out.printf("str1.equals(\"abc\"?) %b%n", str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\"?) %b%n", str2.equals("abc"));
//		
//		System.out.println();
//		
//		System.out.printf("str1==str3? %b%n", str1 == str3);
//		System.out.printf("str2==str3? %b%n", str2 == str3);
//		System.out.printf("str1.equals(str3)? %b%n", str1.equals(str3));
//		System.out.printf("str2.equals(str3)? %b%n", str2.equals(str3));
//		
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		System.out.println(System.identityHashCode(str3));
//		//메모리의 위치값
	
		
		
		
		
//		System.out.println(1 == 0);
//		System.out.println(1 != 0);
		
		
		
//		int x = 10 , y = 7;
//		
//		System.out.printf("x를 2로 나눈 나머지 %d 입니다.%n",x%2);
//		System.out.printf("y를 2로 나눈 나머지 %d 입니다.%n",y%2);
//		System.out.printf("x를 5로 나눈 나머지 %d 입니다.%n",x%5);

		
		
		
		
		
		//System.out.printf("%d을 %d로 나누면 %n",x,y);
		//System.out.printf("몫은 %d, 나머지는 %d 입니다.%n", x/y,x%y);
		
		
		
		
		
//		int i = 5, j= 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		
//		System.out.println("i= " + i + " j= " + j);
		
		
		
		
		
		
//		int i = 5 , j = 0;
//		j = i++;
//		
//		System.out.println("j=i++ 실행후, i= "+i+"  j= "+j);
//		
//		i = 5;
//		j = 0;
//		j = ++i;
//		System.out.println("j=++i 실행후, i= "+i+"  j= "+j);
		
		
		
		
		
//		// 단항연산자를 단독으로 사용하면 전위 후위 차이가 없다.
//		 int i = 5;
//		 i++;
//		 System.out.println(i);
//		 
//		 i = 5;
//		 ++i;
//		 System.out.println(i);
		
		
		
		
		

	}

}
