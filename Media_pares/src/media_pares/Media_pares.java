
package media_pares;

import java.util.Scanner;


public class Media_pares {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        int i,Spar = 0,npares = 0;
        double media;
        int[] par = new int[n];
        for(i=0;i<par.length;i++){
            System.out.println("Digite um número: ");
            par[i] = sc.nextInt();
        }
        for(i=0;i<par.length;i++){
            if(par[i]%2==0){
               Spar+=par[i];
               npares++;
            }
        
   
        }
        if(npares == 0){
            System.out.println("Nenhum número par");
        }
        else{
             media = Spar/npares;
        System.out.println("Média dos Pares = "+media);
        }
       

    }
    
}
