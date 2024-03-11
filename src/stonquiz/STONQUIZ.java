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
        System.out.println("Olá " + nome + "!");
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
            System.out.println("Para iniciar, selecione uma das opções abaixo!");
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
                    System.out.println("Opção inválida! Tente novamente");
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
                System.out.println("Opcao inválida! Tente novamente\n");
            }
        } while (!op.equals("1"));
        return op;
    }

    public static void Desenvolvedores() {
        System.out.println( "\n----------------------------------------------------");
        System.out.println("*-*-* DESENVOLVEDORES *-*-*");
        System.out.println("Ana Beatriz Martins Bezerra");
        System.out.println("Daniel Pereira AssunÃ§Ã£o ");
        System.out.println("Eduardo Margem Cerqueira de Jesus");
        System.out.println("Eduardo Oliveira Neves");
        System.out.println("Mateus Santos e Silva");
        System.out.println("Sara de Sousa Lima");
        retornaMenu();
    }

    public static void StonQuiz() {
        System.out.println( "\n----------------------------------------------------");
        System.out.println("*-*-* STONQUIZ *-*-*");
        System.out.println("\tO projeto visa facilitar a jornada de aprendizado em T.I.\nMuitas pessoas têm interesse na área, mas se sentem apreensivas\ncom a quantidade de informações novas.\n\tO StonQuiz ajuda a descomplicar nesses temas, seja para iniciantes\nou profissionais que precisam de um 'empurrãozinho'em assuntos mais específicos,\ndesde interações com novos softwares até comandos de programação.");
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
            System.out.println("Qual é a função do operador == em JAVA?");
            System.out.println("1) Comparar se dois objetos são iguais.");
            System.out.println("2) Atribuir um valor a uma variável.");
            System.out.println("3) Verificar se uma variável é nula.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuaação atual é " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");
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
            System.out.println( "Qual dos seguintes tipos de dados em Java é usado para representar números inteiros ?");
            System.out.println("1) float");
            System.out.println("2) double");
            System.out.println("3) int");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "2":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "3":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente");
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
            System.out.println("O que é um 'loop' em Java?");
            System.out.println( "1) Uma estrutura de controle que permite a execução condicional de código.");
            System.out.println( "2) Uma estrutura de controle que repete um bloco de código várias vezes.");
            System.out.println("3) Uma classe que armazena dados em forma tabular.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "2":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuaação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente");
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
            System.out.println("Qual é a saída do código: System.out.println(5 + 'Java')?");
            System.out.println("1) Java5");
            System.out.println("2) 5Java");
            System.out.println("3) Um erro será gerado");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "2":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "1":
                case "3":
                    System.out.println("A resposta estÃ¡ incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente");
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
            System.out.println("Qual é a finalidade da palavra-chave break em um loop em Java ?");
            System.out.println("1) Para sair imediatamente do loop.");
            System.out.println("2) Para encerrar o programa.");
            System.out.println("3) Para iniciar o loop novamente.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");
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
            System.out.println("Como você faz a leitura de um número inteiro a partir do {console }  em Java ?");
            System.out.println("1) Scanner.nextInt();");
            System.out.println("2) System.readInteger();");
            System.out.println("3) Integer.read();");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "2":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");
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
            System.out.println("Qual é a principal função do método main em uma classe Java?");
            System.out.println("1) Inicializar variáveis.");
            System.out.println("2) Declarar métodos principais.");
            System.out.println("3) Executar o programa Java.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                case "3":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "2":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");
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
            System.out.println("Qual é a finalidade do operador % (módulo) em Java ?");
            System.out.println("1) Realizar a multiplicação de dois números.");
            System.out.println("2) Comparar dois números para verificar se são iguais.");
            System.out.println("3) Retornar o resto da divisão de um número pelo outro.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "3":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "1":
                case "2":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente");
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
            System.out.println("Como você acessa o terceiro elemento de um array em Java ?");
            System.out.println("1) array[2];");
            System.out.println("2) array(2);");
            System.out.println("3) array{3};");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "1":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "3":
                case "2":
                    System.out.println("A resposta esá incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");
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
            System.out.println( "O que acontece se você tentar acessar um índice fora dos limites de um array em Java ?");
            System.out.println("1) O programa encerra sem lançar exceções.");
            System.out.println("2) O índice é automaticamente ajustado para o valor mais próximo dentro dos limites.");
            System.out.println("3) O programa lança uma exceção IndexOutOfBoundsException.");
            System.out.println("Insira sua resposta:");
            op = input.nextLine();
            switch (op) {
                case "3":
                    System.out.println("A resposta está correta!");
                    pontuacao = pontuacao + 1;
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                case "1":
                case "2":
                    System.out.println("A resposta está incorreta!");
                    System.out.println("Sua pontuação atual é " + pontuacao);
                    break;
                default:
                    System.out.println("Opção Invlida! Tente novamente");
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
        System.out.println("\nPontuação final: " + percentual + "%");

        switch (op) {
            case 'A':
                System.out.println("\nSUPER STONKS | Parabéns, você foi ótimo!");
                break;
            case 'B':
                System.out.println("\nSTONKS | Foi bem, mas por favor, melhore!");
                break;
            case 'C':
                System.out.println( "\nNOT STONKS | Revise os conteúdos, e tente novamente!");
                break;
            case 'D':
                System.out.println("\nCONFUSED STONKS | ???????");
                break;
            default:
                System.out.println("Cálculo inválido. Tente novamente!");
        }
    }
}
