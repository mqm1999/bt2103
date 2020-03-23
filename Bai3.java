/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Bai3 {

    static int A(int a, int b, int c) {
        if (a < b && b < c) {
            return 1;
        }
        if (a > b && b > c) {
            return -1;
        }
        if (a < b && b > c) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai chuoi: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-2; i++) {
            x = A(arr[i], arr[i + 1], arr[i + 2]);
        }
        System.out.println(x);
    }
}
