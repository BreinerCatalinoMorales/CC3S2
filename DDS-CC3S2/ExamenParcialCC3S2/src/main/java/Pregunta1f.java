import java.util.ArrayList;
import java.util.List;

public class Pregunta1f {
    public static void main(String[] args){
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('z');
        chars.add('X');

        //Muestrta la lista de caracteres
        System.out.println(chars);

        //Elimina los caracteres
        remove(chars);
        System.out.println(chars);
    }

    //Si la palabra que removere en este caso 'c'
    //es mayor o igual que 'a' Y es menor o igual que 'z'
    // entonces se elimina ese caracter
    public static void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
    }
}
