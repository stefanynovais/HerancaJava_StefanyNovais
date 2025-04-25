public class Funcionario extends Pessoa {
   protected String nome;
   protected double salario;
   protected String departamento;

   // métodos construtores

   public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
      super(cpf, dataNascimento);
      this.nome = nome;
      this.salario = salario;
      this.departamento = departamento;
   }

   // métodos de funcionalidades

   public void mostrarDados() {
      System.out.println("\nNome: " + nome);
      System.out.println("Salário: " + salario);
      System.out.println("Departamento: " + departamento);
      System.out.println("CPF: " + cpf);
      System.out.println("Data de Nascimento: " + dataNascimento);
   }

   public void baterPonto() {
      System.out.print(nome + " bateu o ponto!\n");
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public double getSalario() {
      return salario;
   }

   public void setNome(double salario) {
      this.salario = salario;
   }

   public String getDepartamento() {
      return departamento;
   }

   public void setDepartamento(String departamento) {
      this.departamento = departamento;
   }

}