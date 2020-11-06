/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 * 
 * deksripsi :Program ini untuk mengecek status login dengan konsep OO
 */
public class PBO10119042Latihan33 {
    
    private static String username;
    private static String password;
    
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Masukan Username = ");
        username = Scanner.next();
        System.out.print("Masukan Password = ");
        password = Scanner.next();
        
        User user = new User();
        user.pengecekan(username,password);
    }
    
}
