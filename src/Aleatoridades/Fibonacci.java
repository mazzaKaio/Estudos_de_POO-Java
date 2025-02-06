package Aleatoridades;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numBase = 0;

        System.out.print("Digite um número: ");
        try {
            numBase = sc.nextInt();
        } catch (Exception e){
            System.out.println("O número digitado não é inteiro!");
        }


        int fibonacci = numBase--;

        for(int i = numBase; fibonacci > 0; fibonacci--){
            fibonacci *=  i;
        }

        System.out.println("Fibonacci: " + fibonacci);
        sc.close();
    }
}
