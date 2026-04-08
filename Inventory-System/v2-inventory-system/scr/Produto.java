public class Produto {
    private String nome;
    private int quantidade;

    Produto(String nome) {
        setNome(nome);
    }
    private void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}
