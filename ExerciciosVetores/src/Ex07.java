public class Ex07 {
    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5 };

        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / notas.length;

        System.out.println("Soma:  " + soma);    // 36.5
        System.out.println("Média: " + media);   // 7.3

        int acimaDaMedia = 0;
        for (double n : notas) {
            if (n > media) acimaDaMedia++;
        }
        System.out.println("Acima da média: " + acimaDaMedia);  // 2
    }
}
