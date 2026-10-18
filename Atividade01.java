import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        while (contador <= 20) {
            System.out.print("Digite o numero " + contador + ": ");
            int numero = sc.nextInt();
            int resto = numero % 2;
            if (resto == 0) {
                System.out.println(numero + " e par");
            } else {
                System.out.println(numero + " e impar");
            }
            contador = contador + 1;
        }
        sc.close();
    }
}
 