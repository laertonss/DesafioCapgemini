<?php
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

class Questao03 {
    public $string;
    
    // Função construtora da classe
    function __construct($string)
	{
		$this->string = $string;
		
	}
    
    //Função que retorna todas as substrings de uma 
    //string informada na função construtora ao instanciar a classe Questao03
    public function getSubstrings(){
        
        $t = strlen($this->string);
        
        //Separando a string em um array de caracteres individuais e adicionando-os no array de resultado
        $strArr = str_split($this->string);
        
        $subArr = $strArr;
            
        //Usando a funcao substr gera-se as substrings com 2 ou mais caracteres da string declarada ao 
        //instanciar a classe Questao03
        for ($i=2; $i < $t; $i++) { 
            
            for ($j=0; $j < $t; $j++) { 
                $sub = substr($this->string, $j, $i);
                
                if(in_array($sub, $subArr)){
                    
                }
                else{
                        $subArr[] = $sub;
                }
                
            }
           
            
        }
        return $subArr;
    }

    //Função criada para veificar se duas strings passadas por parâmetros são ou não Anagramas
    public function EhAnagrama(string $astro1, string $astro2){
        $ehAnag = true;
        $t1 = strlen($astro1);
        $t2 = strlen($astro2);
        
        //Validação do tamanho das substrings
        if($t1 == $t2){

            $strArr = str_split($astro1);

                foreach ($strArr as &$valor) {
                    
                    //Validando se um caractere analisado existe na string comparada e se a quantidade
                    // de repetição é igual em ambas as substrings passadas por parâmetro
                    if ((substr_count($astro1, $valor)) == (substr_count($astro2, $valor))){
                        
                        $result = strpos($astro2, $valor);
                        if ($result !== false) {
                            
                            
                        }else {
                            $ehAnag = false;
                            
                        }
                    }else{
                    $ehAnag = false;
                    }
                }
        }else{
            $ehAnag = false;
        }
    
        return $ehAnag;
        
    }

    //Função que recebe um array de substrings (gerado pela função getSubstrings) e retorna 
    //um array de pares de substrings que são anagramas
    public function GetParesAnagrama(array $arr){
        $tam = sizeof($arr);
        
        $paresAna = [];
        for ($i=0; $i < $tam; $i++) { 
            
            for ($j=($i+1); $j < $tam; $j++) {
                //Chamando a função EhAnagrama passa-se e compara-se cada substrings com as demais 
                //do array de substrings a fim de identificar quais são pares de anagramas
                if (Questao03::EhAnagrama($arr[$i], $arr[$j])){
                    $paresAna[] = [$arr[$i], $arr[$j]];
                }else{

                }    
            }

        } 
        return $paresAna;
            
    }
}