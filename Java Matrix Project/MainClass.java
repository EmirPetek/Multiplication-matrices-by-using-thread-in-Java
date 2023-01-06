package com.udemy.studing_topic;

import org.w3c.dom.ls.LSOutput;

public class MainClass {
    public static void main(String[] args){
        MatriceReader matriceReader = new MatriceReader();
        int[][] firstMatrix = matriceReader.matriceFirstReader();
        int[][] SecondMatrix = matriceReader.matriceSecondReader();
        System.out.println("First matrix: \nrow: " + matriceReader.matriceFirstRow() + "\ncolumn: " + matriceReader.matriceFirstColumn() + "\n");
        System.out.println("Your first matrix is below that: \n");
        for (int i = 0; i < matriceReader.matriceFirstRow(); i++) {
            for (int j = 0; j < matriceReader.matriceFirstColumn(); j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Second matrix: \nrow: " + matriceReader.matriceSecondRow() + "\ncolumn: " + matriceReader.matriceSecondColumn() + "\n");
        System.out.println("Your second matrix is below that: \n");
        for (int i = 0; i < matriceReader.matriceSecondRow(); i++) {
            for (int j = 0; j < matriceReader.matriceSecondColumn(); j++) {
                System.out.print(SecondMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
       MatThread matThread = new MatThread();
       matThread.start();
    }

    static class MatThread extends Thread{
        MatriceReader matriceReader = new MatriceReader();
        int[][] arr1 = matriceReader.matriceFirstReader();
        int[][] arr2 = matriceReader.matriceSecondReader();
        int[][] arr3 = new int[matriceReader.matriceFirstRow()][matriceReader.matriceSecondColumn()];

        @Override
        public void run() {
            for (int i = 0; i < matriceReader.matriceFirstRow(); i++) {
                for (int j = 0; j < matriceReader.matriceSecondColumn(); j++) {
                    for (int k = 0; k < matriceReader.matriceSecondRow(); k++) {
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("Your multiplicated matrix is below that: \n");
            for (int i = 0; i < matriceReader.matriceFirstRow(); i++) {
                for (int j = 0; j < matriceReader.matriceSecondColumn(); j++) {
                    System.out.print(arr3[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
