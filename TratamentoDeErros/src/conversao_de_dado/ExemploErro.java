package conversao_de_dado;

public class ExemploErro {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println(str);
        }catch(ClassCastException e){
            System.err.print(e);
        }
    }
}