
import java.util.Scanner;
//斐波那契数列，输入一个大于10的整数，打印出一个大于它的最小斐波那契数
public class feibonaqi {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值");
        int n = sc.nextInt();
        if (n <10){
            System.out.println("请输入大于等于10的整数");
            return;
        }
        //用while实现一直循环
        //1、a + b = temp
        //2、将 temp 赋给 b
        //3、将 b 的值赋给 a
        //4、将 temp值 赋给 b
        while(b<=n) {
           int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(b);


}}