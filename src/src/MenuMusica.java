import java.util.Scanner;

public class MenuMusica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        System.out.println("SISTEMA DE MÚSICA UNIFAJ: \n");

        do {
            System.out.println("1 -- INCLUIR");
            System.out.println("2 -- LISTAR");
            System.out.println("3 -- ALTERAR");
            System.out.println("4 -- EXCLUIR");
            System.out.println("5 -- SAIR\n");

            System.out.print("Selecione a opção: ");
            opcao = sc.next().charAt(0);
            sc.nextLine();

            if (opcao < '1' || opcao > '5') {
                System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        } while (opcao < '1' || opcao > '5');

        while (opcao != '5') {
            switch (opcao) {
                case '1':
                    Incluir(sc);
                    break;
                case '2':
                    System.out.println("Opção 'Listar' selecionada");
                    break;
                case '3':
                    System.out.println("Opção 'Alterar' selecionada");
                    break;
                case '4':
                    System.out.println("Opção 'Excluir' selecionada");
                    break;
                case '5':
                    System.out.println("Opção 'Sair' selecionada");
                    break;
            }

            System.out.println("Selecione outra opção do menu:");
            System.out.println("\n 1:incluir\n 2:LISTAR\n 3:ALTERAR\n 4:EXCLUIR\n 5:SAIR\n:");
            opcao = sc.next().charAt(0);
            sc.nextLine();
        }

        System.out.println("Opção 'Sair' selecionada. Encerrando o programa...");
        sc.close();
    }

    private static void Incluir(Scanner sc) {
        System.out.println("INCLUIR NOVA MÚSICA:");
        System.out.println();

        System.out.println("Titulo da música: ");
        String titulo = sc.nextLine();

        System.out.println("Nome do Artista: ");
        String artista = sc.nextLine();

        System.out.println("Duração da música: ");
        float duracao = sc.nextFloat(); sc.nextLine();

        System.out.println("Gênero da música: ");
        String generoMusica = sc.nextLine();

        Musica m = new Musica(titulo, artista, duracao, generoMusica);

        System.out.print("\nMúsica criada e salva!\n");

        System.out.println("\n🎵 Música cadastrada com sucesso!");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Gênero: " + generoMusica+ ".\n\n");

    }

}
