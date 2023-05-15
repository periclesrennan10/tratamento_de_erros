package formatacao_de_numeros;

public class ExemploErro {
    public static void main(String[] args) {
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch(NumberFormatException e){
            System.err.print(e);
        }
    }
}