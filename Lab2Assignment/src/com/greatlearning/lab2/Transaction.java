package com.greatlearning.lab2;


import java.util.Scanner;

public class Transaction {


    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of transaction array ");
        int sizeOfArray= scan.nextInt();
        int tarray[]= new int[sizeOfArray];

        System.out.println("Please enter values for Array");
        for (int i = 0; i < sizeOfArray; i++) {
            tarray[i] = scan.nextInt();
        }

        System.out.println("Enter no of Targets need to be achieved");
        int targetNum= scan.nextInt();
        int target;
        while (targetNum--!=0) {
            int flag = 0;

            System.out.println("Please enter values of Target");
            target = scan.nextInt();
            int sum=0;
            for(int i=0;i<sizeOfArray;i++){
                sum=sum+tarray[i];
                if(sum>=target){
                System.out.println("Target achieved after "+(i+1)+" transactions");
                flag= 1;
                break;
                }
                }
            if(flag==0){
                System.out.println("Given target is not achieved");

            }



        }

    }

}

