import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList <Tarefas> tarefas = new ArrayList<>();
		tarefas.add(new Tarefas("Beber agua"));
		tarefas.add(new Tarefas("Beber cocacola"));
		tarefas.add(new Tarefas("Beber fanta"));
		tarefas.remove(1);
		
		
		for(Tarefas t : tarefas) {
			System.out.println(t.getNome());
		}
		
	}
}
