public class TiposPolimorfismo {
    public static int quadrado(int a) {
        System.out.println("quadrado de int: " + a);
        return a * a;
    }

    public static double quadrado(double a) {
        System.out.println("quadrado de double: " + a);
        return a * a;
    }

    public static void main(String args[]){
        quadrado(2);
        quadrado(2.0);
    }
}


