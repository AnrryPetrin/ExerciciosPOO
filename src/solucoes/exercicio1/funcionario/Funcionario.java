package solucoes.exercicio1.funcionario;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdHora;
    private float salario = 0;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(float qtdHora) {
        this.qtdHora = qtdHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularSalario() {
        return this.valorHora * this.qtdHora;
    }

    private float calcularValorReceber() {
        return this.salario - this.valorDesconto;
    }

    public String imprimir() {
        return "Crachá: " + this.cracha
                + "\nNome: " + this.nome
                + "\nTipo vínculo: " + this.tipoVinculo
                + "\nSalário: " + this.salario
                + "\nDesconto: " + this.valorDesconto
                + "\nValor a receber: " + calcularValorReceber();
    }
}
