import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author SARPRA ROG2
 */
public class KasirM {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("MENU MAKANAN");
        System.out.println("1. LODEH (7000)");
        System.out.println("2. TEH (2000");
        System.out.println("3. KERUPUK (1000)");
        //
        int lodeh = 7000;
        int teh = 2000;
        int kerupuk = 1000;
        int total, totallodeh, totalteh, totalkerupuk;
        Scanner input= new Scanner(System.in);
        //
        System.out.println("JUMLAH BELI LODEH");
        int jumlahLodeh = input.nextInt();
        totallodeh = jumlahLodeh*lodeh;
        //
        System.out.println("JUMLAH BELI TEH");
        int jumlahTeh = input.nextInt();
        totalteh = jumlahTeh*teh;
        //
        System.out.println("JUMLAH BELI KERUPUK");
        int jumlahKerupuk = input.nextInt();
        totalkerupuk = jumlahKerupuk*kerupuk;
        //
        total = totallodeh+ totalteh + totalkerupuk;
        System.out.println("TOTAL PEMBELIAN" + total);
        System.out.println("MASUKKAN PEMBAYARAN");
        int bayar = input.nextInt();
        int kembali = bayar - total;
        System.out.println("JUMLAH KEMBALIAN"+ kembali);
    }
}
