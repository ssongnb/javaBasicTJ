package variableExam;

import java.util.Scanner;
public class LogicalExam {

	public static void main(String[] args) {
		/* Logical 논리연산자 
		 * 		: 논리연산자는 둘 이상의 조건을 and 또는 or 연결하여 하나의 식으로 표현한다.
		 * 		
		 * 	  || (or) : 피연산자의 어느 한쪽만 true 최종값은 true로 변환
		 * 	  && (and): 피연산자 양쪽 모두 동시에 true의 값이여야만 최종값을 true로 변환
		 * 
		 * 	ex)	x	>	10 && x	< 20	(o)
		 * 		10	<	x && x	< 20	(o)
		 * 		10	<	  x	    < 20	(x)
		 * 
		 * 		i%2	==	0	||	i%3	==	0	//2의 배수도 ok 3의 배수도 ok
		 *  
		 */
		//q2. 문자를 하나 입력 받아서 그 문자가 숫자인지 문자(영문자)인지를 출력하시오. 
		// "문자를 하나 입력하세요"
		// "입력하신 문자는 숫자 입니다."
		// "입력하신 문자는 영문자 입니다."

		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 하나 입력하세요 : ");
//		String a = sc.nextLine();
//		char ch = ' ';
//		ch = a.charAt(0);
//		
//		if(ch >= '0'&& ch <='9') {
//			System.out.println("입력하신 문자는 숫자 입니다.");
//		}else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//			System.out.println("입력하신 문자는 영문자 입니다.");
//		}
		System.out.println("문자를 하나 입력하세요 : ");
		String s = sc.nextLine();
		int a;
			
		for(a=0; a<s.length();a++) {
			char c = s.charAt(a);
			if((0x61 <= c &&c <= 0x7A)||(0x41 <= c&&c <= 0X318E)) {
				a += 1;
				System.out.println("입력하신 문자는 영문자 입니다.");
			}else if(0x30 <= c &&c <= 0x39){
				a += 1;
				System.out.println("입력하신 문자는 숫자 입니다.");
			}if(a >= 32) {
				s = s.substring(0,a+1);
				break;
			}
		}
		
		
		
		
		
	}

}
