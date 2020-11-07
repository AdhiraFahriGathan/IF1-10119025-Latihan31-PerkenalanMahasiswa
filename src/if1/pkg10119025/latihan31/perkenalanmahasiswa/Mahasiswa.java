/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan31.perkenalanmahasiswa;

/**
 *
 * @author User
 * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Perkenalan Mahasiswa
 */
public class Mahasiswa{
    public String nim;
    public String nama;
    
    public void perkenalanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " .concat(nim));
        System.out.println("My Name is " .concat(nama).concat("\n"));
    }

    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        
        mahasiswa.nim = "10119025";
        mahasiswa.nama = "Adhira Fahri Gathan";
        mahasiswa.perkenalanDiri();
        
        mahasiswa1.nim = "10110270";
        mahasiswa1.nama = "Indra Tiola";
        mahasiswa1.perkenalanDiri();
        
        mahasiswa2.nim = "10110271";
        mahasiswa2.nama = "Robi Tansil Ganefi";
        mahasiswa2.perkenalanDiri();
        
        mahasiswa3.nim = "10110269";
        mahasiswa3.nama = "Muhammad Nur Awaludin";
        mahasiswa3.perkenalanDiri();
         
                
    }
    
}
