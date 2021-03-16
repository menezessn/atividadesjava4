package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Selecione uma das opções do menu: \n1 - Veja a mensagem. \n2- Tire 10% do valor. \n3 - Selecione a categoria. \n4 - Sair");
	int numero;
	
	numero = grava.nextInt();
	
	switch (numero) {
	
	case 1:
	
		System.out.println("Bem vindo ao nosso sistema!");
		
	break;
	
	case 2: 
		
		double valor;
		System.out.println("Digite o valor: ");
		valor = grava.nextDouble();
		System.out.println("10% a menos desse valor é " + (valor-(valor*0.1)));
		
	break;

	case 3:
		
		System.out.println("Digite a sua idade");
		int idade;
		idade = grava.nextInt();
		if (idade<=0) {
			System.out.println("Idade inválida");
		}
		else if (idade>=1 && idade<11) {
			System.out.println("Infantil");
		} else if (idade>=11 && idade<14) {
			System.out.println("Infanto-juvenil");
		} else if (idade>=14 && idade<18) {
			System.out.println("Pré-adolescente");
		} else {
			System.out.println("Adulto");
		} 
		
	break; 

	case 4: 
		
		System.out.println("Você saiu do sistema");
	
	
	
	default:
		
		System.out.println("Comando inválido");
		
		break;
	
	}

	}}


