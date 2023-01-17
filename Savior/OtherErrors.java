package DDAWindowsPhoneMain.Savior;

import java.util.Scanner;

public class OtherErrors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您好，我是错误解决助手，请根据我的指引来进行错误解决[Y/N]");
        String answer = sc.nextLine();
        if(answer.equals("Y")){
            System.out.println("请点击压缩包[Y/N]");
            String ta = sc.nextLine();
            if(ta.equals("Y")){
                System.out.println("安装在D盘下");
                System.out.println("新建一个untitled文件夹[Y/N]");
                String sa = sc.nextLine();
                if(sa.equals("Y")){
                    System.out.println("在untitled文件夹下新建一个src文件夹");
                    System.out.println("解压到当前文件夹[Y/N]");
                    String oa = sc.nextLine();
                    if(oa.equals("Y")){
                        System.out.println("请重启程序，应该可以成功运行。");
                    }else{
                        System.out.println("指引中断");
                    }
                }else {
                    System.out.println("指引中断");
                }
            }else {
                System.out.println("指引中断");
            }
        }else {
            System.out.println("指引中断");
        }
    }
}
