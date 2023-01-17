package DDAWindowsPhoneMain.CDos.ClanguageForUse;

public class ArrayTwoU {
    int arr[][] = new int[][]{{}};

    public ArrayTwoU(int arr[][]) {
        this.arr = arr;
    }

    public String toString() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("["+arr[i][j]+"]");
            }
        }
        return "over";
    }
}
