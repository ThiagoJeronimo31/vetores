package negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeors você vai digitar? ");
        int n = sc.nextInt();
        
       int[] vect = new int[n];
       
       for(int i = 0;i<vect.length;i++){
           System.out.println("Digite um número");
           vect[i] = sc.nextInt();
       }
        System.out.println("Numéros Negativos");
       for(int i = 0; i<vect.length;i++){
           if(vect[i]<0){
               System.out.println(vect[i]);
           }
               
       }
        

    }
    
}
