/*Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser 
realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que 
encontre o número de pares de substrings que são anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo


Saída:
2


Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas 
posições [[0], [2]], [[0, 1], [1, 2]] respectivamente.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Questao03 {



public static void main (String[] args) throws IOException{
try (Scanner ler = new Scanner(System.in)) {
     System.out.println("Digite uma string qualquer: ");
     String palavra = ler.nextLine();
     
     System.out.println("A palavra digititada foi "+ palavra+".\n");
        int tam = palavra.length();
        List<String> subs = new ArrayList<String>();
        List<String> anag = new ArrayList<String>();
        int contadorAnag = 0;

        for (int i = 0; i < tam; i++){

            for(int j = i+ 1; j <= tam; j++)
            subs.add(palavra.substring(i, j));
            
        }
        int t = subs.size();
        
        for (int i = 0; i < t; i++) {
            

            for (int j = i+1; j < t; j++) {
                
                if(ehAnagrama(subs.get(i), subs.get(j))){
                   anag.add("[["+subs.get(i)+"], ["+subs.get(j)+"]]");
                        contadorAnag++;
                }
            }
                
            
        }

        //System.out.println("Todas as substrings: "+subs+"\n");
        System.out.println("Quantidade de pares de anagrama: "+contadorAnag+"\n");
        //System.out.println("Os pares de anagramas: "+anag+"\n");
        
}
}
private static boolean ehAnagrama(String str1, String str2){
    int c = 0;
    if(str1.length() == str2.length()){
    for(int x = 0; x < str1.length(); x++)
        c = c ^ str1.charAt(x);
    for(int x = 0; x < str2.length(); x++)
        c = c ^ str2.charAt(x);
    return (c == 0);
    }else{return (c != 0);}
    
    
}

}