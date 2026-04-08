import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> lista = new HashMap<>();

    public boolean valorValido(int valor) {
        return valor > 0;
    }
    private boolean nomeValido(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public void adicionarProduto(String nome, int quantidade) {
        if(!nomeValido(nome)) {
            System.out.println("nome inserido invalido");
            return;
        }
        if(!valorValido(quantidade)) {
            System.out.println("quantidade inserida invalida");
            return;
        }
        if(lista.containsKey(nome)) {
                lista.get(nome).adicionarQuantidade(quantidade);
                return;
        }
        lista.put(nome, new Produto(nome));
        lista.get(nome).adicionarQuantidade(quantidade);
    }

    public void removerProduto(String nome, int quantidade) {
        if (!nomeValido(nome)) {
            System.out.println("nome inserido invalido");
            return;
        }
        if (!valorValido(quantidade)) {
            System.out.println("quantidade inserida invalida");
            return;
        }
        if(!lista.containsKey(nome)) {
            System.out.println(nome +" indisponivel");
            return;
        }
        if(lista.get(nome).getQuantidade() > quantidade) {
            System.out.println("Nao tem estoque o suficiente para remover");
            return;
        }
        lista.get(nome).removerQuantidade(quantidade);
        if(lista.get(nome).getQuantidade() <= 0) {
            lista.remove(nome);
        }
    }

   public void listarProdutos() {
        for (Map.Entry<String, Produto> entry : lista.entrySet()) {
            Produto produto = entry.getValue();
            System.out.println(produto.getQuantidade() + "x " + entry.getKey());
        }
    }
}
