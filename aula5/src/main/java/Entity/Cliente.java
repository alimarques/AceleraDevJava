package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private int idcliente;

    @Column
    private String nome;


    public final int getIdcliente() {
        return idcliente;
    }

    public final void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public final String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

}
