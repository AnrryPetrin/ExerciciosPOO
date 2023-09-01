package solucoes.exercicio1.aluno;

public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    private float calcularMedia() {
        return (float) (this.ac1 * 0.15 + this.ac2 * 0.30 + this.ag * 0.10 + this.af * 0.45);
    }

    private String verificarAprovacao() {
        if (calcularMedia() >= 5) return "Aprovado";
        else return "Reprovado";
    }

    public String imprimir() {
        return "RA: " + this.ra
                + "\nNome: " + this.nome
                + "\nAC1: " + this.ac1
                + "\nAC2: " + this.ac2
                + "\nAG: " + this.ag
                + "\nAF: " + this.af
                + "\nSituação: " + verificarAprovacao();
    }
}
