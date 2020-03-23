/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Bai2 {
    static boolean product(int x, int y)
    {
        int p = x*y;
        boolean bool = false;
        if(p%3==0&&p%5==0)
        {
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        boolean c = product(a, b);
        System.out.println(c);
    }
}
