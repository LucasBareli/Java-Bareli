package aula04;

public class Main {

    public static void main(String[] args) {

        // ESCOLA
            /*
            Para o aluno ser aprovado, precisa conseguir 3 critérios:
            media maior que, faltas menores que 75 e ele deve ter bom comportamento
            se o aluno falhar somente em um dos critérios, ele terá uma segunda chance, e a chance é de acordo com o cri-
            tério que ele falhou. Exemplo:

            Falhou nas notas -> Prova de recuperação
            Falhou nas faltas -> Sem férias, repor aula
            Falhou no comportamento -> chama pra conversar

            Se o aluno falhou em dois ou mais critérios ele é reprovado diretamente
            */

        double media = 7.3;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        if (media >= 5.0 && faltas < 25 && postura) {
            situacao = "Aprovado";
        }
        // else if significa que ou é um ou é outro que acontece
        // se eu coloco tudo como isso, significa que eles poderiam ocorrer simultaneamente
        else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação";
        }

        else if (media >= 5.0 && faltas >= 25 && postura) {
            situacao = "Sem férias, repor aula!";
        }

        else if (media >= 5.0 && faltas < 25 && !postura) {  // ! = not
            situacao = "Vai ter conversinha!";
        }

        else {
            situacao = "Reprovado";
        }

        System.out.println(situacao);
    }
}