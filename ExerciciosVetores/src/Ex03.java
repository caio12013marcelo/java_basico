public class Ex03 {
    public static void main(String[] args) {
        int[] quad = new int[5];

        for (int i = 0; i < quad.length; i++) {
            quad[i] = i * i;
        }

        for (int n : quad) {
            System.out.print(n + " ");  // 0 1 4 9 16
        }
    }
}
