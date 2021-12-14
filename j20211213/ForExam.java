package j20211213;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {
        
        //"Lines ?" 3
        //***
        //***
        //***

        //"Lines?   5"
        //*****
        //*****
        //*****
        //*****

        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lines ? : ");

        num = sc.nextInt();

        for(int j = 0; j < num; j++){
        for(int i = 0; i < num; i++){
            System.out.print("*");
        }  
        System.out.println("");
        //삼각형만들기

    }

    }
}
