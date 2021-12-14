package javaStudy;

public class EnumExam {

	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	//static 객체 생성없이도 접근하여 사용
	//final 상수로 선언 - 완전한 상수(항상 일정한 수)
	//String 문자열
	//상수형태로 선언 할 경우 대문자를 사용한다.
	
	public static void main(String[] args) {
		String gender1;
		
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		//gender1에 원래는 male과 female만 넣고 싶었는데, boy를 넣었을 때 문제가 생기지 않음
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		gender2 = "girl";
		gender2 = 1;
		//gender2는 특정값만담을 수 있게 제어
		
		

	}

}
//열거형 . 자료형
enum Gender{
	MALE,FEMALE;
}

