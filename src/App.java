import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Células disponíveis: 100, 50, 20, 10, 5, 2");

        Scanner scanner = new Scanner(System.in);
        Integer valorDigitado = scanner.nextInt();

        Integer[] notas = {100, 50, 20, 10, 5, 2};
        List<String> notasUtilizadas = new ArrayList<String>();
        Integer quantidadeNotas = 0;

        // Primeira forma de fazer
        
        for(int i = 0; i <= valorDigitado; i++) {
            while (valorDigitado >= notas[i]) {
                valorDigitado -= notas[i];
                quantidadeNotas++;
                notasUtilizadas.add("Nota Utilizada: " + notas[i]);
            }
        }

        // Segunda forma de fazer

        // for(int i = 0; i <= valorDigitado; i++) {
        //     if(valorDigitado >= 100) {
        //         valorDigitado -= 100;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 100");
        //     } else if (valorDigitado >= 50) {
        //         valorDigitado -= 50;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 50");
        //     } else if (valorDigitado >= 20) {
        //         valorDigitado -= 20;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 20");
        //     } else if (valorDigitado >= 10) {
        //         valorDigitado -= 10;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 10");
        //     } else if (valorDigitado >= 5) {
        //         valorDigitado -= 5;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 5");
        //     } else if (valorDigitado >= 2) {
        //         valorDigitado -= 2;
        //         quantidadeNotas++;
        //         notasUtilizadas.add("Nota Utilizada: 2");
        //     } 
        // }

        if(valorDigitado == 0) {
            System.out.println("Quantidades de notas: " + quantidadeNotas);
            notasUtilizadas.forEach(nota -> System.out.println(nota));
        } else {
            System.out.println("Somente valores múltiplos de 2");
        }

        scanner.close();
    }
}
