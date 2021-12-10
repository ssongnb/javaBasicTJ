package test;

import java.util.ArrayList;

public class ArrayExam {
    public static void main(String[] args) {
        
        //Array 배열 - 배열의 길이는 고정된다. 수정x

        // int[] num = {1,2,3,4,5};
        // System.out.println(num[2]);
        // System.out.println(num.length);

        ArrayList lists = new ArrayList();

        lists.add("1234");
        lists.add("456");
        lists.add(0,"5468");

        System.out.println(lists.get(0));

    }
    
}
