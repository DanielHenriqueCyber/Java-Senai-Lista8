public class Atividade07 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i <= 100) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma = soma + i;
            }
            i = i + 1;
        }
        System.out.println("Soma dos multiplos de 3 ou 5: " + soma);
    }
}
