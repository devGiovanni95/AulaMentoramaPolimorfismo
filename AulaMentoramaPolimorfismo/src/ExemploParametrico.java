import java.util.LinkedList;
import java.util.List;

public class ExemploParametrico {
    public static void main(String[] args) {
        List<Integer> minhaListaInt = new LinkedList<Integer>();   //se utiliza o <Integer> para definir os tipos de objetos que a lista irá conter
        minhaListaInt.add(new Integer(0));
        Integer x = (Integer) minhaListaInt.iterator().next();
    }
}
