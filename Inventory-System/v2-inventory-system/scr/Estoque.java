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
    private String ajustarNome(String nome) {
        return nome.trim().toLowerCase();
    }

    public void adicionarProduto(String nome, int quantidade) {
        if (!nomeValido(nome)) {
            System.out.println("nome inserido invalido");
            return;
        }

        if (!valorValido(quantidade)) {
            System.out.println("quantidade inserida invalida");
            return;
        }
        nome = ajustarNome(nome);
        Produto produto = lista.get(nome);

        if (produto != null) {
            produto.adicionarQuantidade(quantidade);
            return;
        }

        produto = new Produto(nome);
        produto.adicionarQuantidade(quantidade);
        lista.put(nome, produto);
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
        nome = ajustarNome(nome);
        Produto produto = lista.get(nome);
        if (produto == null) {
            System.out.println(nome + " indisponivel");
            return;
        }
        if (produto.getQuantidade() < quantidade) {
            System.out.println("Nao tem estoque o suficiente para remover");
            return;
        }
        produto.removerQuantidade(quantidade);
        if (produto.getQuantidade() <= 0) {
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
