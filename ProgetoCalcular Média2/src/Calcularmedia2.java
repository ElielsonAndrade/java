import java.util.Scanner;

public class Calcularmedia2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("digite a primeira nota");
		nota1 = teclado.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("sua média vale" + media);
		if (media >= 8 && media <= 10) {
			System.out.println("você foi provado com lovor");
		} else if (media >= 6 && media <= 8) {
			System.out.println("você está aprovado");
		} else if (media >= 5 && media <= 6) {
			System.out.println("você está em recuperação");
			
		}
		else {
			System.out.println("você está reprovado");
		}
	}
}
