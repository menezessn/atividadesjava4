package atividade2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Digite a velocidade permitida na via em KM");
	double vmaxima;
	vmaxima = grava.nextDouble();
	System.out.println("Digite a velocidade atual: ");
	double vatual;
	vatual = grava.nextDouble();
	
	if (vatual<=(vmaxima) ) {
		
	
	System.out.println("Sem multa");
	}
	
	else if (vatual<=(vmaxima+10)) {
		
		
		System.out.println("Multa de R$ 80,00");
		}
	else if (vatual<= (vmaxima+40)) {
		
		
	System.out.println("Multa de R$ 120,00");
	
	}
	

	
	
	}

}
