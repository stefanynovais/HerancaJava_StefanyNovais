public class Pessoa {
    protected String cpf;
    protected String dataNascimento;

    // método construtor
    public Pessoa(String cpf, String dataNascimento) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // métodos de funcionalidades
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
