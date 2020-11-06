/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 * 
 * Deksripsi :program ini untuk mengecek status akun dan login
 */
public class User {
    
    private final String username = "RizkiAdam";
    private final String password ="terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if ((parUserName.equals(username)) && (parPassword.equals(password))){
            return statusAkun = true;
        }else {
            return statusAkun = false;
        }
    }
    
     private void hasilLogin(boolean status, String parUserName){
         status = statusAkun;
         if(status){
             System.out.println();
             System.out.println("****HALLO " + username + " *****");
             System.out.println("SELAMAT DATANG DIAPLIKASI INI");
            }else{
             System.out.println("Oooops, Usernamae atau Password salah");
         }
     }
     
     void pengecekan(String parUserName, String parPassword){
         cekAkun(parUserName, parPassword);
         hasilLogin(statusAkun, parUserName);
     }
}
