package solucoes.exercicio1.aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String ra, nome;
        float ac1, ac2, ag, af;
        int opcao;

        Aluno aluno = null;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastrar aluno
                    2 - Visualizar aluno
                    3 - Sair"""));

            switch (opcao) {
                case 1 -> {
                    aluno = new Aluno();

                    ra = JOptionPane.showInputDialog("RA: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog("AC1: "));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog("AC2: "));
                    ag = Float.parseFloat(JOptionPane.showInputDialog("AG: "));
                    af = Float.parseFloat(JOptionPane.showInputDialog("AF: "));

                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                }
                case 2 -> {
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Não há alunos cadastrados");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, aluno.imprimir());
                }
                case 3 -> JOptionPane.showMessageDialog(null, "Saindo");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 3);
    }
}
