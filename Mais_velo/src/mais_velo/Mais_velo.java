package mais_velo;

import java.util.Scanner;

public class Mais_velo {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar? ");
        int n  = sc.nextInt();
        
        String[] nome = new String[n];
        int[] idade = new int[n];
        int i,posic = 0, soma=0;
        for(i=0; i<n;i++){
            System.out.println("Dados da "+(i+1)+"ª pessoa");
            System.out.println("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
        }
        
        for(i=0;i<n;i++){
           if(idade[i]>soma){
              soma = idade[i];
              posic = i;
           }      
           
        }
        System.out.println("Pessoa mais velha: "+nome[posic]);

        
    }
    
}
