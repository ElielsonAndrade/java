import java.util.Scanner;

public class Exercicio2c {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
double base, autura, area;
System.out.println("por favor digite a base");
base=teclado.nextDouble();
System.out.println("por favor digite a autura ");
autura=teclado.nextDouble();
area=(base*autura)/2;
System.out.println("o valor da área vale"+area);

}
}
