package com.example.apisimples.service;

import com.example.apisimples.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList<>();

    public String registrarUsuario(Usuario usuario) {
        if (usuario.getEmail().contains("@")) {
            usuarios.add(usuario);
            return "Usuário criado com sucesso";
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
