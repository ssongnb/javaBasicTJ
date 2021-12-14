package exceptionStudy;

public class Test {

	public void sayNick(String nick) throws FoolException{
		
		if("fool".contentEquals(nick)) {
			throw new FoolException();
			//강제로 에러를 일으키는 코드
			//FoolException클래스를 만들어서 에러를 강제
		}
		System.out.println("당신의 별명은 "+nick+"입니다.");
	
	}

	
	
	public static void main(String[] args) {
		Test test = new Test();
		try {
		test.sayNick("fool");
		//에러가 발생이되면 처리해서 출력하지 말고, 그 에러를 던져줘라 -throws
		test.sayNick("genious");
	}catch(FoolException e) {
		System.out.println("에러가 발생했습니다.");
		}
	}
}
	
	
	
	
	
	
//	public void sayNick(String nick) {
//		try {
//		if("fool".contentEquals(nick)) {
//			throw new FoolException();
//			//강제로 에러를 일으키는 코드
//			//FoolException클래스를 만들어서 에러를 강제
//		}
//		System.out.println("당신의 별명은 "+nick+"입니다.");
//	} catch (FoolException e) {
//		System.out.println("에러가 발생했습니다.");
//	}
//	}
//
//	
//	
//	public static void main(String[] args) {
//		Test test = new Test();
//		test.sayNick("fool");
//		test.sayNick("genious");
//	}
	
//	public void sayNick(String nick) {
//		if("fool".contentEquals(nick)) {
//			return;
//		}
//		System.out.println("당신의 별명은 "+nick+"입니다.");
//	}
//	
//	
//	public static void main(String[] args) {
//		Test test = new Test();
//		test.sayNick("fool");
//		test.sayNick("genious");
//	}

//}
