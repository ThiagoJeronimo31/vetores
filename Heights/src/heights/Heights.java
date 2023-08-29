
package heights;

import java.util.Scanner;

public class Heights {

    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.println("Quantas pessoas serão analisadas? ");
 int n = sc.nextInt();
 
 String[] nome = new String[n];
 int[] idade = new int[n];
 double[] altura = new double[n];
 
 double soma = 0;
 sc.nextLine();
 
 int x = 0;
 int porcen, i;
 double media;
 
 for( i =0; i<n;i++){
     System.out.println("Dados da "+(i+1)+"ª pessoa: ");
     System.out.println("Nome: ");
     nome[i] = sc.nextLine();
     System.out.println("Idade: ");
     idade[i] = sc.nextInt();
     System.out.println("Altura: ");
     altura[i] = sc.nextDouble();
     soma+=altura[i];
     sc.nextLine();
 }
 
 for(i=0;i<n;i++){
     if(idade[i]<16){
        x++;
 }
 }
 porcen = (x*100)/n;
 media = soma/n;
     System.out.printf("Altura média = %.2f\n",media);
     System.out.println("Pessoas com menos de 16 anos: "+porcen+"%");
     
  for(i=0;i<n;i++){
     if(idade[i]<16){
         System.out.println(nome[i]);
 }    
     
     
 }
 
        
   
    }  
}
