package com.example.MonitoramentoDeBairro.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class NotificacaoDeEmergencia {

    private Long id;

    private Usuario usuario;

    private String localizacao;

    private LocalDateTime dataHora;

    private String status;
}
