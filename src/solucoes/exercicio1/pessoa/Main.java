package solucoes.exercicio1.pessoa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String cpf;
        String nome;
        String sexo;
        int idade;
        int opcao;

        Pessoa pessoa = null;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastrar pessoa
                    2 - Visualizar pessoa
                    3 - Sair"""));

            switch (opcao) {
                case 1 -> {
                    pessoa = new Pessoa();

                    cpf = JOptionPane.showInputDialog("CPF: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    sexo = JOptionPane.showInputDialog("""
                            Sexo:
                            F - Feminino
                            M - Masculino""");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

                    pessoa.setCpf(cpf);
                    pessoa.setNome(nome);
                    pessoa.setSexo(sexo.toUpperCase().charAt(0));
                    pessoa.setIdade(idade);
                }
                case 2 -> {
                    if (pessoa == null) {
                        JOptionPane.showMessageDialog(null, "Não há nenhuma pessoa cadastrada");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, pessoa.imprimir());
                }
                case 3 -> JOptionPane.showMessageDialog(null, "Saindo");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 3);
        System.exit(0);
    }
}
