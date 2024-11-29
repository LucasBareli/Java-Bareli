package aula01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        String nome ;
        int idade;
        String cidade;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome completo : ");
        nome = input.nextLine();

        System.out.println("Digite sua idade : ");
        idade = Integer.parseInt(input.nextLine());

        System.out.println("Digite a cidade onde mora : ");
        cidade = input.nextLine();

        input.close();

        System.out.println("Nome completo : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Cidade : " + cidade);

    }
}
//
//public class Ex_01 {
//    public static void main(String[] args) {
//
//        int num1 = 9;
//        int num2 = 2;
//
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println((double)num1 / num2);
//    }
//}

/* public class Ex_01 {
    public static void main(String[]args){

        double raiz;
        raiz = Math.sqrt(4);
        System.out.println(raiz);

        double potencia;
        potencia = Math.pow(2,3);
        System.out.println(potencia);
    }
} */
