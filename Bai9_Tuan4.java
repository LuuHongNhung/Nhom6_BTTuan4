import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo một danh sách ArrayList để chứa các số nguyên
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Nhập các phần tử vào danh sách
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = sc.nextInt();
            list.add(value);
        }

        // In danh sách ra màn hình
        System.out.println("Danh sách các số nguyên vừa nhập là:");
        for (int x : list) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
