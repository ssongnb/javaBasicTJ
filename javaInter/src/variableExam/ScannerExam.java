package variableExam;

import java.util.Scanner;
public class ScannerExam {

	public static void main(String[] args) {
		/* Scanner() 사용자로부터 입력 받아 변수를 활용
		 * import java.util.Scanner; Scanner 클래스 사용을 위한 추가
		 * 
		 * Scanner sc = new Scanner(System.in); 객체 생성	: 객체는 한번만 만든다.
		 * 
		 * String input = sc.nextLine(); 	- 문자열 입력
		 * int num = sc.nextInt();			- 정수 입력		: 숫자를 하나씩 받아서 사용할 떄 편리
		 * 
		 * 
		 * String input = sc.nextLinr();	- 문자열로 입력받아
		 * int num = Integer.parseInt(input); 숫자로 변경	: 숫자를 여러가지 받을 때 용이
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);	//객체생성
		System.out.println("두 자리 정수 하나만 입력하세요>>> ");
		
		String input = sc.nextLine();			//문자열 입력
		
		int num = Integer.parseInt(input);		//문자로 받아서 숫자로 변경
		
		System.out.println("입력내용 : "+ input);
		System.out.printf("숫자로 : %d%n", num);

	}

}
