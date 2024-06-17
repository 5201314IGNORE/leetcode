import java.util.Scanner;

public class hannuota {
    // 递归方法实现汉诺塔问题
    //from 起始柱
    //to 目标柱
    //aux 辅助柱

    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            // 只有一个盘子时，直接从源柱移动到目标柱
            System.out.println("盘片 1: " + from + " -> " + to);
            return;
        }
        else if(n<=0){
            System.out.println("请输入大于0的正整数");
            return;
        }
        // n>1的情况下进行已下过程
else {
        hanoi(n - 1, from, aux, to);
        // 将第 n 个盘子从源柱移动到目标柱
        System.out.println("盘片 " + n + ": " + from + " -> " + to);
        // 将 n-1 个盘子从辅助柱移动到目标柱
        hanoi(n - 1, aux, to, from);
    }}
//char 表示单字符
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入圆盘数: ");
        int n = scanner.nextInt();
        System.out.print("请输入起始柱: ");
        char from = scanner.next().charAt(0);
        System.out.print("请输入目的柱: ");
        char to = scanner.next().charAt(0);
        System.out.print("请输入过度柱: ");
        char aux = scanner.next().charAt(0);

        // 调用汉诺塔递归方法，将 n 个盘子从 from 柱移动到 to 柱，使用 aux 柱作为辅助柱
        hanoi(n, from, to, aux);
    }
}

