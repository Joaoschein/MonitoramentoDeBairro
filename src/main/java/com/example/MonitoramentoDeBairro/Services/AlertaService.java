package com.example.MonitoramentoDeBairro.Services;

import com.example.MonitoramentoDeBairro.Models.Alerta;
import com.example.MonitoramentoDeBairro.Models.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AlertaService {

    public void enviarNotificacao(Usuario usuario, Alerta alerta) {
        if (usuario.isAutenticado()) {
            System.out.println("Notificação enviada para " + usuario.getNome() + ": " + alerta.getMensagem());
        } else {
            System.out.println("Usuário " + usuario.getNome() + " não está autenticado. Notificação não enviada.");
        }
    }

    public void registrarResposta(Usuario usuario, String resposta) {
        System.out.println("Resposta registrada de " + usuario.getNome() + ": " + resposta);
    }

    public void enviarAlertaParaAutoridades(Alerta alerta) {
        System.out.println("Alerta enviado para autoridades: " + alerta.getMensagem() + " na área " + alerta.getArea());
    }

}
