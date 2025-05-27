public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeMaximaLojas];
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Loja[] getLojas() { return lojas; }
    public void setLojas(Loja[] lojas) { this.lojas = lojas; }

    @Override
    public String toString() {
        String info = "Shopping: " + nome + "\nEndereço: " + endereco + "\nLojas:\n";
        for (Loja l : lojas) {
            if (l != null)
                info += l.toString() + "\n";
        }
        return info;
    }

    public boolean insereLoja(Loja nova) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = nova;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipo.toLowerCase()) {
                    case "cosmetico":
                        if (loja instanceof Cosmetico) contador++;
                        break;
                    case "vestuario":
                        if (loja instanceof Vestuario) contador++;
                        break;
                    case "bijuteria":
                        if (loja instanceof Bijuteria) contador++;
                        break;
                    case "alimentacao":
                        if (loja instanceof Alimentacao) contador++;
                        break;
                    case "informatica":
                        if (loja instanceof Informatica) contador++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return contador;
    }

public Informatica lojaSeguroMaisCaro() {
    Informatica maisCara = null;
    double maiorSeguro = -1;
    for (Loja loja : lojas) {
        if (loja instanceof Informatica) {
            Informatica info = (Informatica) loja;
            double seguro = info.getSeguroEletronicos();
            if (seguro > maiorSeguro) {
                maiorSeguro = seguro;
                maisCara = info;
            }
        }
    }
    return maisCara;
}
}
