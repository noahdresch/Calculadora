/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Noa
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nessa calculadora o programa faz apenas uma conta e encerra
        char opcao = ' ';
        double num1, num2;
        double resultado;
       
        
        num1 = Entrada.leiaDouble("Informe primeiro valor: ");
        num2 = Entrada.leiaDouble("Informe segundo valor: ");
        
        while (opcao != 'x') {
            
            opcao = Entrada.leiaChar("CALCULADORA - Versão Java\n\n"
                    + "[1] - Somar\n"
                    + "[2] - Subtrair\n"
                    + "[3] - Multiplicar\n"
                    + "[4] - Dividir\n\n"
                    + "[x] - eXit");
            
            
            
            switch (opcao) {
            case '1' -> { 
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                }
            case '2' -> {
                resultado = num1 - num2;
                System.out.println("Resultado: "  + num1 + " - " + num2 + " = " + resultado);
                }
            case '3' -> {
                resultado = num1 * num2;
                System.out.println("Resultado: "  + num1 + " * " + num2 + " = " + resultado);
                }
            case '4' -> { //sistema de divisao feito para dar erro se selecionar valor ' 0 zero '
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: "  + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                }
            default -> {
                System.out.println("Operador inválido.");
                }
        
        
        
    }
            
    System.exit(0);
    }
        
}
    
}
    

