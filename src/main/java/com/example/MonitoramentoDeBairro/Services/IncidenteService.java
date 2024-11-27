package com.example.MonitoramentoDeBairro.Services;

import com.example.MonitoramentoDeBairro.Models.AutoridadeLocal;
import com.example.MonitoramentoDeBairro.Models.Incidente;
import org.springframework.stereotype.Service;

@Service
public class IncidenteService {

    public String armazenarIncidente(Incidente incidente) {
        return "Incidente armazenado: " + incidente.getDescricao();
    }
    public String enviarNotificacoes(Incidente incidente) {
        return "Notificações enviadas para: comunidade e autoridades";
    }

    public void enviarNotificacaoParaAutoridade(Incidente incidente, AutoridadeLocal autoridade) {

        System.out.println("Notificação enviada para " + autoridade.getNome() +
                " sobre o incidente: " + incidente.getDescricao());
    }

}
