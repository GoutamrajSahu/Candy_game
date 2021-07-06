package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int count = 0;
        boolean check = true;
        while(true){
            if(check == true){
                if(B > count)
                {
                    count++;
                    A = A + count;
                    B = B - count;
                    check = false;
                }else{
                    System.out.println("Chandler");
                    break;
                }
            }else{
                if(A > count)
                {
                    count++;
                    B = B + count;
                    A = A - count;
                    check = true;
                }else{
                    System.out.println("Joey");
                    break;
                }
            }

        }
    }
}
