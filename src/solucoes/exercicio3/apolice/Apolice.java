package solucoes.exercicio3.apolice;

public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {

    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (this.sexo == 'M' && this.idade <= 25) {
            return this.valorAutomovel * 10 / 100;
            
        } else if (this.sexo == 'M' && this.idade > 25) {
            return this.valorAutomovel * 5 / 100;

        } else if (this.sexo == 'F') {
            return this.valorAutomovel * 2 / 100;

        } else {
            return Double.NaN;
        }
    }

    public String imprimir() {
        String imprimir = "Número: " + this.getNumero()
                + "\nNome: " + this.getNome()
                + "\nIdade: " + this.getIdade()
                + "\nSexo: " + this.getSexo()
                + "\nValor do Automóvel: " + this.getValorAutomovel()
                + "\nValor do Apólice: " + this.calcularValor();

        return imprimir;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
