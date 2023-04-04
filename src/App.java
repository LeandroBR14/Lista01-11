import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        double numero1 = teclado.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        double numero2 = teclado.nextInt();
        System.out.println("Digite um número real: ");
        double numero3 = teclado.nextDouble();


        //////////////Exercicio letra a///////////////// 
        double calculo1 = (numero1 * 2) * (numero2 / 2);
        System.out.println("O produto do dobro do primeiro número com metade do segundo número é: " +calculo1);

        //////////////Exercicio letra b///////////////// 
        double calculo2 = (numero1 * 3) + numero3;
        System.out.println("A soma do triplo do primeiro número com o terceiro número é: " +calculo2);

        //////////////Exercicio letra c///////////////// 
        double calculo3 = numero3*numero3*numero3;
        System.out.println("O terceiro número elevado ao cubo é: " +calculo3);
        
        teclado.close();
    }
}
