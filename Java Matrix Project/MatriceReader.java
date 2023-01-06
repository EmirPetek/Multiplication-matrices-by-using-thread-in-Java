package com.udemy.studing_topic;

import java.io.FileNotFoundException;
import java.lang.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

    public class MatriceReader {

        public static int[][] matriceFirstReader() {

            String satir = "";
            StringBuffer stringBuffer = new StringBuffer();
            try {
                File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\A.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((satir = bufferedReader.readLine() ) != null){
                    stringBuffer.append(satir + "A");
                }
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String firstm = stringBuffer.toString();
            String token = "A ,";
            StringTokenizer stringTokenizer = new StringTokenizer(stringBuffer.toString(), token);
            int[][] firstMatrix = new int[matriceFirstRow()][matriceFirstColumn()];
            while (stringTokenizer.hasMoreElements()){
                for(int i = 0; i < matriceFirstRow(); i++){
                    for(int j = 0; j < matriceFirstColumn(); j++){
                        firstMatrix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                    }
                }
            }
            return firstMatrix;
        }

        public static int matriceFirstColumn(){
            int line = 0;
            int column = 0;
            try{
                File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\A.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader1 = new BufferedReader(fileReader);

                while (line != -1){
                    line = bufferedReader1.read();
                    if (line == 44) column++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            column = (column / matriceFirstRow() ) + 1;
            return column;
        }

        public static int matriceFirstRow(){
            int row = 0;
            try{
                File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\A.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String satir = "";
                while ((satir = bufferedReader.readLine() ) != null){
                    row++;
                }
            }catch (Exception e){
                e.printStackTrace();

            }
            return row;
        }

        public static int[][] matriceSecondReader(){
            File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\B.txt");

            String satir = "";
            StringBuffer stringBuffer = new StringBuffer();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((satir = bufferedReader.readLine() ) != null){
                    stringBuffer.append(satir + "A");
                }
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String secondm = stringBuffer.toString();

            String token = "A ,";
            StringTokenizer stringTokenizer = new StringTokenizer(stringBuffer.toString(), token);
            int[][] SecondMatrix = new int[matriceSecondRow()][matriceSecondColumn()];
            while (stringTokenizer.hasMoreElements()){
                for(int i = 0; i < matriceSecondRow(); i++){
                    for(int j = 0; j < matriceSecondColumn(); j++){
                        SecondMatrix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                    }
                }
            }
            return SecondMatrix;
        }

        public static int matriceSecondColumn(){
            int line = 0;
            int column = 0;
            try{
                File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\B.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader1 = new BufferedReader(fileReader);
                while (line != -1){
                    line = bufferedReader1.read();
                    if (line == 44) column++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            column = (column / matriceFirstRow() );
            return column;
        }

        public static int matriceSecondRow(){
            int row = 0;
            try{
                File file = new File("C:\\Users\\emirp\\OneDrive\\Masaüstü\\B.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String satir = "";
                while ((satir = bufferedReader.readLine() ) != null){
                    row++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return row;
        }
    }


