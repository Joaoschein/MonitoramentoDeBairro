package com.example.MonitoramentoDeBairro.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comunidade {
    private String nome;

    public Comunidade(String nome) {
        this.nome = nome;
    }

}
