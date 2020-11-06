/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
class Tunjangan{
    
    public String status;
    public float gaji, tunjangan, totalGaji;
    
    public void hitungTunjangan(){
        
       if(gaji >= 6000000 && status.equals("Menikah") || status.equals("menikah") ){              
                    tunjangan =(float) (0.35*gaji); 
                    totalGaji = gaji+tunjangan;
                    System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                    System.out.println("Gaji Pokok      : Rp. " + gaji);        
                    System.out.println("Tunjangan       : Rp. " + tunjangan);        
                    System.out.println("Total Gaji       : Rp. " + totalGaji);
            }else{
                System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                tunjangan = 0; 
                System.out.println("Gaji Pokok      : Rp. " + gaji);        
                System.out.println("Tunjangan       : Rp. " + tunjangan);        
                System.out.println("Total Gaji       : Rp. " + gaji + tunjangan);
            }    
    }
}

public class IF10K10119912Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tunjangan tnj = new Tunjangan();
        
        tnj.gaji = 0;
        
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji poko anda perbulan ?: Rp. ");
        tnj.gaji = input.nextInt();
        System.out.print("Status anda ? (Menikah/belum)   : ");
        tnj.status = input.next();
        tnj.hitungTunjangan();
         
    }
    
}
