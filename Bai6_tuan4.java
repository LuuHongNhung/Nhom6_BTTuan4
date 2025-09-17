/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6_tuan4;

/**
 *
 * @author Tran
 */
import java.util.Scanner;

public class Bai6_tuan4
{
    public static int ucln(int a, int b) 
    {
        while (b != 0) 
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int bcnn(int a, int b) 
    {
        return a * b / ucln(a, b);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        System.out.println("UCLN: " + ucln(a, b));
        System.out.println("BCNN: " + bcnn(a, b));
    }
}

