package j20211210;

public class TernaryExam {
    public static void main(String[] args) {
        
        // int b1 = (5>4) ? 50: 40;

        // System.out.println(b1);

            int b;
        
        if (5>4) {
           b= 50;
        } else {
           b = 40;
        }
        System.out.println(b);

        /* Variable
        1) local variabl; (지역변수)
        : if안에 있는 int b와 출력안에 있는 b는 다른 것으로 인식함
        : 안에서 int b로 선언하면 안에서만 영향을 미쳐 밖에서 쓸려고 할 때 사용이 안됨
        2) global variable; (전역변수)
        : 전체에 다 영향을 미친다.
    
        */
     }
}
