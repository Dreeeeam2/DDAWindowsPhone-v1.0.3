package DDAWindowsPhoneMain.CDos.Clanguage;

import java.util.Scanner;

public class Pr {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("?");
        String oder = sc.nextLine();
        String text = sc.nextLine();
        if (oder.equals("pr")) {
            System.out.println(text);
        } else {
            System.err.println("ERROR");
        }
    }
}
