package com.example.MonitoramentoDeBairro.Services;

import com.example.MonitoramentoDeBairro.Models.Ocorrencia;
import com.example.MonitoramentoDeBairro.Models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapaOcorrenciaService {

    public List<Ocorrencia> buscarOcorrencias(Usuario usuario) {

        List<Ocorrencia> ocorrencias = new ArrayList<>();

        Ocorrencia o1 = new Ocorrencia();
        o1.setId(1L);
        o1.setDescricao("Furto de veículo");
        o1.setTipo("Furto");
        o1.setLatitude(-23.561684);
        o1.setLongitude(-46.625378);
        o1.setDataHora(java.time.LocalDateTime.now());

        ocorrencias.add(o1);

        return ocorrencias;
    }

    public String renderizarMapa(List<Ocorrencia> ocorrencias) {
        // Simula a renderização do mapa com as ocorrências
        return "Mapa renderizado com " + ocorrencias.size() + " ocorrências.";
    }
}
