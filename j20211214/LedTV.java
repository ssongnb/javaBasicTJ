package j20211214;
//implements 구형하겠다.
public class LedTV implements TV{
    //LedTV class는 TV 인터페이스를 구현했다.
    //TV 인터페이스에 정의된 매서드 들을 모두 구현해야만 한다.
    //명세표/명령어/작업지시서가 다르면 에러가 난다.

    // @__________ annotation 애너테이션 
    // : 확인 요청. 필수는 아닌 선택(웹개발에서는 필수처럼 사용됨 - 어떤기능을 쓸지 확이해줘의 의미로 실행까지 사용)
    @Override 
    public void turnOn(){
        System.out.println("TV on");
    }
    @Override
    public void turnOff(){
        System.out.println("TV off");
    }
    @Override
    public void changeVolume(int volume){
        System.out.println("volume change");
    }
    @Override
    public void changeChannel(int channel){
        System.out.println("channel change");
    }
    
    
}
