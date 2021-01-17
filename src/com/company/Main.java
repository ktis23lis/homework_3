package com.company;

public class Main {
    //Задание 5

    public static void main(String[] args) {
        int [][] snagMatrix = new int[5][5];
        snagArr(snagMatrix);

    }
    public static void snagArr(int [][] arr){
        int a = 0;
        int n = arr.length;
        int b;
        if (n % 2 == 0) b = n/2;
        else b = (n + 1) / 2;
        for (int i = 0; i < b; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = a;
                a ++; // вправо
            }
            for (int j = i + 1; j < n - i; j++) {
                arr[j][n - i - 1] = a;
                a ++; //вниз
            }
            for (int j = n - i - 2; j >= i; j--) {
                arr[n - i - 1][j] = a;
                a ++; //в лево
            }
            for (int j = n - i - 2; j > i; j--) {
                arr[j][i] = a;
                a ++; //вверх
            }

        }
        printArr(arr);
    }

    public static void printArr( int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
