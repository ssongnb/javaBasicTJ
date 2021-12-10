package test;

public class StringBufferEaxm {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb.substring(0,4));


        //StringBuffer - 문자열을 수정/ 변경할 때

        // StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("world!!");

        // String result = sb.toString();
        // System.out.println(result);
        //하나의 객체를 만들고 그안에서 수정, 변경이 되는 문자

        //  String result = "";
        //  result += "hello";
        //  result += " ";
        //  result += "world";

        //  System.out.println(result);
         //객체를 계속 추가해서 뒤에 가져다 붙이는 
         //String 한번만들어진 문자는 못 고침. 수정불가
         //하지만 이걸 많이 사용


            //첫번째 예제 StringBuffer는 객체가 한번반 생성됨
            //두번째 예제 String은 자료형에 +연산이 사용 될 때마다 계속 새로운 객체가 추가 되어 생성된다. 
            //(새로운 객체를 만들어 낸다.)

            //String 자료형은 한번 반들게 되면 수정이 불가능하다.
            //그 값 자체를 변경할 수 없다. immutable gkfkrh vygusgksek.
            //toUooerCas 와 같은 메서드의 경우도 문자열이 변경되는 것처럼 보일 수 는 있지만 
            //메서드 수행시 또 다른 객체를 생성하여 리턴하는 것

            //무조건 StringBuffer()를 사용하는 것이 좋은가??
            // 상황에 따라 다르다. StringBuffer()는 기본적으로 String보다 무겁다.
            //무겁다: 기본적인 메모리 사용양도 크고 속도도 느리다
            //문자열 추가나 변경이 많은 경우에만 StringBuffer를 사용하고 
            //변경/수정 작업이 거의 없는 경우에는 그냥 String을 사용하자
    }

}
