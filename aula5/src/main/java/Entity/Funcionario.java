package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    private int matricula;

    @Column
    @NotNull
    private String nome;

    @Column
    private String cpf;


    public final int getMatricula() {
        return matricula;
    }

    public final void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public final String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
