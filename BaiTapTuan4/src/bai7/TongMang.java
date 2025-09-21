package bai7;

import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        int[] mang = new int[n];
        int tong = 0;
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
            tong += mang[i];
        }
        
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        
        scanner.close();
    }
}