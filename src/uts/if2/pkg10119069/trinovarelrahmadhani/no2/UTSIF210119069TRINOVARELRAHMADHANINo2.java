/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119069.trinovarelrahmadhani.no2;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program ini berisi program uts
 */
public class UTSIF210119069TRINOVARELRAHMADHANINo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int saldoAwal,jumlahUang;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : " );
        saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlahUang = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlahUang));
    }
    
}
