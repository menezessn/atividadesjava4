package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Selecione uma das op��es do menu: \n1 - Veja a mensagem. \n2- Tire 10% do valor. \n3 - Selecione a categoria. \n4 - Sair");
	int numero;
	
	numero = grava.nextInt();
	
	if (numero==1) {
	
		System.out.println("Bem vindo ao nosso sistema!");
		
	}
	
	else if (numero==2) {
		
		double valor;
		System.out.println("Digite o valor: ");
		valor = grava.nextDouble();
		System.out.println("10% a menos desse valor � " + (valor-(valor*0.1)));
		
	}

	else if (numero==3) {
		
		System.out.println("Digite a sua idade");
		int idade;
		idade = grava.nextInt();
		if (idade<=0) {
			System.out.println("Idade inv�lida");
		}
		else if (idade>=1 && idade<11) {
			System.out.println("Infantil");
		} else if (idade>=11 && idade<14) {
			System.out.println("Infanto-juvenil");
		} else if (idade>=14 && idade<18) {
			System.out.println("Pr�-adolescente");
		} else {
			System.out.println("Adulto");
		} 
	}

	else if (numero==4) {
		
		System.out.println("Voc� saiu do sistema");
	} else {
		System.out.println("Comando inv�lido.");
	}
	
		
	}
	
	

	

}
