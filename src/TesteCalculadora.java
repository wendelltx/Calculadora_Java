import java.util.Scanner;

public class TesteCalculadora {
public static void main(String[] args) {
		
		Scanner leitor =  new  Scanner (System.in);
		Calculadora op = new Calculadora();
		double resultado = 0;
		
		System.out.println("Bem-vindo a Calculadora");
		
		System.out.println("Digite um número: ");
		double numero1 = leitor.nextDouble();
		
		System.out.println("Digite um operador: ");
		String operador = leitor.next();
		
		System.out.println("Digite outro número: ");
		double numero2 = leitor.nextDouble();
		
		switch(operador) {
		case "+": 
			resultado = op.somar(numero1, numero2);
			break;
		case "-": 
			resultado = op.subtrair(numero1, numero2);
			break;
		case "*":
			resultado = op.multiplicar(numero1, numero2);
			break;
		case "/":
			resultado = op.dividir(numero1, numero2);
			break;
		}
		
		System.out.println(numero1+ " " + operador + " "+ numero2 +" = " + resultado);
	}
}
