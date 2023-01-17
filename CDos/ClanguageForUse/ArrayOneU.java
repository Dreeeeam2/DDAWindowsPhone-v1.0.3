package DDAWindowsPhoneMain.CDos.ClanguageForUse;

public class ArrayOneU {
    int arr[] = new int[]{};

    public ArrayOneU(int arr[]) {
        this.arr = arr;
    }

    public String toString() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        return "over";
    }
}


