package com.example.MonitoramentoDeBairro.Services;

import com.example.MonitoramentoDeBairro.Models.Usuario;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    public Usuario cadastrar(String nome, String endereco, String telefone) {
        // Lógica para cadastrar o usuário no sistema
        System.out.println("Cadastrando usuário...");
        return new Usuario(nome, endereco, telefone);
    }

    public boolean verificarIdentidade(Usuario usuario) {
        // Lógica de verificação, como envio de SMS ou email
        System.out.println("Verificando identidade do usuário...");
        // Vamos assumir que a verificação é bem-sucedida para este exemplo
        return true;
    }

    public boolean revisarCadastro(Usuario usuario) {
        System.out.println("Revisando cadastro do usuário...");
        return true;
    }

    public String cadastrarEVerificarUsuario(String nome, String endereco, String telefone) {
        // Passo 1: Cadastro do usuário
        Usuario usuario = cadastrar(nome, endereco, telefone);

        // Passo 2: Verificação da identidade
        boolean identidadeVerificada = verificarIdentidade(usuario);

        if (identidadeVerificada) {
            // Passo 3: Revisão do cadastro pelo administrador
            boolean cadastroAprovado = revisarCadastro(usuario);
            return "Cadastro Realizado com Sucesso";
        }
        else return "O Cadastro falhou";
    }
}

