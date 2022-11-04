package com.viagem.services;

import java.util.Optional;

import com.viagem.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	Optional<Usuario> bucarPorId(Long id);
}
