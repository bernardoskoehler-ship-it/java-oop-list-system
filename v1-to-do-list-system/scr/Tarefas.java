public class Tarefas {
	private String nome;
	Tarefas(String nome) {
		this.nome = nome;
	}
	private void setNome(String nome) {
		if(nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}
	public String getNome() {
		return nome;
	}
}
