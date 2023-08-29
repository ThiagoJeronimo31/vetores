
package maior_posicao;

import java.util.Scanner;

public class Maior_posicao {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double maior = 0;
        double[] num = new double[n];
        int pormaior;
        for(int i =0; i<num.length;i++){
            System.out.println("Digite um número");
            num[i] = sc.nextDouble();
        }
        for(int i = 0; i<num.length; i++){
            if(num[i] > maior){
                maior = num[i];
        }
        }
        System.out.println("Maior Valor = "+maior);
     for(int i = 0; i<num.length; i++){
         if(num[i] == maior){
             pormaior = i;
  
             System.out.println("Posição do maior valor "+ pormaior);
           
         }
           
       }
    }
    
}

