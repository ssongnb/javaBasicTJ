package javaStudy;

public class Bus extends Car{
//상속받은 자식은 확장(자신의 기능)기능까지도 사용할 수 있는게 상속의 진정한 의미
	public void ppangppang() {
		System.out.println("PPANG PPANG!!!!");
	}

	public static void main(String[] args) {
		Bus bus= new Bus();
		bus.run();
		bus.ppangppang();

	}

}
