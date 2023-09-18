import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try (var terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parametro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro: ");
            int parametroDois = terminal.nextInt();

            try{
                //chamando o método contendo a lógica de contagem
                Contador.contar(parametroUm, parametroDois);
                
                }catch (InputMismatchException e){
                 
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    }
    static void contar(int parametroUm, int parametroDois) {
        
        if(parametroUm > parametroDois){
            throw new InputMismatchException(null);

        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println(i);
        }
        System.out.println("total de interação = " + contagem);
    }
}