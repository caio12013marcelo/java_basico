public class Ex04 {
    public static void main(String[] args) {
        String[] cidades = {"São Paulo", "Rio", "Curitiba", "Salvador", "Fortaleza"};

        for (int i=0; i<cidades.length;i++) {
            System.out.println(cidades[i].toUpperCase());
        }
        for (String n : cidades){
            System.out.println(n.toUpperCase());
        }
    }
}
