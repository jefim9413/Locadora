package Locadora;

public class Cliente extends Pessoa {
		private String endereco;
		private int idade;
		private String sexo;
		
		public Cliente(String endereco, int idade, String sexo, String nome, int matricula) {
			super(nome, matricula);
			this.endereco = endereco;
			this.idade = idade;
			this.sexo = sexo;
			
		}

	@Override
	public String toString() {
		return "Cliente{" +
				"endereco='" + endereco + '\'' +
				", idade=" + idade +
				", sexo='" + sexo + '\'' +
				", nome='" + nome + '\'' +
				", matricula=" + matricula +
				'}';
	}

	public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

}




