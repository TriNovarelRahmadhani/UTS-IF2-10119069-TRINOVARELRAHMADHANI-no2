/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119069.trinovarelrahmadhani.no2;

/**
 *
 * @author
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}
