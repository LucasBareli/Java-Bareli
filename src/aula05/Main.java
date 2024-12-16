package aula05;

public class Main {
    public static void main(String[] args) {

        int valor = 1;

        switch (valor) {
            case 1 -> System.out.println("Caso 1");

            case 2 -> System.out.println("Caso 2");

            default -> System.out.println("Caiu no default, valor padrão");
        }
    }
}