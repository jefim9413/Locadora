import Produto.*;
import Locadora.*;
import Repositorio.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Produto>produtos = new ArrayList<>();
        ArrayList<Locacao> locacaos = new ArrayList<>();
        ArrayList<Gerente> geretes = new ArrayList<>();
        ArrayList<Operador_de_sistema> operadores = new ArrayList<>();



        repositorioLocacao repLocacoes = new repositorioLocacao();
        RepositorioProdutos repProdutos = new RepositorioProdutos();
        RepositorioPessoas repPessoas = new RepositorioPessoas();

        //Gerente gerente = new Gerente("Jonas", 123, "aps", "123");
        //repPessoas.adicionar(gerente);

        String login;
        String senha;

        do {
            System.out.println("Bem Vindo Escolha Um Perfil a Baixo");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao) {
                case 1:
                    System.out.print("Login: ");
                    login = input.nextLine();
                    System.out.print("Senha: ");
                    senha = input.nextLine();
                    for(Pessoa i : repPessoas.getPessoas()) {
                        if(i instanceof Gerente) {
                            if((((Gerente) i).getLogin().equals(login)) && (((Gerente) i).getSenha().equals(senha))) {
                                System.out.println("Encontrado");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Login: ");
                    login = input.nextLine();
                    System.out.print("Senha: ");
                    senha = input.nextLine();
                    for(Pessoa i : repPessoas.getPessoas()) {
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
