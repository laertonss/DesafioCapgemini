/*
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem 
ser adicionados para uma string qualquer ser considerada segura.

Exemplo:
Entrada:
Ya3


Saída:
3


Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 
2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.


*/
import java.io.*;
import java.util.Scanner;



public class Questao02 {

public static void main (String[] args) throws IOException{
try (Scanner ler = new Scanner(System.in)) {
     System.out.println("Digite uma Senha: ");
     String senha = ler.nextLine();
     
     //System.out.println("A senha digititada foi "+ senha+".\n");
        int qtdCaract = senha.length();
        String carcatEspec = "!@#$%^&*()-+";
        char[] arraySenha = senha.toCharArray();
        char[] arrayCaract = carcatEspec.toCharArray();
        boolean temCaractEspe = false;
        boolean temCaractDigito = false;
        boolean temCaractMinusculo = false;
        boolean temCaractMaiusculo = false;

     if ( qtdCaract >= 6) {
        System.out.println("Sua senha digititada contem 6 ou mais caracteres.\n");
        
            
            for (int cont = 0; cont < qtdCaract; cont++) {
                for (int ct = 0; ct < carcatEspec.length(); ct++) {
                    if(arraySenha[cont] == arrayCaract[ct]){
                        temCaractEspe = true;
                    }
                    String lt = (arraySenha[cont])+"";
                    if(lt.matches("[0-9]*")){
                        temCaractDigito = true;
                    }

                    if(Character.isLowerCase(arraySenha[cont])){
                        temCaractMinusculo = true;
                    }

                    if(Character.isUpperCase(arraySenha[cont])){
                        temCaractMaiusculo = true;
                    }                    
                }
            }
        if (temCaractEspe) {
            System.out.println("Sua senha contem caracteres especiais.\n");
        } else {
            System.out.println("Sua senha não contem caracteres especiais.\n");

        }
        if (temCaractDigito) {
            System.out.println("Sua senha contem digito.\n");
        } else {
            System.out.println("Sua senha não contem digito especiais.\n");

        }
        if (temCaractMinusculo) {
            System.out.println("Sua senha contem letra minuscula.\n");
        } else {
            System.out.println("Sua senha não contem letra minuscula.\n");

        }
        if (temCaractMaiusculo) {
            System.out.println("Sua senha contem letra maiuscula.\n");
        } else {
            System.out.println("Sua senha não contem letra maiuscula.\n");

        }
        
        

     } else {
        System.out.println("A senha digititada contem "+ qtdCaract+" caracteres.\n");
        System.out.println("Você necessita adicionar no mínimo "+ (6 - qtdCaract) +" caracteres para aumentar o nível de segurança.\n");
     }
    if (temCaractEspe & temCaractDigito & temCaractMaiusculo & temCaractMinusculo){
        System.out.println("Parabéns! Você digitou uma senha forte.\n");
    }else{
        System.out.println("Ops! Sua senha possui um nível fraco de segurança.\n");
    }    
}
}
}