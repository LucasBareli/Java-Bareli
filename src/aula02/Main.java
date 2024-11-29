import java.util.Scanner;

// Exercício 1

/*

public class Main {
    public static void main(String[] args) {

        double fahrenheit;
        double celsius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos graus em Fahrenheit : ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("Sua temperatura em Celsius : %.2f",celsius);
    }
}

*/

// Exercício 2

/*

public class Main {
    public static void main(String[] args) {

        double fahrenheit;
        double celsius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos graus em Celsius : ");
        celsius = scanner.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("Sua temperatura em Fahrenheit : %.2f",fahrenheit);
    }
}

 */

// Exercício 3

/*

public class Main {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso : ");

        peso = scanner.nextDouble();
        System.out.println("Digite sua altura : ");

        altura = scanner.nextDouble();

        imc = peso / (Math.pow(altura,2));
        System.out.printf("Seu IMC é : %.2f", imc);
    }
}

*/

// Exercício 4

/*

public class Main {
    public static void main(String[] args) {
        double valor;
        double quadrado;
        double cubo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor : ");
        valor = scanner.nextDouble();
        quadrado = Math.pow(valor,2);
        System.out.printf("Valor ao quadrado : %.1f \n",quadrado);
        cubo = Math.pow(valor,3);
        System.out.printf("Valor ao cubo : %.1f",cubo);
    }
}

 */

// Exercício 5

/*

public class Main {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo : ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo : ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;
        System.out.printf("A área do seu triângulo é de : %.2f",area);
    }
}

 */

// Exercício 6


/*

public class Main {
    public static void main(String[] args) {
        double primeiro_numero;
        double segundo_numero;
        double terceiro_numero;
        double delta;
        double equacao1;
        double equacao2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor : ");
        primeiro_numero = scanner.nextDouble();

        System.out.println("Digite o segundo valor : ");
        segundo_numero = scanner.nextDouble();

        System.out.println("Digite o terceiro valor : ");
        terceiro_numero = scanner.nextDouble();

        delta = ((Math.pow(segundo_numero,2)) - (4 * (primeiro_numero * terceiro_numero)));

        equacao1 = ((- (segundo_numero)) + (Math.sqrt(delta))) / (2 * primeiro_numero);
        System.out.printf("Valor da sua bhaskara é : %.2f \n",equacao1);

        equacao2 = ((- (segundo_numero)) - (Math.sqrt(delta))) / (2 * primeiro_numero);
        System.out.printf("Valor da sua bhaskara é : %.2f",equacao2);

        scanner.close();
    }
}

*/

// Desafio 1

/*

public class Main{
    public static void main(String[] args) {
        double conta1;
        double conta2;
        double conta3;
        double conta4;
        double resultado;

        Scanner scanner = new Scanner(System.in);
        conta1 = 3 * Math.pow(-3.0/4.0,-2);
        conta2 = 6 * Math.pow(3.0,-1.0)/4.0 - 4.0;
        conta3 = 7 * Math.pow(-3.0/4.0,-1.0) + 2.0;
        conta4 = (conta1 + conta2) / conta3;
        resultado = Math.pow(conta4,-1) + 4;
        System.out.printf("Resultado da conta é :%f",resultado);
    }
}

*/

/*

public class Main {
    public static void main(String[] args) {
        String negrito = "Like a Bosch";
        System.out.println(negrito + "!");
        System.out.println(negrito.concat("!!!"));
        System.out.println(negrito);
        System.out.println(negrito.charAt(1));
    }
}

*/