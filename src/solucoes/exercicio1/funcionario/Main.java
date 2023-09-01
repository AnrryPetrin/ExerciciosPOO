package solucoes.exercicio1.funcionario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int cracha;
        String nome;
        String tipoVinculo = null;
        float valorHora = 0;
        float qtdHora = 0;
        float salario = 0;
        float valorDesconto;

        Funcionario funcionario = null;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastrar funcionário
                    2 - Mostrar folha de pagamento
                    3 - Alterar remuneração
                    4 - Sair"""));

            switch (opcao) {
                case 1 -> {
                    funcionario = new Funcionario();
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Cracha: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    tipoVinculo = JOptionPane.showInputDialog("""
                            Vínculo:
                            H - Horista
                            N - normal""");

                    if (tipoVinculo.equalsIgnoreCase("H")) {
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor hora: "));
                        qtdHora = Float.parseFloat(JOptionPane.showInputDialog("Horas trabalhadas: "));
                    } else if (tipoVinculo.equalsIgnoreCase("N")) {
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                    }
                    valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Desconto: "));

                    funcionario.setCracha(cracha);
                    funcionario.setNome(nome);
                    funcionario.setTipoVinculo(tipoVinculo.toUpperCase().charAt(0));
                    funcionario.setValorHora(valorHora);
                    funcionario.setQtdHora(qtdHora);
                    funcionario.setSalario(salario);
                    funcionario.setValorDesconto(valorDesconto);
                }
                case 2 -> {
                    if (funcionario != null) {
                        if (tipoVinculo.equalsIgnoreCase("H")) {
                            funcionario.setSalario(funcionario.calcularSalario());
                        }
                        JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há nenhum funcionáro cadastrado");
                    }


                }
                case 3 -> {
                    if (tipoVinculo != null) {
                        if (tipoVinculo.equalsIgnoreCase("H")) {
                            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor hora: "));
                            funcionario.setValorHora(valorHora);
                            qtdHora = Float.parseFloat(JOptionPane.showInputDialog("Horas trabalhadas: "));
                            funcionario.setQtdHora(qtdHora);
                        } else if (tipoVinculo.equalsIgnoreCase("N")) {
                            salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                            funcionario.setSalario(salario);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há nenhum funcionáro cadastrado");
                    }
                }
                case 4 -> JOptionPane.showMessageDialog(null, "Saindo...");

                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 4);
        System.exit(0);
    }

}
