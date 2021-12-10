package test;

import java.util.HashMap;

public class MapExam {
    public static void main(String[] args) {
        
        //파이썬과 딕셔너리 판다스의 Series, JS의 json과 같은 키와 밸류 쌍으로 이루어진 자료형
        //오직 키값으로 밸류값을 얻어낼 수 있다.
        //index(순서)의 개념이 없다.

        HashMap<String, String>map = new HashMap<String, String>();
        map.put("people","person");
        map.put("basball", "ball");

        System.out.println(map.get("people"));
        System.out.println(map.size());
        
    }
    
}
