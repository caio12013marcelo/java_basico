public class Ex05 {
    public static void main(String[] args) {
        int[] v = { 3, 7, 1, 9, 4, 6, 2, 8, 5 };

        for (int i = 1; i < v.length; i += 2) {
            if(i % 2 !=0){
                System.out.println(v[i]+ " = "+i);
            }
        }
    }
}
