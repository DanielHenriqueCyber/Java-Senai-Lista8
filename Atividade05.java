import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o numero N: ");
            int n = sc.nextInt();
            System.out.print("Digite o divisor D: ");
            int d = sc.nextInt();
            if (d == 0) {
                System.out.println("Nao existe divisao por zero!");
            } else if (n % d == 0) {
                System.out.println(n + " e divisivel por " + d);
            } else {
                System.out.println(n + " nao e divisivel por " + d);
            }
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next();
        }
        sc.close();
    }
}
 