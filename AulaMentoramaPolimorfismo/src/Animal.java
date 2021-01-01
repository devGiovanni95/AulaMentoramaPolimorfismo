public class Animal {
    public void comer() {
        System.out.println("Animal comendo");
    }
}

class Galinha extends Animal {
    @Override
    public void comer() {
        System.out.println("Galinha comendo");
    }
}

class Gato extends Animal {
    public void comer() {
        System.out.println("Gato comendo");
    }
}

class Teste {
    public void alimentar(Animal animal) {
        animal.comer();
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.alimentar(new Animal());
        t.alimentar(new Galinha());
        t.alimentar(new Gato());
    }
}
