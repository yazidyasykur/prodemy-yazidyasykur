package com.prodemy.h3;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {23, 89, 56, 110, 2, 13, 120, 50, 20};
        int point = 0;
        int temp1, temp2;
        int currentIndex = 1, prevIndex;

        System.out.print("Unsorted: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //Selama point != arr.length maka loop terus berjalan
        while(point != arr.length){
            for(currentIndex = 1; currentIndex<arr.length; currentIndex++){
                prevIndex = currentIndex - 1;

                //Membandingkan 2 nilai array dengan index yang berdekatan
                if(arr[currentIndex] < arr[prevIndex]){

                    //Menyimpan pada variabel temporary
                    temp1 = arr[currentIndex];
                    temp2 = arr[prevIndex];

                    //Melakukan swap kedua nilai array yang berdekatan
                    arr[currentIndex] = temp2;
                    arr[prevIndex] = temp1;

                    //Mereset point
                    point = 0;

                    //Mengulang scanning array
                    currentIndex = 1;
                } else {
                    //Menambah point apabila nilai array currentIndex lebih besar
                    point++;

                    if(point >= arr.length){
                        //Menyudahi loop for apabila point >= arr.length
                        break;
                    }
                }
            }
        }
        System.out.print("Sorted: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
