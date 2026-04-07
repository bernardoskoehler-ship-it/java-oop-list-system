public static void main(String[] args) {
    Estoque e = new Estoque();

    e.adicionarProduto("Tomate", 2);
    e.adicionarProduto("Tomate", 2);
    e.adicionarProduto("Batata", 2);

    e.removerProduto("Tomate", 1);
    e.removerProduto("Batata", 3);

    e.listarProdutos();
}
