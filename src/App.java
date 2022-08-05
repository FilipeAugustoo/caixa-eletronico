import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Células disponíveis: 100, 50, 20, 10, 5, 2");

        Scanner scanner = new Scanner(System.in);
        Integer valorDigitado = scanner.nextInt();

        Integer[] notas = {100, 50, 20, 10, 5, 2};       
        Integer quantidadeNotas = 0;

        // Primeira forma de fazer
        
        for(int i = 0; i <= valorDigitado; i++) {
            var quantidadeDeCadaNota = 0;
            while (valorDigitado >= notas[i]) {
                if(notas[i] == notas[i]) {
                    quantidadeDeCadaNota++;
                }
                valorDigitado -= notas[i];
                quantidadeNotas++;  
            }
            if(quantidadeDeCadaNota != 0) {
                System.out.println(quantidadeDeCadaNota + " Notas de: " + notas[i]);
            }
            quantidadeDeCadaNota = 0;
        }


        if(valorDigitado == 0) {
            System.out.println("Quantidades de notas: " + quantidadeNotas);
        } else {
            System.out.println("Somente valores múltiplos de 2");
        }

        scanner.close();
    }
}
