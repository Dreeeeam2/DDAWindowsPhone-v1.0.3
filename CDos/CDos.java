package DDAWindowsPhoneMain.CDos;

import DDAWindowsPhoneMain.CDos.ClanguageForUse.ArrayOneU;
import DDAWindowsPhoneMain.CDos.ClanguageForUse.ArrayTwoU;
import DDAWindowsPhoneMain.CDos.ClanguageForUse.CalculationU;
import DDAWindowsPhoneMain.CDos.ClanguageForUse.PrU;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

public class CDos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("prepare system now......");
        System.out.println("install system......");
        System.out.println("copy file......");
        System.out.println("The System is ready,Do you want to use it[Y/n]?");
        String useanswer = sc.nextLine();
        if (useanswer.equals("n")) {
            System.out.println("system close");
            sc.close();
        } else {
            System.out.println("WELCOME!");
            while (true) {
                System.out.println("CDOS>?");
                String oanswer = sc.nextLine();

                if (oanswer.equals("help")) {
                    System.out.println("system:check your system's number");
                    System.out.println("exit:exit the system(don't do this=(");
                    System.out.println("install:install things from web FREE");
                    System.out.println("update:update your system");
                    System.out.println("S-E:start C-language");
                    System.out.println("IPsc:get a website's ip address");
                } else if (oanswer.equals("exit")) {
                    System.out.println("see you~");
                    sc.close();
                } else if (oanswer.equals("system")) {
                    System.out.println("model:CDos-1.0.1");
                    System.out.println("author:Dream2");
                } else if (oanswer.equals("install")) {
                    System.out.println("Tips:you should give system the thing's detailed address");
                    System.out.println("Tips:you should new a file to input this file");
                    System.out.println("Install System>address?");
                    String ad = sc.nextLine();
                    URL url = new URL(ad);
                    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = urlConnection.getInputStream();
                    System.out.println("install target address");
                    String installad = sc.nextLine();
                    FileOutputStream fos = new FileOutputStream(installad);
                    byte[] buffer = new byte[4096];
                    int len;
                    while ((len = inputStream.read(buffer)) != -1) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();
                    inputStream.close();
                    urlConnection.disconnect();
                    System.out.println("finish");
                } else if (oanswer.equals("update")) {
                    System.out.println("check now......");
                    System.out.println("you are the new system=)");
                } else if (oanswer.equals("S-E")) {
                    System.out.println("order?");
                    Scanner sc2 = new Scanner(System.in);
                    String san = sc2.nextLine();
                    if (san.equals("pr")) {
                        System.out.println("?will you out?");
                        String text = sc.nextLine();
                        PrU pru1 = new PrU(text);
                        System.out.println(pru1);

                    } else if (san.equals("Cal")) {
                        System.out.println("?num1");
                        int num1 = sc.nextInt();
                        System.out.println("?num2");
                        int num2 = sc.nextInt();
                        CalculationU cal1 = new CalculationU(num1, num2);
                        System.out.println(cal1);
              } else if (san.equals("array")) {
                  int arr[] = new int[]{1, 2, 3, 4, 5, 6};
                  ArrayOneU arrayOneU = new ArrayOneU(arr);
                  System.out.print(arrayOneU);
              } else if (san.equals("array2")) {
                        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
                        ArrayTwoU arrayTwoU = new ArrayTwoU(arr);
                        System.out.println(arrayTwoU);
                    }
                    } else if (oanswer.equals("IPsc")) {
                        System.out.println("?website?");
                        String website = sc.nextLine();
                        InetAddress inetAddress = InetAddress.getByName(website);
                        System.out.println(website+"'s ip is :"+inetAddress);
                    }

            }
        }
    }
}





