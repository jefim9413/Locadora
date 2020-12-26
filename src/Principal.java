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
                                        break;
                                    case 2:
                                        int aux = 0;
                                        String codigo, titulo, genero;
                                        boolean locado;
                                        int anoLancamento, duracao;
                                        do {
                                            System.out.println("Qual Produto Deseja Adicionar");
                                            System.out.println("1 - Bluray");
                                            System.out.println("2 - Cd");
                                            System.out.println("3 - DVD");
                                            System.out.println("4 - VHS");
                                            System.out.println("5 - Sair");
                                            aux = Integer.parseInt(ler.nextLine());
                                            
                                            switch (aux) {
                                                case 1:
                                                    ArrayList<String>  idiomas = new ArrayList<>();
                                                    idiomas.add("Portugues");
                                                    idiomas.add("ingles");
                                                    System.out.println("Codigo: ");
                                                    codigo = ler.nextLine();
                                                    System.out.println("Titulo: ");
                                                    titulo = ler.nextLine();
                                                    System.out.println("Genero: ");
                                                    genero = ler.nextLine();
                                                    locado = false;
                                                    System.out.println("Ano De Lançamento: ");
                                                    anoLancamento = Integer.parseInt(ler.nextLine());
                                                    System.out.println("Duração: ");
                                                    duracao = Integer.parseInt(ler.nextLine());
                                                    Bluray novo = new Bluray(codigo,titulo,genero,locado,anoLancamento,duracao,idiomas);
                                                    ((Gerente) i).AddProduto(novo);
                                                    break;
                                                case 2:
                                                    System.out.println("Codigo: ");
                                                    codigo = ler.nextLine();
                                                    System.out.println("Titulo: ");
                                                    titulo = ler.nextLine();
                                                    System.out.println("Genero: ");
                                                    genero = ler.nextLine();
                                                    locado = false;
                                                    System.out.println("Autor: ");
                                                    String autor = ler.nextLine();
                                                    System.out.println("Numero de faixas: ");
                                                    int numfaix = Integer.parseInt(ler.nextLine());
                                                    Cd cd = new Cd(codigo,titulo,genero,locado,autor,numfaix,false,false);
                                                    ((Gerente) i).AddProduto(cd);
                                                    break;
                                                case 3:
                                                    System.out.println("Codigo: ");
                                                    codigo = ler.nextLine();
                                                    System.out.println("Titulo: ");
                                                    titulo = ler.nextLine();
                                                    System.out.println("Genero: ");
                                                    genero = ler.nextLine();
                                                    locado = false;
                                                    System.out.println("Ano De Lançamento: ");
                                                    anoLancamento = Integer.parseInt(ler.nextLine());
                                                    System.out.println("Duração: ");
                                                    duracao = Integer.parseInt(ler.nextLine());
                                                    Dvd dvd = new Dvd(codigo,titulo,genero,locado,anoLancamento,duracao,false);
                                                    ((Gerente) i).AddProduto(dvd);
                                                    break;
                                                case 4:
                                                    System.out.println("Codigo: ");
                                                    codigo = ler.nextLine();
                                                    System.out.println("Titulo: ");
                                                    titulo = ler.nextLine();
                                                    System.out.println("Genero: ");
                                                    genero = ler.nextLine();
                                                    locado = false;
                                                    System.out.println("Ano De Lançamento: ");
                                                    anoLancamento = Integer.parseInt(ler.nextLine());
                                                    System.out.println("Duração: ");
                                                    duracao = Integer.parseInt(ler.nextLine());
                                                    Vhs vhs = new Vhs(codigo,titulo,genero,locado,anoLancamento,duracao,true);
                                                    ((Gerente) i).AddProduto(vhs);
                                                    break;
                                                case 5:
                                                    System.out.println("Cadastro de Produtos Encerrado");
                                                    break;
                                                default:
                                                    System.out.println("Opção Invalida");
                                                    break;
                                            }
                                        }while (aux != 5);
                                        break;
                                    case 3:
                                        System.out.println("Nome: ");
                                        nome = ler.nextLine();
                                        System.out.println("Matricula: ");
                                        matricula =  duracao = Integer.parseInt(ler.nextLine());
                                        System.out.println("Login: ");
                                        login = ler.nextLine();
                                        System.out.println("Senha: ");
                                        senha = ler.nextLine();
                                        ((Gerente) i).AddOperador(nome,matricula,login,senha);

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
