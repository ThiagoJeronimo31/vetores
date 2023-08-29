
package abaixo_da_media;

import java.util.Scanner;

public class Abaixo_da_media {

    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

    System.out.println("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int i;
    double[] num = new double[n];
    double media, soma=0;
    
    
        for(i = 0; i<num.length;i++){
            System.out.println("Digite um número: ");
            num[i] = sc.nextDouble();
            soma+=num[i];
        }
        media = soma/n;
        System.out.println("Média do vetor = "+media);
        System.out.println("Elementos abaixo da média");
        for(i=0;i<num.length;i++){
            if(num[i]<media){
                System.out.println(num[i]);
            }
        }
 

    }
    
}
