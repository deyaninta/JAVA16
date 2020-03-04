/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpertama;

import java.util.Scanner;
/**
 *
 * @author DEYANINTA
 */
public class Latihanpertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    String Name = "Deyaninta Ekabriela Permata";
    int NIM = 1920010050;
    boolean question = true;
    double age = 18;
    
        System.out.println(Name);
        System.out.println(NIM);
        System.out.println(question);
        System.out.println(age);
        System.out.println(""); 
        
        System.out.println("Masukkan pesan: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Pesanmu " + input);
        System.out.println("");
        
        int nilai = 90;
        if (nilai < 65) {
            System.out.println("Nilai kamu kurang dari batas minimal");
        } else if (nilai >= 90) {
            System.out.println("Nilai kamu baik");
        } else {
            System.out.println("Nilai kamu sangat baik");
        }
        System.out.println("");
        
        System.out.println("Masukkan angka: ");
        Scanner inputan = new Scanner(System.in);
        int result = inputan.nextInt();
        
        if (result < 30){
            System.out.println("Di bawah 30");
        }
        else if (result <= 51){
             System.out.println("Di atas 10 dan di bawah 50");
        }
        else {
             System.out.println("Di atas 51");
        }
        
    }
    
}
