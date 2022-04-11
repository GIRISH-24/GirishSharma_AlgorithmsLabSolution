package com.greatlearning.lab2Currency;

public class CurrencyCount {
    public void CurrencyCount(int notes[],int amount){
        int notescount[]=new int[notes.length];
        for (int i=0;i<notes.length;i++){
            if(amount>=notes[i]){
                notescount[i]=amount/notes[i];
                amount=amount-notescount[i]*notes[i];
            }
        }
        if(amount>0){
            System.out.println("You do not have appropiate amount");
        }
        else{
            for(int i=0;i<notes.length;i++){
                if(notescount[i]!=0){
                    System.out.println("Notes of value "+notes[i]+" are "+ notescount[i]);
                }
            }
        }
    }
}
