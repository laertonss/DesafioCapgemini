<?php
include ("Questao03.php");
$questao = new Questao03("ovo");
$arrStr = $questao->getSubstrings();

$pares = $questao->GetParesAnagrama($arrStr);
//print_r ($pares);
print_r ("<hr>Saída: ".(sizeof($pares)));
