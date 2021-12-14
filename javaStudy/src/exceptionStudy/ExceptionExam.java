package exceptionStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		
		int[]array = new int[10];
		
		try {
			array[20] = 5;
			
		}catch(Exception e) {
			System.out.println("배열의 범위를 지나쳣어요.\n"+e.toString());
		}
		
		System.out.println("성공");
		
		
		
		
		
		
//		int i = 10;
//		int j = 0;
//		try {
//			int k = i/j;
//			System.out.println(k);
//		}catch(Exception e/*자료형  변수명*/){
//			System.out.println("예외가 발생했습니다.\n"+e.toString()/*자료형을 문자열로 나타내라*/);
//		}finally {
//			System.out.println("에러 발생 여부와 상관 없이 항상 실행");
//		}
//		
//		
//		System.out.println("main end!!");
//
//		/*k의 값을 0으로 두었을때 나오는 에러 Exception in thread "main" 
//		 java.lang.ArithmeticException: / by zero
//		at javaStudy/exceptionStudy.ExceptionExam.main
//		(ExceptionExam.java:9) - 실제로 많이 보게되는 에러창
//	*/
	}

}
