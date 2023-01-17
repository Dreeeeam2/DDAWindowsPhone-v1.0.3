package DDAWindowsPhoneMain.Savior;

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;

public class ErrorSolve {
    public static void main(String[] args) throws IOException {
        System.out.println("正在解决问题......");
        File file = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction.txt");
        FileWriter fw = new FileWriter(file);
        String wordG = "[game]";
        fw.write(wordG);
        fw.close();;
        System.out.println("解决进度50%[#####.....]");
        File file2 = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction-Tool.txt");
        FileWriter fw2 = new FileWriter(file2);
        String wordT = "[Tool]";
        fw2.write(wordT);
        fw2.close();
        System.out.println("问题解决进度100%[##########]");
        System.out.println("问题解决完毕，请重启程序");
    }
}
