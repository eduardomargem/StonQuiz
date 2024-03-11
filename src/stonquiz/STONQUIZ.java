package stonquiz;
import java.util.Scanner;
public class STONQUIZ {

    public static int pontuacao = 0;

    public static void main(String[] args) {
        BoasVindas();
        menu();
    }

    public static void BoasVindas() {
        System.out.println("Seja bem-vindo ao StonQuiz!");
        String nome = entradaNome();
        System.out.println("Ol� " + nome + "!");
        System.out.println( "\n----------------------------------------------------");
 }
    public static String entradaNome() {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        return nome;
    }

    public static String menu() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println("Para iniciar, selecione uma das op��es abaixo!");
            System.out.println("*-*-* MENU *-*-*");
            System.out.println("1- Start Game");
            System.out.println("2- Desenvolvedores");
            System.out.println("3- StonQuiz");
            op = input.nextLine();
            switch (op) {
                case "1":
                    Game();
                    break;
                case "2":
                    Desenvolvedores();
                    break;
                case "3":
                    StonQuiz();
                    break;
                default:
                    System.out.println( "\n----------------------------------------------------");
                    System.out.println("Op��o inv�lida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String retornaMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println( "\n----------------------------------------------------");
        System.out.println("Digite 1 para voltar ao menu ou 2 para enecerrar o programa:\n");
        String op;
        do {
            op = input.nextLine();
            if (op.equals("1")) {
                menu();
            } else if (op.equals("2")) {
                System.exit(0);

            } else {
                System.out.println("Opcao inv�lida! Tente novamente\n");
            }
        } while (!op.equals("1"));
        return op;
    }

    public static void Desenvolvedores() {
        System.out.println( "\n----------------------------------------------------");
        System.out.println("*-*-* DESENVOLVEDORES *-*-*");
        System.out.println("Ana Beatriz Martins Bezerra");
        System.out.println("Daniel Pereira Assunção ");
        System.out.println("Eduardo Margem Cerqueira de Jesus");
        System.out.println("Eduardo Oliveira Neves");
        System.out.println("Mateus Santos e Silva");
        System.out.println("Sara de Sousa Lima");
        retornaMenu();
    }

    public static void StonQuiz() {
        System.out.println( "\n----------------------------------------------------");
        System.out.println("*-*-* STONQUIZ *-*-*");
        System.out.println("\tO projeto visa facilitar a jornada de aprendizado em T.I.\nMuitas pessoas t�m interesse na �rea, mas se sentem apreensivas\ncom a quantidade de informa��es novas.\n\tO StonQuiz ajuda a descomplicar nesses temas, seja para iniciantes\nou profissionais que precisam de um 'empurr�ozinho'em assuntos mais espec�ficos,\ndesde intera��es com novos softwares at� comandos de programa��o.");
        retornaMenu();
    }

    public static void Game() {
        pontuacao = 0;
        pergunta1();
        pergunta2();
        pergunta3();
        pergunta4();
        pergunta5();
        pergunta6();
        pergunta7();
        pergunta8();
        pergunta9();
        pergunta10();
        mensagemFinal();
        retornaMenu();
    }

    public static String pergunta1() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 1:");
            System.out.println("Qual � a fun��o do operador == em JAVA?");
            System.out.println("1) Comparar se dois objetos s�o iguais.");
            System.out.println("2) Atribuir um valor a uma vari�vel.");
            System.out.println("3) Verificar se uma vari�vel � nula.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuaa��o atual � " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta2() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 2:");
            System.out.println( "Qual dos seguintes tipos de dados em Java � usado para representar n�meros inteiros ?");
            System.out.println("1) float");
            System.out.println("2) double");
            System.out.println("3) int");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "2":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "3":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta3() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 3:");
            System.out.println("O que � um 'loop' em Java?");
            System.out.println( "1) Uma estrutura de controle que permite a execu��o condicional de c�digo.");
            System.out.println( "2) Uma estrutura de controle que repete um bloco de c�digo v�rias vezes.");
            System.out.println("3) Uma classe que armazena dados em forma tabular.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "3":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "2":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuaa��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Inv�lida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta4() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 4:");
            System.out.println("Qual � a sa�da do c�digo: System.out.println(5 + 'Java')?");
            System.out.println("1) Java5");
            System.out.println("2) 5Java");
            System.out.println("3) Um erro ser� gerado");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "2":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "1":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Inv�lida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta5() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 5:");
            System.out.println("Qual � a finalidade da palavra-chave break em um loop em Java ?");
            System.out.println("1) Para sair imediatamente do loop.");
            System.out.println("2) Para encerrar o programa.");
            System.out.println("3) Para iniciar o loop novamente.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta6() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 6:");
            System.out.println("Como voc� faz a leitura de um n�mero inteiro a partir do {console }  em Java ?");
            System.out.println("1) Scanner.nextInt();");
            System.out.println("2) System.readInteger();");
            System.out.println("3) Integer.read();");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta7() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println("\n----------------------------------------------------");
            System.out.println("PERGUNTA 7:");
            System.out.println("Qual � a principal fun��o do m�todo main em uma classe Java?");
            System.out.println("1) Inicializar vari�veis.");
            System.out.println("2) Declarar m�todos principais.");
            System.out.println("3) Executar o programa Java.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "3":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "2":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta8() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 8:");
            System.out.println("Qual � a finalidade do operador % (m�dulo) em Java ?");
            System.out.println("1) Realizar a multiplica��o de dois n�meros.");
            System.out.println("2) Comparar dois n�meros para verificar se s�o iguais.");
            System.out.println("3) Retornar o resto da divis�o de um n�mero pelo outro.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "3":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "1":
                case "2":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Inv�lida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta9() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 9:");
            System.out.println("Como voc� acessa o terceiro elemento de um array em Java ?");
            System.out.println("1) array[2];");
            System.out.println("2) array(2);");
            System.out.println("3) array{3};");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "3":
                case "2":
                    System.out.println("A resposta es� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invalida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }

    public static String pergunta10() {
        Scanner input = new Scanner(System.in);
        String op;
        do {
            System.out.println( "\n----------------------------------------------------");
            System.out.println("PERGUNTA 10:");
            System.out.println( "O que acontece se voc� tentar acessar um �ndice fora dos limites de um array em Java ?");
            System.out.println("1) O programa encerra sem lan�ar exce��es.");
            System.out.println("2) O �ndice � automaticamente ajustado para o valor mais pr�ximo dentro dos limites.");
            System.out.println("3) O programa lan�a uma exce��o IndexOutOfBoundsException.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "3":
                    System.out.println("A resposta est� correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                case "1":
                case "2":
                    System.out.println("A resposta est� incorreta!");
                    System.out.println("Sua pontua��o atual � " + pontuacao);
                    break;
                default:
                    System.out.println("Op��o Invlida! Tente novamente");
            }
        } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
        return op;
    }
    public static void mensagemFinal() {
        char op = ' ';

        float percentual = ((float) pontuacao / 10) * 100;

        if ((percentual >= 80) && (percentual <= 100)) {
            op = 'A';
        } else if ((percentual >= 60) && (percentual <= 79)) {
            op = 'B';
        } else if ((percentual >= 30) && (percentual <= 59)) {
            op = 'C';
        } else if ((percentual >= 0) && (percentual <= 29)) {
            op = 'D';
        }

        System.out.println("\n----------------------------------------------------");
        System.out.println("\nPontua��o final: " + percentual + "%");

        switch (op) {
            case 'A':
                System.out.println("\nSUPER STONKS | Parab�ns, voc� foi �timo!");
                break;
            case 'B':
                System.out.println("\nSTONKS | Foi bem, mas por favor, melhore!");
                break;
            case 'C':
                System.out.println( "\nNOT STONKS | Revise os conte�dos, e tente novamente!");
                break;
            case 'D':
                System.out.println("\nCONFUSED STONKS | ???????");
                break;
            default:
                System.out.println("C�lculo inv�lido. Tente novamente!");
        }
    }
}
