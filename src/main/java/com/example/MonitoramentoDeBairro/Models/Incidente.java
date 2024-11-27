package com.example.MonitoramentoDeBairro.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Incidente {

    private Long id;
    private String tipo;
    private String descricao;
    private String localizacao;
    private LocalDateTime dataHora;


}

