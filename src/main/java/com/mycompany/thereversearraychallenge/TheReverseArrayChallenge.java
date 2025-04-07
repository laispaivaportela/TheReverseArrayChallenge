/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thereversearraychallenge;

/**
 *
 * @author laisp_omzy4s1
 */

//The Reverse Array Challenge
import java.util.Arrays;
import java.util.Scanner;

public class TheReverseArrayChallenge {
    public static void main (String[] args) {
        int[] numeros = readIntegers ();
        System.out.print ("Array: ");
        System.out.print (Arrays.toString (numeros));
        System.out.print ("\nReversed array: ");
        reverse(numeros);
        System.out.print (Arrays.toString (numeros));

    }

    public static int[] readIntegers () { //lê a entrada e converte para inteiros
        Scanner input = new Scanner (System.in);
        System.out.println ("The Reverse Array Challenge");
        System.out.print ("Digite um array (com os numeros separados por virgula): ");
        String entrada = input.nextLine ();


        String[] splits = entrada.split (",");
        int[] numeros = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            numeros[i] = Integer.parseInt (splits[i].trim ());
        }

        return numeros; //devolve o vetor com inteiros pra main
    }


    private static void reverse (int[] numeros) {
        //inverte a ordem do array colocando o primeiro elemento no ultimo, seguindo...
        int tamanho = numeros.length;
        int[] ordemUserAoContrario = new int[tamanho];
        int maximo = Math.max(0, tamanho) - 1;

        for (int i = 0; i < numeros.length; i++) {
            ordemUserAoContrario[maximo - i] = numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ordemUserAoContrario[i];
        }
        
    }


}
