package com.codenation.aula6.usuario.repository;

import com.codenation.aula6.usuario.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
