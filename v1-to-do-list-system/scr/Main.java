import java.util.ArrayList;

public class main {
	static ArrayList <Tarefas> tarefas = new ArrayList<>();
	
	public static void main(String[] args) {
		adicionarTarefa("Beber agua");
		adicionarTarefa("Tomar Banho");
		adicionarTarefa("ir as Compras");
		removerTarefa(1);
		
		listarTarefas();
		
	}
		
	public static void adicionarTarefa(String nome) {
		tarefas.add(new Tarefas(nome));
	}
	public static void removerTarefa(int posicao) {
		if(posicao < tarefas.size() && posicao >= 0) {
		tarefas.remove(posicao);
		}
	}
	public static void listarTarefas() {
		int posicao = 0;
		for(Tarefas t : tarefas) {
			System.out.println(posicao +" - " +t.getNome());
			posicao ++;

		}
	}
}
