package com.prodemy.h2;
import java.util.Scanner;

public class BacaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda :");
        String nama = sc.nextLine();
        System.out.println("Selamat Pagi, " + nama );
    }
}
