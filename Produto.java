public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome,double preco,Data dataValidade){
        this.nome=nome;
        this.preco=preco;
        this.dataValidade=dataValidade;
    }
     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null; // Valor padrão para compatibilidade
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade=dataValidade;
    }
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) return true;
        if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()) return true;
            if (dataValidade.getMes() == dataAtual.getMes()) {
                return dataValidade.getDia() < dataAtual.getDia();
            }
        }
        return false;
    }
    @Override
    public String toString() {
    return "Produto: " + nome +
           "\nPreço: R$" + preco +
           "\nValidade: " + (dataValidade != null ? dataValidade.toString() : "N/A");
}
    }
    
