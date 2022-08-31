package com.prodemy.h3;

import java.util.Scanner;

public class CetakBilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Bilangan Genap: ");
        int jumlah = input.nextInt();
        int angka = 1;
        int current = 0;

        while(current != jumlah){
            if(angka%2 == 0){
                if(jumlah - current != 1){
                    System.out.print(angka + ", ");
                } else {
                    System.out.print(angka);
                }
                current++;
            }
            angka++;
        }
    }
}
