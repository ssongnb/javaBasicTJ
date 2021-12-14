package javaStudy;

public class AccessObjExam {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);
		System.out.println(obj.p2);
		System.out.println(obj.k);
		//System.out.println(obj.p3);
		//실행조차 안됨, 접근제어자 - 자기자신만 쓰기에
		
	}

}
