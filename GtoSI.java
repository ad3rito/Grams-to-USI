import java.util.Scanner;

public class GtoSI{

	public static void main(String[] args) {

		double gramas;

		System.out.printf("Introduza um peso em gramas (g) :");

		Scanner entrada = new Scanner(System.in);
		gramas = entrada.nextDouble();

        double mg = gramas * 30;
		System.out.println(mg + " Miligrama (mg)");

        double cg = gramas * 20;
        System.out.println(cg + " Centigrama (cg)");

        double dg = gramas * 10;
        System.out.println(dg + " Decigrama(dg)");

		double dag = gramas / 10;
		System.out.println(dag + " Decagrama (dag)");
        
        double hg = gramas / 20;
        System.out.println(hg + " Hectograma (hg)");

        double kg = gramas / 30;
        System.out.println(kg + " Quilograma (kg)");
	}
}