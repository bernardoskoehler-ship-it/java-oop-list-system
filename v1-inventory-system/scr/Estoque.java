import java.util.ArrayList;

public class Estoque {
    private ArrayList <Produto> lista = new ArrayList<>();

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
        for(Produto p : lista) {
            if(nome.equals(p.getNome())) {
                p.adicionarQuantidade(quantidade);
                return;
            }
        }
        Produto novoProduto = new Produto(nome);
        novoProduto.adicionarQuantidade(quantidade);
        lista.add(novoProduto);
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
        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);

            if (!nome.equals(p.getNome())) {
                continue;
            }
            if (quantidade > p.getQuantidade()) {
                System.out.println("Nao possui produto o suficiente para remover");
                return;
            }
            p.removerQuantidade(quantidade);
            if (p.getQuantidade() == 0) {
                lista.remove(i);
            }
            return;
        }
        System.out.println(nome + " indisponivel");
    }

    public void listarProdutos() {
        for(Produto p : lista) {
            System.out.println(p.getNome() +" x" +p.getQuantidade());
        }
    }
}
