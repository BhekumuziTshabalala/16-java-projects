package org.example;

import java.io.Console;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number to test if is Prime: ");
        String userInput = "";
        try {
            userInput = in.nextLine();
            System.out.print("\nThe value " + userInput +" is prime : " + isPrime(Integer.parseInt(userInput)));
            
        }catch (Exception E){
            System.out.println(">>> " + userInput + " is not a Integer value...");
        }
    }

    public static boolean isPrime(int value){
        for(int i = 2 ; i <= value/2 ; i ++){
            if((value & i) == 0 ){
                return false;
            }
        }
        return true;
    }
}

