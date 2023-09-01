package solucoes.exercicio2.swing;

public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdHora;
    private float salario;
    private float valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculo, float valorHora, float qtdHora, float valorDesconto) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.valorDesconto = valorDesconto;
    }

    public Funcionario(int cracha, String nome, char tipoVinculo, float salario, float valorDesconto) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
        this.valorDesconto = valorDesconto;
    }

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

    public float calcularValorReceber() {
        return this.salario - this.valorDesconto;
    }

}
