package br.com.atividades.modelos;
/**
 * Classe Pessoal representa uma atividade de caráter pessoal.
 * Estende a classe Atividades e adiciona atributos específicos.
 */

public class Pessoal extends Atividades{
 private  String local;
 private String tipo;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
