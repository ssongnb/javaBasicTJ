package controlExam;

import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		/* 제어문 (control Statement - If, Switch)
		 * 		:코드의 제일 위에서 아래로 한 문장식 순차적으로 진행되는 프로그램의 흐름을 조절하여 일부분은 건너 뛰기도 하고 다시 위에서부터 내려올 수 있게 제어한다.
		 * 
		 * 	if(score > 60){
		 * 		System.out.println("합격입니다.");
		 * 	}
		 * 
		 * 
		 */
		
		int score = 80;
		
		if(score > 60){ //80>60->true
			  		System.out.println("합격입니다.");
			  	}
		/*  (90 <= x && x <=100) 점수 x가 90점이상 100점 이하 동시에 만족
		 *  (x < 0 || ㅌ >100) 점수 x가 0미만 또는 100점 초과 하나만 만족
		 *  (x%3 == && x % 2 != 0) x가 3의 배수이기는 하지만 2의 배수는 아니다.
		 *  (depar == "영업부" || depar =="기획부") 영업부와 기획부만 조건
		 */
		
		 if (true) {
			 System.out.println("welcom");
			 System.out.println("Hello");
		 }// {}처리를 해야 안의 내용이 오류없이 
		 
		 /* if - else 구문
		  * 	: else는 그 밖의 나머지 모든 것이라는 의미
		  * 	: 경우의 수가 3개 이상이면 else if 구문을 사용한다.
		  * 	: 조건을 만족하면 더 이상 다른 조건식은 확인하지 않는다. 
		  * 
		  * if (조건식){
		  * 	true..
		  *  }else if(조건식){
		  *  	true...
		  *  }else{
		  *  	else...
		  *  }
		  *  
		  *  
		  *  - if 중첩문
		  *  if (조건식){
		  * 	true..
		  *  }else{
		  *  	if (조건식){
		  *  		true..
		  *  	 }else{
		  *  		else...
		  *  	  }
		  *  }
		  *  -> 이런 사용방법은 좋지 않다 (가독성이 떨어짐)
		  *  
		  * 
		  */
		 //q.정수를 입력 받아 98이상이면 "A+"
		 //				94이상이면 "A"
		 //			 	90이상이면 "A-"
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("점수를 입력하세요 : ");
		 int score1 = sc.nextInt();
		
		 //삼항문을 밖으로 꺼내 더 깔끔하게 
		 
		 if(score1>=90){
			 System.out.println((score1>= 98) ? "A+": (score1 >= 94) ? "A":"A-");
		 }else if(score1>=80) {
			 System.out.println((score1>= 88) ? "B+": (score1 >= 84) ? "B":"B-");
		 }else if(score1>=70) {
			 System.out.println((score1>= 78) ? "C+": (score1 >= 74) ? "C":"C-");
		 }else if(score1>=60) {
			 System.out.println((score1>= 68) ? "D+": (score1 >= 64) ? "D":"D-");
		 }else {
			 System.out.println("F");
		 }
		 
		 
		 
		 
		 
		 
	}

}
