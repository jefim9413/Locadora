package Repositorio;

import Locadora.*;
import Produto.*;

import java.util.ArrayList;

public class RepositorioPessoas {
	private ArrayList<Pessoa> pessoas = new ArrayList<>();

	public RepositorioPessoas() {
	}

	public void adicionar(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	public void remover(int matricula) {
		for(Pessoa i : pessoas) {
			if(i.matricula == matricula) {
				pessoas.remove(i);
			}
		}
	}
	public Pessoa buscar(int matricula) {
		for(Pessoa i : pessoas) {
			if(i.matricula == matricula) {
				return i;
			}
		}
		return null;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}