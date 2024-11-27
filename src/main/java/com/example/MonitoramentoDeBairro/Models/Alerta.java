package com.example.MonitoramentoDeBairro.Models;

public class Alerta {
    private String mensagem;
    private String area;

    public Alerta(String mensagem, String area) {
        this.mensagem = mensagem;
        this.area = area;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getArea() {
        return area;
    }
}
