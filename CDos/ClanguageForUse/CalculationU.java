package DDAWindowsPhoneMain.CDos.ClanguageForUse;

public class CalculationU {
    int num1;
    int num2;
    public CalculationU(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public String toString(){
        return " +:"+(num1+num2)+" *:"+(num1*num2)+" /:"+(num1/num2)+" -"+(num1-num2);

    }
}
