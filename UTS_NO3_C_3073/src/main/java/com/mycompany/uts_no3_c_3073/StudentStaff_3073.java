/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3073;

/**
 *
 * @author Tectonia
 */
public class StudentStaff_3073 extends Mahasiswa_3073 {
    int jamKerja_3073;
    String unitKerja_3073;
    
    public double totalPendapatan_3073(){
        return (jamKerja_3073 * 30000);
    }
    public void tampilDataStudentStaff_3073(){
        super.tampilDataMhs_3073();
        System.out.println(" Unit Kerja : " + unitKerja_3073);
        System.out.println(" Jam Kerja : " +jamKerja_3073);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan_3073());
    }
}
