package com.mycompany.forexer;
import java.util.Scanner;
public class Forexer {
public static void main(String[] args) {
//int i=0; ele entra valendo zero
//i++ ele vai voltar somando mais um
//O primeiro número determinará a quantidade de numeros que voce podera colocar 

Scanner teclado = new Scanner (System.in);

System.out.println("Digite quantos números gostaria de somar:");
int n = teclado.nextInt();
int soma = 0;

System.out.println("Quais os números você gostaria de somar?");
for(int i=0; i < n; i++){
    
int x = teclado.nextInt();
soma += x;
    
}
        System.out.println("A soma de todos os números digitado é " + soma);    
        teclado.close();
        
    }
}

