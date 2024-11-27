package com.example.MonitoramentoDeBairro.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean autenticado;
    private String email;

    public Usuario(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.autenticado = autenticado;
        this.email = email;
    }

}
