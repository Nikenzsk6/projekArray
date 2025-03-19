/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Percobaan 1
        int data[][]={{4, 6, 4, 2, 8, 4, 2, 10},
                      {4, 6, 4, 2, 8, 4, 2, 10}};
        int jml_elemen=0;
        int banyak_elemen=data[0].length+data[1].length;
        
        //Menampilkan semua elemen Array
        for(int a=0;a<data.length;a++){
            for(int b=0;b<data[a].length;b++){
                System.out.print(data[a][b]+" ");
                jml_elemen +=data[a][b];
            }
            System.out.print("\n");
        }
        //Menghitung rat-arata array
        double Rata2=jml_elemen/banyak_elemen;
        
        //menampilkan
        System.out.println("Jumlah semua elemen array = "+jml_elemen);
        System.out.println("Banyaknya elemen pada array = "+banyak_elemen);
        System.out.println("Nilai rata-rata array = "+Rata2);
        
        //Input angka yang dicari dgn JOptionPane
        int Angkacari=0;
        Angkacari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang dicari"));
        
        //Menyimpan semua posisi angka yang ditemukan
        ArrayList<String>posisi = new ArrayList();
        ArrayList<Integer>baris = new ArrayList();
        ArrayList<Integer>kolom = new ArrayList();
        
        //Mencari posisi angka dalam array
        for(int d=0;d<data.length;d++){
            for(int e=0;e<data[d].length;e++){
                if(data[d][e]==Angkacari){
                    posisi.add("Baris "+(d+1)+",Kolom "+(e+1));
                    baris.add(d);
                    kolom.add(e);
                }
            }
        }
        
        //Jika angka tidak ditemukan
        if(posisi.isEmpty()){
            JOptionPane.showMessageDialog(null, "Posisi tidak ditemukan!");
            return;
        }
        
        //Menampilkan posisi angka yg ditemukan
        System.out.println("Posisi angka ditemukan");
        for(int d=0;d<posisi.size();d++){
            System.out.println((d+1)+"."+posisi.get(d));
        }
        
        //Meminta input posisi angka yang dicari
        int pilihan=0;
        pilihan=Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka posisi yang dipilih"))-1;
        
        //memastikan input angka baru valid
        if(pilihan<0 || pilihan>posisi.size()){
            JOptionPane.showMessageDialog(null, "Posisi tidak ditemukan");
            return;
        }
        
        //Meminta input angka baru
        int angkaBaru=0;
        angkaBaru=Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka baru untuk mengganti"));
        
        //Mengubah nilai elemen array
        data[baris.get(pilihan)][kolom.get(pilihan)]=angkaBaru;
        
        //Menampilkan array setelah perubahan
        System.out.println("===Array Setelah Perubahan===");
        for(int a=0; a<data.length;a++){
            for(int b=0; b<data[a].length;b++){
                System.out.print(data[a][b]+" ");
            }
            System.out.print("\n");
        }
        // Menjumlahkan semua nilai elemen array pda indek ganjil
        int jumlah=0;
        for(int a=0; a<data.length;a++){
            for(int b=0; b<data[a].length;b++){
                if(b%2 !=0){
                    jumlah +=data[a][b];
                }
            }
        }
        //Menampilkan jumlahnya
        System.out.println("Jumlah semua nilai array pada indek ganjil = "+jumlah);
        
    } 
}
