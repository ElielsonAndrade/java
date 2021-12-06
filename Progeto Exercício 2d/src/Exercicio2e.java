import java.util.Scanner;

public class Exercicio2e {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double basemaior, basemenor, autura, area;
	System.out.println("por favvor digite a base maior");
	basemaior=teclado.nextDouble();
	System.out.println("por favor digite a base menor");
	basemenor=teclado.nextDouble();
	System.out.println("por favor digite a autura");
	autura=teclado.nextDouble();
	area=(basemaior + basemenor)*autura/2;
	System.out.println("o valor da área vale"+area);
	
	
}
}
