public class Desenvolvedor extends Funcionario {

    // método construtor padrão
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }

    // método de funcionalidades

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.print("Cargo: Desenvolvedor\n");
    }

    public void programar() {
        System.out.print(nome + " está programando.\n");
    }
}
