import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        }
        int i = 2;
        while (i < numero && primo) {
            if (numero % i == 0) {
                primo = false;
            }
            i = i + 1;
        }
        if (primo) {
            System.out.println(numero + " e primo");
        } else {
            System.out.println(numero + " nao e primo");
        }
        sc.close();
    }
}
 