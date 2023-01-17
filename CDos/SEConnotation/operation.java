package DDAWindowsPhoneMain.CDos.SEConnotation;
import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1?");
        int num1 = sc.nextInt();
        System.out.println("num2?");
        int num2 = sc.nextInt();
        all(num1,num2);
    }
    public static void all(int num1,int num2){//Connotation
        Scanner sc = new Scanner(System.in);
        System.out.println("Will you add the high-precision operation?[Y/N]");
    String answer = sc.nextLine();
    if(answer.equals("N")){
        System.out.println("num1+num2="+(num1+num2));
        System.out.println("num1*num2="+(num1*num2));
        System.out.println("num1/num2="+(num1/num2));
        System.out.println("num1-num2="+(num1-num2));
    }else {
        double add = num1+num2;
        double addf = num1-num2;
        double c = num1*num2;
        double cf = num1/num2;
                   System.out.println("num1+num2="+(add));
                   System.out.println("num1-num2="+(addf));
                   System.out.println("num1*num2="+(c));
                   System.out.println("num1/num2="+(cf));
    }
    }//高精度计算
}