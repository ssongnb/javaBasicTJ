package j20211213;

public class Dog extends Animal{
    //extends Animal 상속하는 방법 - ctrl+c/v와 같은
    //일일이만들지 않고 가져다 쓴다.

    public Dog(){
        //기본생성자. default constructor
    }

    public void sleep(){
        System.out.println(this.name+" zzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep(); // - 상속받은 자식만의 기능 추가
    }
    
}
