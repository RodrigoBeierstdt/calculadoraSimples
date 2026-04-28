import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora Java simples.");


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a operação (+, -, *, /):");
        char op = sc.next().charAt(0);

        double resultado = 0;
        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}