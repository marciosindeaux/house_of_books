package br.com.sindeaux.houseofbooks.repository;

import br.com.sindeaux.houseofbooks.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository< Usuario,Long> {

    List<Usuario> findAll();

    Optional<Usuario> findByEmal(String email);
}
