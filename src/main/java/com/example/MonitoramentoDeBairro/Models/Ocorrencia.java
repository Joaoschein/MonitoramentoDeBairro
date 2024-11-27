package com.example.MonitoramentoDeBairro.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Ocorrencia {
    private Long id;
    private String descricao;
    private String tipo;
    private double latitude;
    private double longitude;
    private LocalDateTime dataHora;

}
