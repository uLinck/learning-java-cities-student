import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFun4Study {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Cidade> cidades = new ArrayList<Cidade>();
        List<Estudante> estudantes = new ArrayList<Estudante>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite os dados da cidade " + (i + 1) + ":");
            System.out.print("Código: ");
            var codigo = scan.nextInt();
            scan.nextLine();
            System.out.print("Descrição: ");
            var descricao = scan.nextLine();
            System.out.print("UF: ");
            var uf = scan.nextLine();

            cidades.add(new Cidade(codigo, descricao, uf));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite os dados do estudante " + (i + 1) + "");
            System.out.print("Código: ");
            var codigo = scan.nextInt();
            scan.nextLine();
            System.out.print("Nome: ");
            var nome = scan.nextLine();
            System.out.print("Data de nascimento: ");
            var dataNascimento = scan.nextLine();
            System.out.print("E-mail: ");
            var email = scan.nextLine();
            System.out.print("Senha: ");
            var senha = scan.nextLine();
            System.out.print("Digite o código da cidade desejada: ");
            var codigoCidade = scan.nextInt();

            for (var cidade : cidades) {
                if (cidade.getCodigo() == codigoCidade) {
                    estudantes.add(new Estudante(codigo, nome, dataNascimento, email, senha, cidade));
                }
            }
        }

        var repete = true;
        while (repete) {
            System.out.println("\nO que deseja fazer?");
            System.out.println(
                    " 1 - Exibir dados das cidades; \n " +
                            "2 - Exibir dados dos estudantes; \n " +
                            "3 - Atualizar senha; \n " +
                            "4 - Sair; ");
            
            var escolha = scan.nextInt();
            scan.nextLine();
            switch(escolha) {
                case 1:
                    for(var cidade : cidades) {
                        System.out.print("\nCidade " + cidade.getUf() + "\n" + cidade.exibeDados() + "\n");
                    }
                    break;
                case 2:
                    for(var estudante : estudantes) {
                        System.out.print("\nEstudante " + estudante.getNome() + "\n" + estudante.exibeDados() + "\n");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o código do estudante: ");
                    var codigoEstudante = scan.nextInt();
                    scan.nextLine();

                    for (var estudante : estudantes) {
                        if(estudante.getCodigo() == codigoEstudante) {
                            if(atualizarSenha(estudante)) {
                                System.out.println("Houve um erro ao alterar sua senha!");
                            }
                        }
                    }
                    break;
                case 4:
                    repete = false;
                    break;
                default:
                    System.out.print("Tente novamente!");
            }
        }
    }

     private static boolean atualizarSenha(Estudante estudante) {
        System.out.print("Senha antiga: ");
        var senhaAntiga = scan.nextLine();
        if (senhaAntiga.equals(estudante.getSenha())) {
            System.out.print("Digite a senha nova: ");
            var senhaNova = scan.nextLine();
            System.out.print("Digite a senha nova novamente: ");
            var senhaNova2 = scan.nextLine();

            if(senhaNova.equals(senhaNova2)) {
                estudante.setSenha(senhaNova);
                System.out.println("Senha alterada com sucesso!");
                return false;
            }
        }
        return true;
    }
}
