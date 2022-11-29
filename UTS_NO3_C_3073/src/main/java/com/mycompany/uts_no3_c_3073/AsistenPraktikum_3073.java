/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3073;

/**
 *
 * @author Tectonia
 */
public class AsistenPraktikum_3073 extends Mahasiswa_3073 {
    String mkAsisten_3073;
    int jmlPertemuan_3073;
    
    public double totalPendapatan_3073(){
        return(jmlPertemuan_3073 * 50000);
    }
    public void tampilDataAsistenPraktikum_3073() {
        super.tampilDataMhs_3073();
        System.out.println(" Mata Kuliah        : " + mkAsisten_3073);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3073);
        System.out.println(" Total Pendapatan   : " + totalPendapatan_3073());
    }
}
