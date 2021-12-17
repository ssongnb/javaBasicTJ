package controlExam;

import java.util.Scanner;
public class ForEzam {

	public static void main(String[] args) {
		/* For 반복문
		 * 		: 어떤 작업을 반복적으로 수행 되도록 할 때 사용
		 * 		: 반복 횟수를 정확히 특정할 때 주로 사용
		 * 		: 문법이 직관적이라 가독성이 좋다.
		 * 				for (star; stop; step;)
		 * 					  초기값; 조건식; 증감식;
		 * 
		 * 	 start(초기값은 한번만)-> 조건식 -> 수행 문장들..-> 증감식 
		 * 					  -> 조건식 -> 수행 문장들..-> 증감식 	
		 * 					  -> 조건식 -> 수행 문장들..-> 증감식
		 * 					  -> 조건식 -> 종료
		 * 
		 * 	초기값 : 반복문에 사용할 변수를 초기화. 처음에 딱 한번만 실행된다. 
		 * 		   보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능하다.
		 * 
		 * 		for(int i=1, j=0; i<10; i++){}
		 * 
		 *  조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는 경우 반복 종료.
		 *  	     조건식을 잘못 설정 할 경우 한번도 실행하지 않는 경우가 발생 할 수 있다/ or 영원히 반복되는 경우가 발생 할 수 있다.(무한루프)
		 * 
		 *  증감식 : i++, i--, i+= 2(i = i + 2)
		 *  
		 *  		초기값, 증감식, 증감식은 전부 생략 가능하다.
		 *   		for (;;) 무한 반복...
		 *   
		 */
		//q. 1부터 5까지를 tl, t
		
		
//		for(int a =1; a<6; a++) {
//			System.out.println(a);
//		}for(int a =1; a<6; a++) {
//			System.out.print(a);
//		}
		
		//q. 1부터 10까지의 합을 출력하시오. 단, 누계값까지 출려하세요.
		//		1부터 1까지의 합 : 1
		//		1부터 2까지의 합 : 3...
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요 : ");
//		int b = sc.nextInt();
//		
//		for(int i=0; b+i>0; i++) {
//			System.out.printf("1 부터 %d 까지의 합 : %d",b+i);
//		}
		
		
		
//			q.	1		10
//				2		9
//				3		8
//					...
		
		
//		for(int j=1, n=10; j < 11; j++,n--) {
//			System.out.printf("%d\t %d%\n",j,n);
//				}
		
		
		
		//구구단
		
//		for(int c=2; c<10; c++) {
//			for(int d=1; d<10; d++) {
//				//System.out.println(c+"x"+d+"="+c*d);
//				System.out.printf("%d * %d = %d\t",c,d,c*d);
//			}System.out.println();
//		}
//		
		
		
		
//		q/ *을 출력할 라인의 수를 입력하세요 > S
		System.out.println("*을 출력할 라인의 수를 입력하세요 : ");
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print("*");
		}System.out.println("");
	}
		
		
		System.out.println("*을 출력할 라인의 수를 입력하세요 : ");
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i++) {
			for(int j=b; j>=i; j--) {
			System.out.print("*");
		}System.out.println("");
	}
		
		
		
	/* 향상된 for 구문(for each)
	 * 	  for (타입 변수명 : 배열 또는 컬렉션)
	 * 
	 */
		
//		int[] arr = {1,2,3,4,5};
		//1
		//2
		//3
		//4
		//5
		
//		for(int i = 0; i< arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
//		int sum = 0;
//		int count= 0;
//		for(int i : arr) {
//			System.out.println(i);
//			sum += i;
//			count++;
//		}
//		System.out.printf("촘합은 %d입니다.\n",sum);
//		System.out.printf("촘합은 %d입니다.",count);
		
		
		
		
		
	}	
}
