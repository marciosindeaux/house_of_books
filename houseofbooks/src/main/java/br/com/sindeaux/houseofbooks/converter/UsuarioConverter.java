package br.com.sindeaux.houseofbooks.converter;

import br.com.sindeaux.houseofbooks.dtos.UsuarioDTO;
import br.com.sindeaux.houseofbooks.entity.Usuario;

public class UsuarioConverter {

    public static Usuario convertUsuarioDTOToUsuario(UsuarioDTO usuarioDTO){
        Usuario payload = new Usuario();

        payload.setSenha(usuarioDTO.getSenha());
        payload.setNome(usuarioDTO.getNome());
        payload.setEmal(usuarioDTO.getEmal());

        return payload;
    }
}
