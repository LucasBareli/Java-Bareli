import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte variavelByte = 127;
//        System.out.printf("Tamanho do Byte : %d\n",variavelByte);
//
//        short variavelShort = 32767;
//        System.out.printf("Tamanho do Short : %d\n",variavelShort);
//
//        int variavelInt = 127_675_346;
//        System.out.printf("Tamanho do Int : %d\n",variavelInt);
//
//        long variavelLong = 9_127_675_346_127_675_346L;
//        System.out.printf("Tamanho do Long : %d\n",variavelLong);



//        float variavelFloat = 3.4e38F;
//        System.out.printf("Valor de Float : %f\n",variavelFloat);
//
//        double variavelDouble = 1.7e+308;
//        System.out.printf("Valor de Double : %f\n",variavelDouble);


//        char variavelCaracter = 'A';
//        System.out.printf("Variavel caracter é : %c\n",variavelCaracter);
//
//        boolean variavelBoolean = true;
//        System.out.printf("Variavel booleana é : %b\n",variavelBoolean);

//        String variavelString = "Bosch";
//        System.out.println("Eu trabalho na ".concat(variavelString));

        String palavra ;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome completo : ");
        palavra = input.nextLine();
        System.out.println("Nome completo : " + palavra);

        input.close();
    }
}