
package solucoes.exercicio3.vendedor;


public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor() {
        
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * this.percentualComissao / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return this.calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir() {
        String imprimir = "Código: " + this.codigo
                + "\nNome: " + this.nome
                + "\n%Comissão: " + this.percentualComissao;
        
        return imprimir;
    }
    
    public String imprimir(double valorVenda, double desconto) {
        String imprimir = "Código: " + this.codigo
                + "\nNome: " + this.nome
                + "\nValor da Venda: " + valorVenda
                + "\n%Comissão: " + this.percentualComissao
                + "\nDesconto: " + desconto
                + "\nValor a pagar: " + this.calcularPagamentoComissao(valorVenda, desconto);
        
        return imprimir;
    }
    
    public String imprimir(double valorVenda) {
        String imprimir = "Código: " + this.codigo
                + "\nNome: " + this.nome
                + "\nValor da Venda: " + valorVenda
                + "\n%Comissão: " + this.percentualComissao
                + "\nValor a pagar: " + this.calcularPagamentoComissao(valorVenda);
        
        return imprimir;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
