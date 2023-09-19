import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o coeficiente a da equação cúbica: ");
	        double a = scanner.nextDouble();
	        System.out.println("Digite o coeficiente b da equação cúbica: ");
	        double b = scanner.nextDouble();
	        System.out.println("Digite o coeficiente c da equação cúbica: ");
	        double c = scanner.nextDouble();
	        System.out.println("Digite o coeficiente d da equação cúbica: ");
	        double d = scanner.nextDouble();

	        double p = (3 * a * c - b * b) / (3 * a * a);
	        double q = (2 * b * b * b - 9 * a * b * c + 27 * a * a * d) / (27 * a * a * a);

	        double discriminante = (q * q / 4) + (p * p * p / 27);

	        if (discriminante > 0) {
	            double raizCubica1 = Math.cbrt(-q / 2 + Math.sqrt(discriminante));
	            double raizCubica2 = Math.cbrt(-q / 2 - Math.sqrt(discriminante));
	            double x1 = raizCubica1 + raizCubica2 - (b / (3 * a));
	            System.out.println("Raiz 1: " + x1);
	        } else if (discriminante == 0) {
	            double raizCubica = Math.cbrt(-q / 2);
	            double x1 = 2 * raizCubica - (b / (3 * a));
	            double x2 = -raizCubica - (b / (3 * a));
	            System.out.println("Raiz 1: " + x1);
	            System.out.println("Raiz 2: " + x2);
	        } else {
	            double raizCubica1 = Math.cbrt(Math.sqrt(-discriminante) + Math.abs(q) / 2);
	            double raizCubica2 = Math.cbrt(-Math.sqrt(-discriminante) + Math.abs(q) / 2);
	            double x1 = (raizCubica1 + raizCubica2) - (b / (3 * a));
	            double x2 = -(raizCubica1 + raizCubica2) / 2 - (b / (3 * a));
	            double x3 = (raizCubica1 - raizCubica2) * Math.sqrt(3) / 2;
	            
	            System.out.println("Raiz 1: " + x1);
	            System.out.println("Raiz 2: " + x2 + " + " + x3 + "i");
	            System.out.println("Raiz 3: " + x2 + " - " + x3 + "i");
	        }

	        scanner.close();

	}

}
