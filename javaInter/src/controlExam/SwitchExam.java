package controlExam;

import java.util.Random;
import java.util.Scanner;
public class SwitchExam {

	public static void main(String[] args) {
		/* Switch구문
		 * 		: if문은 항목이 많아 질수록 복잡해지고 코드 가독성이 많이 떨어진다.
		 * 		: if문은 평균적인 처리시간도 항목이 늘어날 수록 길어지게 된다.(하나씩 다 검사하므로)]
		 * 		: if문과 달리, 보다 간결하고 알아보기 쉬우며 가독성이 더 뛰어나다
		 * 		: 보통 처리해야하는 경우의수가 많은경우 switch문을 사용한다.
		 * 		: switch 만든 모든 구문은 if문으로 구현할 수 있지만 반대의경우 구현할 수 없다.(if가 더 크다)
		 * 
		 * 	 switch문 작동법
		 * 	  1. 조건식을 계산
		 * 	  2. 조건식을 만족하는 case문으로 이동한다.
		 * 	  3. 해당 case문의 구문들을 실행한다.
		 * 	  4. break 만나기전까지는 모든 구문을 전부 실행한다.
		 * 
		 * 	 switch문의 제약 조건
		 * 	  * switch구문의 조건식은 결과는 정수 또는 문자열이다.
		 * 
		 */
			
		//q. 특정 월을 입력 박아서 3,4,5 봄 / 6,7,8여름/9,10,11 가을/12,1,2겨울
		//		"?월의 계절은 ?입니다."
		//		조건 - switch구문의 총 줄의 수는 10줄 내외
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("계절이 궁금한 달을 입력하세요 : ");
//		int a = sc.nextInt();
//		switch(a) {
//		case 1 :
//			if( 2 < a && 6 > a) {
//				System.out.println(a+" 월의 계절은 봄입니다."); }
//				break;	
//		case 2 :
//			if( 5 < a && 9 > a) {
//				System.out.println(a+" 월의 계절은 여름입니다."); }
//				break;	
//		case 3 : 
//			if(  < a && 9 > a) {
//				System.out.println(a+" 월의 계절은 여름입니다."); }
//				break;
//		}
	
//		String season = "";
//		switch(a) {
//		case 3: case 4: case 5:season="봄";break;
//		case : case 4: case 5:season="봄";break;
//		case 3: case 4: case 5:season="봄";break;
//		case 3: case 4: case 5:season="봄";break;
//		}
//		System.out.println(a+"월의 계절은"+ season+"입니다.");
		
		
//		q2. 가위(1) 바위(2) 보(3) 중 하나를 입력
//		당신은 1이고 컴퓨터는 2입니다.
//		당신이 졌습니다
		
//		가위(1) 바위(2) 보(3) 중 하나를 입력
//		당신은 1이고 컴퓨터는 3입니다.
//		당신이 이겼습니다
//		
//		가위(1) 바위(2) 보(3) 중 하나를 입력
//		당신은 1이고 컴퓨터는 1입니다.
//		비겼습니다.
		
//		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요");
//		String tmp = sc.nextLine();
//		//Random r = new Random();
//		
//		int u =Integer.parseInt(tmp);
//		int m =(int)(Math.random()*3)+1;
//		//int com = 1+ r.nextInt(3); //컴퓨터의 램덤값 불러오기
//		//System.out.prinㄹ("당신은 {}이고 컴퓨터는 {}입니다.",u,com);
//		
//		System.out.print("당신은 "+ u +" 이고 컴퓨터는 "+ m +" 입니다.");
//		
//		
//		switch(u - m) {
//		case 1 : case -2 : 
//			System.out.println("당신이 이겼습니다.");
//			break;
//		case -1 : case 2 :
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 0:
//		System.out.println("비겼습니다.");
//			break;
//							
//						
//				
//			
//		}
		
//		q. "주민등록번호를 입력하세요 "000000(6)-0000000(7)
//			"당신은 남성입니다."
//			"당신은 여성입니다."
		
		
		System.out.println("주민등록번호를 입력하세요.( - 없이 입력하세요) : ");
		
		char i;
		i =  sc.nextLine().charAt(7);
		
			
		switch(i) {
		case '1': case '3':
			System.out.println("당신은 남자 입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자 입니다.");
			break;
		}
	
	
	
	}
	
		

}
