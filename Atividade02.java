import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero limite: ");
        int limite = sc.nextInt();
        int i = 1;
        while (i <= limite) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
 