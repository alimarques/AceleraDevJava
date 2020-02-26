import DAO.FuncionarioJpaDAO;
import Entity.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123456");
        funcionario.setMatricula(147);
        funcionario.setNome("Ali");

        FuncionarioJpaDAO.getInstance().merge(funcionario);
    }

}