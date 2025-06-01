package br.com.atividades.modelos;

/**
 * Representa uma atividade do tipo Trabalho.
 * Estende a classe Atividades, herdando nome, descrição e status de conclusão.
 */

public class Trabalho extends Atividades{
private String PrazoDeEntrega;
private String prioridade;
private  String nomeEmpresa;

    public String getPrazoDeEntrega() {
        return PrazoDeEntrega;
    }

    public void setPrazoDeEntrega(String prazoDeEntrega) {
        PrazoDeEntrega = prazoDeEntrega;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}


