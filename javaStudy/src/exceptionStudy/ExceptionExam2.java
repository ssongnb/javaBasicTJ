package exceptionStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i =10;
		int j = 0;
		int k = divide(i,j);
		System.out.println(k);
		System.out.println("종료");
	}

	public static int divide(int i, int j) { 
		try {
			int k = i/j;
			return k;
		}catch(Exception e) {
			System.out.println("에러가 발생했습니다."+e.toString());
			return 0;
		}
	}
}
/*
 * [트랜잭션]
 * 상품 배송()
 * 	주문()
 * 	포장()
 *	영수증()
  	배송시작()
 * 
 * -pseudo code:수도코드
 * 주문(){
 * }
 * 포장(){
 * }
 * 영수증(){
 * }
 * 배송시작(){
 * }
 * :하나라도 누락되면 발송이 되면 x
 * : 에러처리를 난 곳에서하면 멈춘다./되돌아가서 계속 반복된다.
 * */
 