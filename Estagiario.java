public class Estagiario extends Funcionario {
    // método construtor padrão
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }

    // método de funcionalidades

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.print("Cargo: Estagiário\n");
    }

    public void fazerTarefa() {
        System.out.print(nome + " está fazendo uma tarefa.\n");
    }
}
