package com.example.MonitoramentoDeBairro.Services;

import com.example.MonitoramentoDeBairro.Models.NotificacaoDeEmergencia;
import org.springframework.stereotype.Service;

@Service
public class BotaoPanicoService {

    public String apertarBotaoDePanico(NotificacaoDeEmergencia notificacaoDeEmergencia) {
        return "voce " + notificacaoDeEmergencia.getUsuario() + "esta enviando um alerta a comunidade na localizacao" + notificacaoDeEmergencia.getLocalizacao();
    }

    public String enviarNotificacaoPanico(NotificacaoDeEmergencia notificacaoDeEmergencia) {

        return "o usuario " + notificacaoDeEmergencia.getUsuario() + " acionou o pagou de Panico na localizacao" + notificacaoDeEmergencia.getLocalizacao();
    }
}
