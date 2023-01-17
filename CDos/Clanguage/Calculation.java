package DDAWindowsPhoneMain.CDos.Clanguage;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("?");
        String oder = sc.nextLine();
int num1 = sc.nextInt();
int num2 = sc.nextInt();
if(oder.equals("Cal")){
    System.out.println("calculation now......");
    System.out.println("+ "+(num1+num2));
    System.out.println("- "+(num1-num2));
    System.out.println("* "+(num1*num2));
    System.out.println("/ "+(num1/num2));
}else{
    System.err.println("ERROR");
}

    }
}
