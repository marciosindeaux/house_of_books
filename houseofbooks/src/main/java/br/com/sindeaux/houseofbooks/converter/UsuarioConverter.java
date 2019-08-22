package br.com.sindeaux.houseofbooks.converter;

import br.com.sindeaux.houseofbooks.dtos.UsuarioDTO;
import br.com.sindeaux.houseofbooks.entity.Usuario;

public class UsuarioConverter {

    public static Usuario convertUsuarioDTOToUsuario(UsuarioDTO usuarioDTO){
        Usuario payload = new Usuario();

        payload.setSenha(usuarioDTO.getSenha());
        payload.setNome(usuarioDTO.getNome());
        payload.setEmail(usuarioDTO.getEmail());

        return payload;
    }

    public static UsuarioDTO convertUsuarioToUsuarioDTO(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setNome(usuario.getNome());
        usuarioDTO.setId(usuario.getId());
        return usuarioDTO;
    }
}
