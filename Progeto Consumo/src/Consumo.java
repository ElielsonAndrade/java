import java.util.Scanner;

public class Consumo {
public static void main(String[] args) {
	Scanner teclado =new Scanner(System.in);
	double km,litro,  media;
	System.out.println("qual a dist�ncia percorrida");
	km=teclado.nextDouble();
	System.out.println("quantos litros foram gastos");
	litro=teclado.nextDouble();
	media=km/litro;
	System.out.println("o consumo m�dio foi"+media);
	
	
}
}
