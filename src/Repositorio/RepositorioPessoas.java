package Locadora;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

public class RepositorioPessoas {
	private ArrayList<Pessoa> pessoas;

	public RepositorioPessoas() {
		pessoas = new ArrayList<>();
	}

	public void adicionar(Pessoa pessoa) {
		pessoas.add(pessoa);
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