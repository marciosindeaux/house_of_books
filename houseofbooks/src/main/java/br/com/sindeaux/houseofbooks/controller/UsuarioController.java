package br.com.sindeaux.houseofbooks.controller;

import br.com.sindeaux.houseofbooks.converter.UsuarioConverter;
import br.com.sindeaux.houseofbooks.dtos.ResponseDTO;
import br.com.sindeaux.houseofbooks.dtos.UsuarioDTO;
import br.com.sindeaux.houseofbooks.entity.Usuario;
import br.com.sindeaux.houseofbooks.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PutMapping("/cadastrar")
    public ResponseEntity<ResponseDTO> cadastrarUsuarioNovo(@RequestBody UsuarioDTO usuario){
        ResponseDTO responseDTO;
        try{
            Usuario user = UsuarioConverter.convertUsuarioDTOToUsuario(usuario);
            usuarioRepository.save(user);
            responseDTO = new ResponseDTO("Usuario Cadastrado com sucesso", HttpStatus.OK);
        }catch(Exception e){
            responseDTO = new ResponseDTO("Não foi possivel cadastrar novo usuário", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseDTO>(responseDTO, responseDTO.getHttpStatus());
    }

}
