public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Usando data padrão 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) return false;

        int[] diasPorMes = {31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasPorMes[mes - 1];
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

}
