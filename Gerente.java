public class Gerente extends Funcionario {

    // método construtor padrão

    public Gerente(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }

    // método de funcionalidades

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.print("Cargo: Gerente\n");
    }

    public void realizarReunião() {
        System.out.print(nome + " está realizando uma reunião.\n");
    }
}
