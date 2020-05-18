/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.util.Scanner;

/**
 *
 * @author QTV
 */
public class CNPM {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a ,b ;//Khai báo a,b
        
        Scanner sc = new Scanner(System.in);
        
        //Nhập a,b
        System.out.print("Nhap a : ");
        a = sc.nextInt();
        
        System.out.print("Nhap b : ");
        b = sc.nextInt();
        
        //Khởi tạo tổng c
        int c = a+b;
        
        //Xuất ra màn hình kết quả 
        System.out.println("Tong cua "+a+" + "+b+" = "+c  );
        // TODO code application logic here
    }
    
}
