public class Ex08 {
    public static void main(String[] args) {
        int[] v = { 50, 17, 3, 22, 8, 15, 1, 30, 9 };

        int iMaior = 0, iMenor = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[iMaior]) iMaior = i;
            if (v[i] < v[iMenor]) iMenor = i;
        }

        System.out.println("Maior: v[" + iMaior + "] = " + v[iMaior]);  // v[7] = 30
        System.out.println("Menor: v[" + iMenor + "] = " + v[iMenor]);  // v[6] = 1
    }
}
