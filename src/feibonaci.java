
import java.util.Scanner;
//斐波那契数列，输入一个大于10的整数，打印出一个大于它的最小斐波那契数
public class feibonaci {
    //1 1 2 3 5 8 13 21
    //f0=f1=1
    public static void main(String[] args) {
        System.out.println("请输入n,我将返回斐波那契数列的第 n 项");

      Scanner scanner=new Scanner(System.in);
     int  n=scanner.nextInt();

        System.out.println("第"+n+"个斐波数"+"="+feiboncci(n));
}
//斐波那契数列
public  static int feiboncci(int n){
        if (n==1||n==2){
            return 1;
        }
        return feiboncci(n-1)+feiboncci(n-2);
    }
}

