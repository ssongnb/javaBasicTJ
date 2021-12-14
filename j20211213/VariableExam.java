package j20211213;

public class VariableExam {
    /* 변수의 영향 범위 
    
    전역 변수와 지역 변수
    
    - 전역변수로 선언 할 때는 밖에서 선언을 한다.
    */

    int a; // 전역변수의 사용운 지양하자

    public void varTest(VariableExam testvar){
        testvar.a++;
    }
    //메소드에서 선언했기 때문에 메소드에서 선언이된것은 밖으로 나가지 않는다. (그안에서만 사용된다) - 지역변수
    // - return을 넣어 a가 증가됨을 가지고 나오
    public static void main(String[]args){
        //int a =1;//a를 선언한 시점이 안에서 선언되었기 떄문에 그 값을 별개로 만듦 - 주석처리해 밖으로 내보냄
        VariableExam testvar = new VariableExam();
        testvar.a = 1;//객체의 변수를 여기서 
        testvar.varTest(testvar);
        System.out.println(testvar.a);

    }
}
