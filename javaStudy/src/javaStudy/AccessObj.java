package javaStudy;

public class AccessObj {
	public int p =3;
	//public은 모든 접근 허용
	protected int p2 = 4;
	//protected는 같은 패키지(폴더)에서만 접근 허용
	//단, 상속받은 경우는 예외
	int k = 2;
	//default(기본), 같은 패키지 내에서만 허용, 생략가능
	private int p3 = 1;
	//자기 자신만 쓸수 있다
	
	//public>> protected>> (default)>> private
	
}
