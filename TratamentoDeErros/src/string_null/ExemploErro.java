package string_null;

public class ExemploErro {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length());
        }catch(NullPointerException e){
            System.err.print(e);
        }
    }
}
