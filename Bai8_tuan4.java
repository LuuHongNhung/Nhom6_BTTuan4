/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai8_tuan4;

/**
 *
 * @author Tran
 */
import java.util.Scanner;
import java.util.HashMap;

public class Bai8_tuan4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxValue = arr[0], maxCount = 0;
        for (int key : freq.keySet())
        {
            if (freq.get(key) > maxCount) 
            {
                maxCount = freq.get(key);
                maxValue = key;
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất: " + maxValue + " (" + maxCount + " lần)");
    }
}

