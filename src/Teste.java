import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        MetodosDupla met = new MetodosDupla<>();
        Scanner input = new Scanner(System.in);

        int opcao = 1;

        do {

            escolhas();
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    addNoDuploInicio(met, input);
                    break;
                case 2:
                    addNoDuploFim(met, input);
                    break;
                case 3:
                    addPorPosicao(met, input);
                    break;
                case 4:
                    excluirInicio(met);
                    break;
                case 5:
                    excluirFinal(met);
                    break;
                case 6:
                    excluirPorPosicao(met, input);
                    break;
                case 7:
                    imprimirLista(met);
                case 0:
                    System.out.println("PROGRAMA FINALIZADO!");
                    break;
                default:
                    System.out.println("Insira Um Valor Válido");
                    break;
            }
        } while (opcao != 0);
    }

}

public static void escolhas() {
    System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
    System.out.println("1-ADICIONAR NO INICIO");
    System.out.println("2-ADICIONAR NO FINAL");
    System.out.println("3-ADICIONAR POR POSIÇÃO");
    System.out.println("4-EXCLUIR INICIO");
    System.out.println("5-EXCLUIR FINAL");
    System.out.println("6-EXCLUIR POR POSIÇÃO");
    System.out.println("7-MOSTRAR LISTA");
    System.out.println("8-SAIR DO PROGRAMA");
}

public static void addNoDuploInicio(MetodosDupla met, Scanner input) {

    NoDuplo no;
    System.out.println("Esolha o nome:");
    no.setElemento(input.nextLine());
    met.addNoDuploInicio(met);

}

public static void addNoDuploFim(MetodosDupla met, Scanner input) {

    NoDuplo no;
    System.out.println("Esolha o nome:");
    no.setElemento(input.nextLine());
    met.addNoDuploFim(met);

}

public static void addPorPosicao(MetodosDupla met, Scanner input) {

    NoDuplo no;
    System.out.println("Esolha o nome:");
    no.setElemento(input.nextLine());

    System.out.println("Em que posição deseja colocar:");
    int index = input.nextInt();
    met.addPorPosicao(index, no);

}

public static void excluirInicio(MetodosDupla met) {

    met.excluirInicio();
}

public static void excluirFinal(MetodosDupla met) {

    met.excluirFinal();
}

public static void excluirPorPosicao(MetodosDupla met, Scanner input) {

    System.out.println("Escolha a posição que deseja excluir:");
    int index = input.nextInt();
    met.excluirPorPosicao(index);
}

public static void imprimirLista(MetodosDupla met) {
    met.imprimirLista();
}
