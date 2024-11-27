package com.example.MonitoramentoDeBairro.Controller;

import com.example.MonitoramentoDeBairro.Facade.MonitoramentoFacade;
import com.example.MonitoramentoDeBairro.Models.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class MonitoramentoController {

    @Autowired
    private MonitoramentoFacade monitoramentoFacade;

    @PostMapping("/cadastrar")
    public String cadastrarEVerificarUsuario(@RequestBody Usuario usuario) {
        return monitoramentoFacade.cadastrarEVerificarUsuario(usuario);
    }
    @PostMapping("/incidente")
    public String relatarIncidente (@RequestBody Incidente incidente) {
        return monitoramentoFacade.armazenarIncidente(incidente);
    }

    @GetMapping("/notificacaoIncidente")
    public String enviarNotificacaoIncidente (@RequestBody Incidente incidente) {
        return monitoramentoFacade.enviarNotificacao(incidente);
    }

    @GetMapping("/notificacaoAlerta")
    public void enviarNotificacaoAlerta (@RequestBody Usuario usuario, Alerta alerta) {
        monitoramentoFacade.enviarNotificacaoAlerta(usuario, alerta);
    }

    @GetMapping("/resposta")
    public void registrarResposta (@RequestBody Usuario usuario, String resposta) {
        monitoramentoFacade.registrarResposta(usuario, resposta);
    }

    @GetMapping("/alertaAutoridade")
    public void notificarAutoridade (@RequestBody Alerta alerta) {
        monitoramentoFacade.enviarAlertaAutoridade(alerta);
    }

    @GetMapping("/botaoPanico")
    public void botaoPanico (@RequestBody NotificacaoDeEmergencia notificacao) {
        monitoramentoFacade.botaoPanico(notificacao);
    }

    @GetMapping("/notificarPanico")
    public void notificarPanico (@RequestBody NotificacaoDeEmergencia notificacao) {
        monitoramentoFacade.notificarPanico(notificacao);
    }

    @GetMapping("/buscarOcorrencia")
    public List<Ocorrencia> buscarOcorrencia(@RequestBody Usuario usuario) {
        return monitoramentoFacade.buscarOcorrencias(usuario);
    }

    @GetMapping("/renderizarMapa")
    public String renderizarMapa(@RequestBody List<Ocorrencia> ocorrencias) {
        return monitoramentoFacade.renderizarMapa(ocorrencias);
    }

    @GetMapping("/notificarAutoridade")
    public void notificarAutoridade (@RequestBody Incidente incidente, AutoridadeLocal autoridade) {
        monitoramentoFacade.enviarNotificacaoParaAutoridade(incidente, autoridade);
    }


}
