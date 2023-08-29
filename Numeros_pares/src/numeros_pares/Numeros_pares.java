package numeros_pares;

import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números você vai digitar? ");
    int n = sc.nextInt();
    
    int[] par = new int[n];
    int soma = 0;
    for(int i =0; i<par.length;i++){
        System.out.println("Digite um número: ");
        par[i] = sc.nextInt();
    }
        System.out.println("NÚMEROS PARES");
    for(int i = 0; i<par.length;i++){
        if(par[i]%2==0){
            soma++;
            System.out.println(par[i]);
        }
    }
        System.out.println("");
        System.out.println("QUANTIDADE DE PARES = "+ soma);

    }
    
}
