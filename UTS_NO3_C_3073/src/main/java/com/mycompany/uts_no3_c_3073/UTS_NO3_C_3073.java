/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3073;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Tectonia
 */
public class UTS_NO3_C_3073 {

    public static void main(String[] args) {
     //Membuat object menggunakan array
        AsistenPraktikum_3073[] AsPrak_3073 = new AsistenPraktikum_3073[3];
        StudentStaff_3073[] StuStaff_3073 = new StudentStaff_3073[3];
        
        AsPrak_3073[0] = new AsistenPraktikum_3073();
        StuStaff_3073[0] = new StudentStaff_3073();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 3; i++){
                System.out.print("NIM              : ");
                AsPrak_3073[i].nim_3073 = br.readLine();
                System.out.print("Nama             : ");
                AsPrak_3073[i].nama_3073 = br.readLine();
                System.out.print("Jurusan          : ");
                AsPrak_3073[i].jurusan_3073 =br.readLine();
                System.out.print("IPK              : ");
                AsPrak_3073[i].ipk_3073 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                AsPrak_3073[i].mkAsisten_3073 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                AsPrak_3073[i].jmlPertemuan_3073 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3073 AP : AsPrak_3073){
                AP.tampilDataAsistenPraktikum_3073();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                StuStaff_3073[i].nim_3073 = br.readLine();
                System.out.print("Nama        : ");
                StuStaff_3073[i].nama_3073 = br.readLine();
                System.out.print("Jurusan     : ");
                StuStaff_3073[i].jurusan_3073 =br.readLine();
                System.out.print("IPK         : ");
                StuStaff_3073[i].ipk_3073 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                StuStaff_3073[i].unitKerja_3073 = br.readLine();
                System.out.print("Jam Kerja   : ");
                StuStaff_3073[i].jamKerja_3073 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3073 SS : StuStaff_3073){
                SS.tampilDataStudentStaff_3073();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
