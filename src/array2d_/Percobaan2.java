/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2d_;

/**
 *
 * @author HP
 */
public class Percobaan2 {
    public static void main(String[] args) {
        //Percobaan 2
        String data[][]={{"NAMA\t","ALAMAT\t","TELEPON"},{"ABDUL\t","Kediri\t","085646668991"},
                        {"KUSNO\t","Trenggalek","085646668992"},{"PONIRAN\t","Bojonegoro","085646668993"}};
        
        for(int f=0;f<data.length;f++){
            for(int g=0;g<data[f].length;g++){
                System.out.print(data[f][g]+"\t");
            }
            System.out.print("\n");
        }
    }
    
}
