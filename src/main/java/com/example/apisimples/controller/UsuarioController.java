package com.example.apisimples.controller;

import com.example.apisimples.model.Usuario;
import com.example.apisimples.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint para registrar um novo usuário (POST)
    @PostMapping
    public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario) {
        try {
            String mensagem = usuarioService.registrarUsuario(usuario);
            return ResponseEntity.status(201).body(mensagem);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    // Novo endpoint para listar todos os usuários (GET)
    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    // Endpoint para verificar o status da API (GET)
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("API funcionando!");
    }
}
