package com.example.MonitoramentoDeBairro.Facade;

import com.example.MonitoramentoDeBairro.Models.*;
import com.example.MonitoramentoDeBairro.Services.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MonitoramentoFacade {
    private CadastroService cadastroService;
    private IncidenteService incidenteService;
    private AlertaService alertaService;
    private BotaoPanicoService botaoPanicoService;
    private MapaOcorrenciaService mapaOcorrenciaService;
    public String cadastrarEVerificarUsuario(Usuario usuario) {
        return cadastroService.cadastrarEVerificarUsuario(usuario.getNome(), usuario.getEndereco(), usuario.getTelefone());
    }
    public String armazenarIncidente(Incidente incidente) {
        return incidenteService.armazenarIncidente(incidente);
    }
    public String enviarNotificacao(Incidente incidente) {
        return incidenteService.enviarNotificacoes(incidente);
    }

    public void enviarNotificacaoParaAutoridade(Incidente incidente, AutoridadeLocal autoridade) {
       incidenteService.enviarNotificacaoParaAutoridade(incidente, autoridade);
    }
    public void enviarNotificacaoAlerta(Usuario usuario, Alerta alerta) {
        alertaService.enviarNotificacao(usuario, alerta);
    }
    public void registrarResposta(Usuario usuario, String resposta) {
        alertaService.registrarResposta(usuario, resposta);
    }
    public void enviarAlertaAutoridade(Alerta alerta) {
        alertaService.enviarAlertaParaAutoridades(alerta);
    }
    public String botaoPanico(NotificacaoDeEmergencia notificacaoDeEmergencia) {
        return botaoPanicoService.apertarBotaoDePanico(notificacaoDeEmergencia);
    }
    public String notificarPanico(NotificacaoDeEmergencia notificacaoDeEmergencia) {
        return botaoPanicoService.enviarNotificacaoPanico(notificacaoDeEmergencia);
    }
    public List<Ocorrencia> buscarOcorrencias(Usuario usuario) {
        return mapaOcorrenciaService.buscarOcorrencias(usuario);
    }
    public String renderizarMapa(List<Ocorrencia> ocorrencia) {
        return mapaOcorrenciaService.renderizarMapa(ocorrencia);
    }


}

