package com.OCG.QAF01;

import java.util.Scanner;

public class Bai1 {
//Viết chương trình tim tất cả các số chia hết cho 7 mà không chia hết cho 5 trong khoảng từ 10-200
    public static void main(String[] args) {
       for (int a=10;a<200;a++){
          if (a%5==0 && a%7!=0){
              System.out.print(a + ", ");
          }
       }

    }
}
