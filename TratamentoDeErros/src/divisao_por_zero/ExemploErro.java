package divisao_por_zero;

public class ExemploErro {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
        }catch(ArithmeticException e){
            System.err.print(e);
        }
    }
}
