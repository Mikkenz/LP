package Pratica2;

public class Aluno {

    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data data;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, Data data) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.data = data;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println(getRa());
        System.out.println(getNome());
        System.out.println(getSexo());
        System.out.println(getRg());
        System.out.println(getCpf());
        System.out.println(data.formatarData());
    }

}
