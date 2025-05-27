public class Bijuteria extends Loja {
    private double metaVendas;

public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                 Endereco endereco, Data dataFundacao, double qtdMaxProdutos, double metaLucro) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)qtdMaxProdutos);
    this.metaVendas = metaVendas;
}
public Bijuteria(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario,Endereco endereco,
                Data dataFundacao, double metaLucro){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, (int)metaLucro);
    this.metaVendas = metaVendas;
}

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas: R$" + metaVendas;
    }
}
