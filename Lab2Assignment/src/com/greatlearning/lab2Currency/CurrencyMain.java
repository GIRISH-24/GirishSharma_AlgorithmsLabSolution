package com.greatlearning.lab2Currency;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyMain {
    public static void main(String[] args){
        CurrencyCount cc=new CurrencyCount();
        System.out.println("Enter size of currency ");
        Scanner scn=new Scanner(System.in);
        int size= scn.nextInt();
        int[] notes=new int[size];
        System.out.println("Enter the value of notes");
        for(int i=0;i<size;i++){
            notes[i]=scn.nextInt();
        }
        System.out.println("Enter amount you wish to pay");
        int amount= scn.nextInt();
        Arrays.sort(notes);
        cc.CurrencyCount(notes,amount);
    }
}
