/*Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
Exemplo:
Entrada:
n = 6


Saída:
     *
    **
   ***
  ****
 *****
******

*/
import java.io.*;
import java.util.Scanner;

public class Questao01 {

public static void main (String[] args) throws IOException{
try (Scanner ler = new Scanner(System.in)) {
     System.out.println("Digite um número inteiro para o valor n: ");
     int numero = ler.nextInt();
     
     System.out.println("O numero digititado foi "+ numero+".\n");

     int j = numero;
     int i = numero;
     int t;
     int x;

     
     while (j > 0) {
          
          for (t = 0; t < (j-1); t += 1) {
               System.out.print(" ");
          }
          j -= 1;

          for (x = 0; x < (i-j); x += 1) {
               System.out.print("*");
          }
          System.out.print('\n');

     }
     
}
}
}