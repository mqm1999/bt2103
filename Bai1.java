/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row1, col1, row2, col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang a cua ma tran 1: ");
        row1 = sc.nextInt();
        System.out.println("Nhap so cot b cua ma tran 1: ");
        col1 = sc.nextInt();
        System.out.println("Nhap so hang m cua ma tran 2: ");
        row2 = sc.nextInt();
        System.out.println("Nhap so cot n cua ma tran 2: ");
        col2 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("Nhap phan tu " + i + "," + j + " cua ma tran 1: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Nhap phan tu " + i + "," + j + " cua ma tran 2: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        if (row1 == row2 && col1 == col2) {
            int row_sum = row1, col_sum = col1;
            int[][] arrsum = new int[row_sum][col_sum];
            for (int i = 0; i < row_sum; i++) {
                for (int j = 0; j < col_sum; j++) {
                    arrsum[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("Ma tran tong: ");
            for (int i = 0; i < row_sum; i++) {
                for (int j = 0; j < col_sum; j++) {
                    System.out.print(arrsum[i][j] + "\t");
                }
                System.out.println("");
            }
        } else {
            System.out.println("KHONG TINH DUOC");
        }
    }
}
