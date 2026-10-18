import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int multiplos = 0;
        while (contador <= 15) {
            System.out.print("Digite o numero " + contador + ": ");
            int numero = sc.nextInt();
            if (numero % 4 == 0) {
                multiplos = multiplos + 1;
            }
            contador = contador + 1;
        }
        System.out.println("Multiplos de 4 digitados: " + multiplos);
        sc.close();
    }
}
 