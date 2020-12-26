import Produto.*;
import Locadora.*;
import Repositorio.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        String endereco,nome,sexo;
        int idade,matricula;

        repositorioLocacao locacoes = new repositorioLocacao();
        RepositorioProdutos produtos = new RepositorioProdutos();
        RepositorioPessoas pessoas = new RepositorioPessoas();

        Gerente gerente = new Gerente("Jonas", 123, "aps", "123",produtos,pessoas);
        pessoas.adicionar(gerente);

        String login;
        String senha;


        do {
            System.out.println("Bem Vindo Escolha Um Perfil a Baixo");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(ler.nextLine());
            switch(opcao) {
                case 1:
                    System.out.print("Login: ");
                    login = ler.nextLine();
                    System.out.print("Senha: ");
                    senha = ler.nextLine();
                    for(Pessoa i : pessoas.getPessoas()) {
                        if(i instanceof Gerente) {
                            if((((Gerente) i).getLogin().equals(login)) && (((Gerente) i).getSenha().equals(senha))) {
                                System.out.println("Encontrado");
                                int op;
                                System.out.println("Bem Vindo Escolha Gerente");
                                System.out.println("1 - Adicionar Cliente ");
                                System.out.println("2 - Adicionar Produto ");
                                System.out.println("3 - Adicionar Operador ");
                                System.out.println("4 - Listar Clientes");
                                System.out.println("5 - Listar Produtos");
                                System.out.println("6 - Listar Operador");
                                System.out.println("7 - Sair ");
                                System.out.print("Opção: ");
                                op = Integer.parseInt(ler.nextLine());

                                switch (op){
                                    case 1:
                                        System.out.println("Digite o Endereço: ");
                                        endereco = ler.nextLine();
                                        System.out.println("Idade: ");
                                        idade = Integer.parseInt(ler.nextLine());
                                        System.out.println("Sexo: ");
                                        sexo = ler.nextLine();
                                        System.out.println("Nome: ");
                                        nome = ler.nextLine();
                                        System.out.println("Matricular: ");
                                        matricula = Integer.parseInt(ler.nextLine());
                                        ((Gerente) i).AddCliente(endereco,idade,sexo,nome,matricula);
                                    case 2:
                                        int aux = 0;
                                        do {
                                            System.out.println("Qual Produto Deseja Adicionar");
                                            System.out.println("1 - Bluray");
                                            System.out.println("2 - Cd");
                                            System.out.println("3 - DVD");
                                            System.out.println("4 - VHS");
                                            aux = Integer.parseInt(ler.nextLine());

                                        }while (aux !=5);


                                        break;
                                    default:
                                        System.out.println("Opção inválida !!");
                                        break;

                                }












                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Login: ");
                    login = ler.nextLine();
                    System.out.print("Senha: ");
                    senha = ler.nextLine();
                    for(Pessoa i : pessoas.getPessoas()) {
                        if(i instanceof Operador_de_sistema) {
                            if((((Operador_de_sistema) i).getLogin().equals(login)) && (((Operador_de_sistema) i).getSenha().equals(senha))) {

                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa Incerrado");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao != 3);
    }
}
