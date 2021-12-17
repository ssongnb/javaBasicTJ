package controlExam;

import java.util.Scanner;
public class WhileExam {

	public static void main(String[] args) {
		/* While 반복문은 for문에 비해서 구조가 간단하다.
		 * 		: 조건식이 참일 동안 반복 수행한다.
		 * 		: 조건식 생량 불가, 보통 조건식에 true를 엏어 무한 반복 수행
		 * 
		 * 		for(::)		While(true)
		 * 
		 * 
		 * 	 While (조건식){
		 * 
		 * 	}
		 */

		//for(초기화;조건식;증감식)
		//for(int i=0; i<5; i++)

//		초기화
//		while(조건식) {
//			증감식
//		}
//		int i = 0;
//		While(i<5){
//			i++
//		}
		
//		q. 10카운트다운 시작, 마지막에 Awesome!
	
//		System.out.println("카운트다운 시작!!");
//		int c=10;
//		while(c>=1) {
//			
//			System.out.println(c);
//			c--;
//			long j =999_999_999L;
//			while(j >= 0) {
//				j--;
//			}
//			
//			
//		}System.out.println("Awesome!");
		
//		q. 숫자를 입력하면 그 각각 숫자들의 합을 계산하여 출력
		//숫자를 입력하세요요
		// 각자리 수의 합 : 6
		
		
		System.out.println("숫자를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		
//		String temp = sc.nextLine();
//		
//		num = Integer.parseInt(temp);
		
		int num = 0;
		int sum = 0;
		
		num = sc.nextInt();
		
		while(num!=0) {
			sum += num%10;
			num/=10;
		}
		System.out.println("각자리 수의 합 : "+sum);
		
		
		
		//q. 누계의 합 구하기 1-10
		
		int e = 10;
		int q = 1;
		int nan = 0;
		
		while(q <= e) {
			
			nan += q;
			
			System.out.println(q+ "-" + nan);
			q++;
		}
}
}
