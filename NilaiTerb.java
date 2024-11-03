package pert6;

import java.util.Scanner;

public class NilaiTerb {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ====");

       
        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = input.nextLine();

       
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;
        int nilaiMahasiswa;

        System.out.println("\nMasukkan nilai mahasiswa:");
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + " = ");
            nilaiMahasiswa = input.nextInt();

            
            if (nilaiMahasiswa > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa;
            }
            if (nilaiMahasiswa < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa;
            }
        }

        System.out.println("\n==== Hasil Nilai Mahasiswa ====");
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
    }
}


