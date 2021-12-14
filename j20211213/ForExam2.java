package j20211213;

import java.util.Scanner;
public class ForExam2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("line :  ");
    var num = 0;
    num = sc.nextInt();
    for(int i = 0; i <= num; i++){
        for(int j = 0; j <= num+1; j++){
            System.out.print("*");
        }System.out.println("");
    }

    }
}
