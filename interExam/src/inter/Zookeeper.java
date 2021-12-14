package inter;

public class Zookeeper {
	
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
		//그대로 고정하고 동물들 class만 추가
	}
	//객체가 한 개 이상의 자료형 타입을 갖게 되는 특성을 다형성 이라고 한다.
	
//	public void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	public void feed(Donkey donkey) {
//		System.out.println("feed carrot");
//	}

	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Donkey donkey = new Donkey();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(donkey);
	}
}
