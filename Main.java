import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do{
            System.out.println("\nOlá! Seja bem-vindo ao Sistema Funcionários da Empresa.\n");
            System.out.println("1. Cadastrar novo funcionário.");
            System.out.println("2. Exibir todos os funcionários.");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome: ");
                    String nome = teclado.nextLine();

                    System.out.print("CPF: ");
                    String cpf = teclado.nextLine();

                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    String dataNascimento = teclado.nextLine();

                    System.out.print("Salário: ");
                    double salario = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.print("Departamento: ");
                    String departamento = teclado.nextLine();

                    System.out.print("\nEscolha um tipo de funcionário: ");
                    System.out.println("\n1. Gerente");
                    System.out.println("2. Desenvolvedor");
                    System.out.println("3. Estagiário");
                    int tipo = teclado.nextInt();
                    

                    Funcionario novoFuncionario = null;

                    switch (tipo) {
                        case 1:
                            novoFuncionario = new Gerente(nome, salario, departamento, cpf, dataNascimento);
                            break;

                            case 2:
                            novoFuncionario = new Desenvolvedor(nome, salario, departamento, cpf, dataNascimento);
                            break;

                            case 3:
                            novoFuncionario = new Estagiario(nome, salario, departamento, cpf, dataNascimento);
                            break;
                    
                        default:
                           System.out.println("\nEste tipo de funcionário é inválido.");
                            continue;
                    }
                    
                    funcionarios.add(novoFuncionario);
                    System.out.println("\nFuncionário cadastrado com sucesso!");
                    break;
                
                case 2:
                    if (funcionarios.isEmpty()){
                        System.out.println("\nNenhum funcionário foi casdastrado até o momento.");
                    } else{
                        System.out.println("\nFUNCIONÁRIOS CADASTRADOS\n");
                        System.out.println("------------------------------");
                        for (Funcionario f : funcionarios){
                            f.mostrarDados();
                            f.baterPonto();
                            if ( f instanceof Gerente){
                                ((Gerente) f).realizarReunião();
                            } else if (f instanceof Desenvolvedor){
                                ((Desenvolvedor) f).programar();
                            } else if (f instanceof Estagiario){
                                ((Estagiario) f).fazerTarefa();
                            }
                            System.out.println("------------------------------");
                        }
                    }
                    break;

                    case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                System.out.println("Opção Inválida.");
                    break;
            }


        } while (opcao != 3);
    }
}
