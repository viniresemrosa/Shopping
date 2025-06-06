public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double qtdMaxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)qtdMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                    Endereco endereco, Data dataFundacao, double qtdMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)qtdMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;                
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}
