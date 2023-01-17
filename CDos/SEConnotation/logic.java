package DDAWindowsPhoneMain.CDos.SEConnotation;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1?");
        int num1 = sc.nextInt();
        System.out.println("num2?");
        int num2 = sc.nextInt();
        max(num1,num2);//usage
    }
    public static void max(int num1,int num2){//Connotation
        if(num1 > num2){
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else if (num1 == num2) {
            System.out.println(num2+"="+num2);
        }
    }
}
