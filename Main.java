package trabalho2;

import java.util.Scanner;

/**
 * Cria um menu para gestão de uma <code>Biblioteca</code>.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        short op;

        //menu
        do {
            System.out.println("1 - Consultar item\t\t6 - Listar itens");
            System.out.println("2 - Cadastrar item\t\t7 - Listar usuários");
            System.out.println("3 - Emprestar item\t\t8 - Empréstimos do usuário");
            System.out.println("4 - Devolver item");
            System.out.println("5 - Cadastrar usuário\t\t0 - Encerrar");

            op = sc.nextShort();
            System.out.println(); //pula uma linha
            switch (op) {
                case 1:
                    bib.consultaItem();
                    break;
                case 2:
                    bib.cadastroItem();
                    break;
                case 3:
                    bib.emprestarItem();
                    break;
                case 4:
                    bib.devolverItem();
                    break;
                case 5:
                    bib.cadastroUsuario();
                    break;
                case 6:
                    System.out.println("Itens ----------------------------------------");
                    bib.listarItems();
                    break;
                case 7:
                    System.out.println("Usuários ---------------------------------------");
                    bib.listarUsuarios();
                    break;
                case 8:
                    bib.emprestimosUsuario();
                case 0:
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
