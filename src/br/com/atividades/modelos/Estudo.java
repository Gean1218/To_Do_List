package br.com.atividades.modelos;
/**
 * Classe Estudo representa uma atividade do tipo estudo.
 * Herda os atributos e métodos da classe Atividades.
 */


public class Estudo extends Atividades {
    private int hora;
    private String MateriaOuCurso;
    private String DataProva;



    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getMateriaOuCurso() {
        return MateriaOuCurso;
    }

    public void setMateriaOuCurso(String materiaOuCurso) {
        MateriaOuCurso = materiaOuCurso;
    }

    public String getDataProva() {
        return DataProva;
    }

    public void setDataProva(String dataProva) {
        DataProva = dataProva;
    }
}
