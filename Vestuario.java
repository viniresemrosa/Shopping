public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double qtdMaxProdutos, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)qtdMaxProdutos);
        this.produtosImportados = produtosImportados;
    }
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                    Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, (int)salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, boolean produtosImportados,double qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)qtdMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}
