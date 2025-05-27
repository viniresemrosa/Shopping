public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

// Construtor (String, int, Endereco, Data)
public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1; // valor default
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[50]; // tamanho padrão
}

// Construtor (String, int, int, Endereco, Data)
public Loja(String nome, int quantidadeFuncionarios, double qtdMaxProdutos, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1; // valor default
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[(int)qtdMaxProdutos];
}
public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdMaxProdutos) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1; // valor default
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[qtdMaxProdutos];
}
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, double qtdMaxProdutos) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[(int)qtdMaxProdutos];
}
public Loja(String nome, int quantidadeFuncionarios) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1; // valor default
    this.estoqueProdutos = new Produto[50];
}
public Loja(String nome, int quantidadeFuncionarios, double qtdMaxProdutos) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = null;
    this.dataFundacao = null;
    this.estoqueProdutos = new Produto[(int)qtdMaxProdutos];
}

    public String getNome(){
        return nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios=quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao=dataFundacao;
    }

    public double gastosComSalario(){
        return (salarioBaseFuncionario*quantidadeFuncionarios);
    }
    public char tamanhoDaLoja(){
       if (quantidadeFuncionarios < 10) return 'P';
        if (quantidadeFuncionarios <= 30) return 'M';
        return 'G';
    }
    public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
}

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
}
    @Override
public String toString() {
    String info = "Loja: " + nome + "\nFuncionários: " + quantidadeFuncionarios +
                  "\nSalário base: " + salarioBaseFuncionario +
                  "\nEndereço: " + (endereco != null ? endereco.toString() : "N/A") +
                  "\nData fundação: " + (dataFundacao != null ? dataFundacao.toString() : "N/A") +
                  "\nProdutos:\n";
    for (Produto p : estoqueProdutos) {
        if (p != null)
            info += p.toString() + "\n";
    }
    return info;
}
public void imprimeProdutos() {
    for (Produto p : estoqueProdutos) {
        if (p != null) {
            System.out.println(p);
        }
    }
}
public boolean insereProduto(Produto novo) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == null) {
            estoqueProdutos[i] = novo;
            return true;
        }
    }
    return false; // estoque cheio
}
public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true;
        }
    }
    return false; // produto não encontrado
}
}