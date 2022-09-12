public class Main {
    public static void main(String[] args) {
        int i;
        int I = 10;
        byte cem = 100;
        char d = 'd';
        final int valor = 500;
        double nota = 1.5d;
        float not = 10.0f;
        i = 20;
        String name = "Nailton";
        boolean logic = true;
        long numeroAlto = 1000000000;
        for (int x = 0; x <= 10; x++) {
            System.out.println("valor do loop "+x);
        }
        int sum = 10 + 10;
        System.out.println("soma = "+sum);
        int sub = 10 - 5;
        System.out.println("subtracao = "+sub);
        long mult = 100000L * 2L;
        System.out.println("multiplicacao = "+mult);
        int k = 10;
        System.out.println("valor inicial de k "+ k);
        int posP = k++;
        System.out.println("valor adicionado pos k "+ k);
        int preP = ++k;
        System.out.println("valor adicionado pre k "+ k);
        int posS = k--;
        System.out.println("valor subtraido pos k "+ k);
        int preS = --k;
        System.out.println("valor subtraido pre k "+ k);
        k += 10;
        System.out.println("valor modificado de k "+ k);
        System.out.println("O valor de i e = "+ i);
        System.out.println("O valor de I e = "+ I);
        System.out.println("O valor de valor e = "+ valor);
        System.out.println("O valor de nota e = "+ nota);
        System.out.println("O valor de name e = "+ name);
    }
}