package vetor_sem_posicao;

public class ExemploErro {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.print(e);
        }
    }
}