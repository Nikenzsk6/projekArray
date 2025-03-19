/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_;

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
        //menghitung rat-arata array
        double Rata2=jml_elemen/banyak_elemen;
        
        //menampilkan
        System.out.println("Jumlah semua elemen array = "+jml_elemen);
        System.out.println("Banyaknya elemen pada array = "+banyak_elemen);
        System.out.println("Nilai rata-rata array = "+Rata2);
        
    }
    
}
