package variableExam;

import java.util.Scanner;
public class TriExam {

	public static void main(String[] args) {
		/* 삼항 연산자(조건)
		 * 		기본형태  = (조건식) ? true:false
		 * 		: 첫번째 피연산자 조건식의 평가 결과에 따라 true면 두번째 항 false면 세번째 항의 값이 결과가 된다. 
		 * 		: 조건식의 괄호는 필수가 아니다.
		 * 		: 여러번 중첨하면 가독성이 떨어진다. 
		 * 			-> 꼭 필요한 경우에만 사용한다.
		 * 	
		 * 	if(조건식){
		 * 		true;
		 *  }else{
		 * 		false;
		 * }
		 * 
		 * 
		 * (조건식) ? "A" : (조건식) ? "B" : (조건식) ? "C" : "D" ;
		 *		/여러개의 조건식을 삼항연산자를 이용해 할 수 있다.
		 *
		 * if(조건식){
		 * 		"A";
		 * }else if(조건식2){
		 * 		"B";
		 * }else if(조건식3){
		 * 		"C";
		 * }else{
		 * 		"D";
		 * }
		 * 
		 * 
		 */

		//Q1. 1. 삼항연산자를 사용하여 100점 미만 90점 이상이면 "A"
		//						90점 미만 80점 이상이면 "B"
		//						80점 미만 70점 이상이면 "C"
		//						나머지는 전부 "D"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");			
		int num = sc.nextInt();
		
		
		System.out.println((num >= 90) ? "A" : (num >=80) ? "B" : (num >=70) ? "C" :"D");
		
		System.out.println("x의 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("y의 값을 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println(a = a + (b < a ? 1 : 2)); 
		
		
		
		int x, y, z ;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		 
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		//절대값
		
		signX = x > 0 ? '+': x == 0 ? ' ' : '-';
		signY = y > 0 ? '+': y == 0 ? ' ' : '-';
		signZ = z > 0 ? '+': z == 0 ? ' ' : '-';
		//양수인지 음수인지 0 인지 
		
		System.out.printf("x = %c%d%n",signX, absX);
		System.out.printf("y = %c%d%n",signY, absY);
		System.out.printf("z = %c%d%n",signZ, absZ);
		
		
	
	
	
		}
	
	
	}


