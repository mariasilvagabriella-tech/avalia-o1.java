import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada de notas
        System.out.println("Digite as 8 notas anuais:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas[0] + notas[1]) / 2;
        double bimestre2 = (notas[2] + notas[3]) / 2;
        double semestre1 = (bimestre1 + bimestre2) / 2;

        double bimestre3 = (notas[4] + notas[5]) / 2;
        double bimestre4 = (notas[6] + notas[7]) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Saída formatada
        System.out.println("\nPráticas");
        System.out.printf("1o Bimestre: %.1f%n", bimestre1);
        System.out.printf("2o Bimestre: %.1f%n", bimestre2);
        System.out.printf("1o Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f%n", bimestre3);
        System.out.printf("4o Bimestre: %.1f%n", bimestre4);
        System.out.printf("2o Semestre: %.1f%n", semestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
