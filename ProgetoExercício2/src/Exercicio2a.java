import java.util.Scanner;

public class Exercicio2a {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double lado, area;
	System.out.println("por favor digite o lado");
	lado=teclado.nextDouble();
	area=lado*lado;
	System.out.println("o valor da área vale"+area);
	
}
}
