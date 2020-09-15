package com.Abdel;

import java.util.Scanner;

public class NoHp {
        public static void main(String[] args){
            // deklarasi scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nomor handphone Anda: ");
            // deklarasi variable nohp untuk menampung input user
            String nohp = input.next();

            int nomor = 0;
            for(int i = 0; i < nohp.length(); i++){
                int j = i + 1;
                nomor = nomor + Integer.parseInt(nohp.substring(i,j)); // jumlahkan tiap karakter dari nomor hp
                System.out.print(nohp.substring(i,j) + "+"); // cetak tiap karakter dari nomor hp
            }
            System.out.print("\nTotalnya = " + nomor);
        }
    }

