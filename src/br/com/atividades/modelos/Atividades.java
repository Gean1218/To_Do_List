package br.com.atividades.modelos;
/**
 * Classe genérica que representa uma atividade.
 * Serve como superclasse para tipos específicos como Trabalho, Estudo e Pessoal.
 */

public class Atividades {
    private String nome;
    private boolean concluido;
    private String descricao;



    public void Informacao(String nome ,String descricao){
       this.nome=nome;
       this.descricao = descricao;
    }

    public void marcaConcluido(){
        this.concluido=true;
    }

    /**
     * Retorna se a tarefa foi concluída.
     *
     * @return true se concluída, false caso contrário
     */
    public boolean isConcluido() {
        return concluido;
    }

    public String getNome() {
        return nome;
    }
    public String getDescricao(){
        return descricao;

    }
    /**
     * Retorna uma representação textual da tarefa,
     * exibindo nome, descrição e status de conclusão.
     */

    @Override
    public String toString() {
        return " Tarefa " + nome + " Descrição " + descricao + "|Concluido: " + (concluido ? "Sim":"Não");
    }
}
