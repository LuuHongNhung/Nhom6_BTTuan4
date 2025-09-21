import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 số từ bàn phím
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        System.out.print("Nhập số c: ");
        int c = sc.nextInt();

        // Cách 1: Dùng if-else
        int min = a; 
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        // In ra kết quả
        System.out.println("Số nhỏ nhất là: " + min);

        sc.close();
    }
}
