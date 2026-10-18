import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int pares = 0;
        int impares = 0;
        while (contador <= 12) {
            System.out.print("Digite o numero " + contador + ": ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
            contador = contador + 1;
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        sc.close();
    }
}
 