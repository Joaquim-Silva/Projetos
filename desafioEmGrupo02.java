import java.util.Scanner;
import java.math.*;

public class desafioEmGrupo02 {

	public static void main(String[] args) {
		/*
		PROJETO
		ESPECIFICA��O DE PROGRAMA:
		NOME DE LOJA: CADA GRUPO INVENTAR	OK
		QUERO 10 PRODUTOS DIFERENTES � CADA GRUPO DEFINE	OK
		QUERO SABE SE � LITRO, KG, QDE, PE�A, UNIDADE � CONFORME O PRODUTO	OK
		VALOR UNITARIO POR UNIDADE	OK
		O ESTOQUE MINIMO DE SAIDA � 10 POR UNIDADE OK
		TUDO ISSO EM VETOR
		CRIAR UM CODIGO DE PRODUTO PARA CADA PRODUTO OK
		[O CARRINHO DE COMPRA � UM VETOR DE COMPRAS]	
		*O CLIENTE S� PODE COMPRAR 10 PRODUTOS SEM REPETI��O
		O PROGRAMA DEVER:
		MOSTRA OS PRODUTOS COM TODOS OS DADOS
		DAR A OP��O DO USUARIO SELECIONAR UM PRODUTO E DIZER A QUANTIDADE A COMPRAR (N�O PODE SELECIONAR PRODUTO COM QTDE ZERO)
		DAR OP��O AO USUARIO DE CONTINUAR COMPRANDO
		CASO FINALIZADA A COMPRA MOSTRA O TOTAL, MOSTRA O IMPOSTO DE 9% TOTAL E AS OP��ES DE PAGAMENTO:
		C�digo Condi��o de pagamento
		1 � vista em dinheiro ou cheque, recebe 20% de desconto
		2 � vista no cart�o de cr�dito, recebe 15% de desconto
		3 Em duas vezes, pre�o normal de etiqueta sem juros [ QUERO VER AS PARCELAS]
		4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10% [QUERO VER AS PARCELAS COM JUROS]
               MOSTRA NOTA FISCAL
               NOME EMPRESA
               RELA��O DE PRODUTOS COMPRADOS
               IMPOSTO PAGO
               VALOR A PAGA NO TIPO SELECIONADO
               O PROGRAMA DEVER INFORMAR SE CONTINUA S OU N�O PARA O PROXIMO USUARIO, SEN�O SAIR DO PROGRAMA, SE SIM, RECOME�A
               MAIS J� CONSIDERAR A ALTERA��O DO ESTOQUE.
		*/
		String mercadoria[]={
				"ps4","ps4 Pro","xbox 360","xbox X Series",
				"ps3","controle Xbox","Controle PS4","Pc Gamer",
				"Controle PC","Teclado Gamer"
				};
		int unidades [] ={10,10,10,10,10,10,10,10,10,10};
		double preco [] = {
				2000.15, 4000.87, 899.99, 3000.50, 900.45, 
				120.99, 140.99, 129.01, 200.99, 140.99
				};
		String continuar, continuar2;
		boolean continua2 = true;
		int codigo;
		char pagamento = '0';
		double imposto;
		int qntd = 0;
		String comprador[] = new String[2];
		int x, compras[] = new int[10];
		double total = 0.0, parcelas = 0.0;
		
		Scanner read = new Scanner("System.in");

	}
	
}
