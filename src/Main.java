//Importa as classes
import br.com.atividades.modelos.Atividades;
import br.com.atividades.modelos.Estudo;
import br.com.atividades.modelos.Pessoal;
import br.com.atividades.modelos.Trabalho;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//classe principal
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);// objeto para entrada de dados
        ArrayList<Atividades> lista = new ArrayList<>();//lista que armazena todas as atividades
        String nome ;
        Boolean  concluido;
        String descricao;
        int i = 0;
        System.out.println("========================================================================");
        //Loop principal do programa
        do{
            //menu de opções
            System.out.println("\nMenu:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Marcar tarefa como concluída");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Listar tarefas");
            System.out.print("Escolha uma opção: ");
            i = entrada.nextInt();
            entrada.nextLine(); // limpa o buffer
            System.out.println("==============================================================================");
            switch (i){
                case 1:
                    //adiciona nova tarefa
                    System.out.println("Qual o tipo da atividade que deseja criar ? ");
                    System.out.println("1-Trabalho");
                    System.out.println("2-Pessoal");
                    System.out.println("3-Estudo");
                    int tipoAtividades = entrada.nextInt();
                    entrada.nextLine();
                    //usando a classe mãe como referência (Polimorfismo)
                    Atividades atividade;
                    //intância a atividade
                    switch (tipoAtividades) {
                        case 1:
                            atividade = new Trabalho();
                            break;
                        case 2:
                            atividade = new Pessoal();
                            break;
                        case 3:
                            atividade = new Estudo();
                            break;
                        default:
                            System.out.println("Tipo inválido, criando atividade padrão.");
                            atividade = new Atividades();
                            break;
                    }
                    System.out.print("Qual o nome da tarefa: ");
                     nome = entrada.nextLine();
                    System.out.print("Qual a descrição da tarefa: ");
                     descricao = entrada.nextLine();
                     atividade.Informacao(nome,descricao);
                    // Informações específicas, usando instanceof
                     if(atividade instanceof Trabalho){  // Instaceof verifica se o objeto e instacia de uma classe espefica
                        Trabalho t = (Trabalho) atividade;
                         System.out.println("Qual o prazo da entrega?");
                         t.setPrazoDeEntrega(entrada.nextLine());
                         System.out.println("Qual a prioridade?");
                         t.setPrioridade(entrada.nextLine());
                         System.out.println("Qual o nome da empresa?");
                         t.setNomeEmpresa(entrada.nextLine());
                     }else if (atividade instanceof Pessoal){
                         Pessoal p = (Pessoal) atividade;
                         System.out.println("Qual o local da tarefa?");
                         p.setLocal(entrada.nextLine());
                         System.out.println("Qual o tipo da tarefa");
                         p.setTipo(entrada.nextLine());
                     }else if (atividade instanceof Estudo){
                         Estudo e = (Estudo) atividade;
                         System.out.println("Qual a materia ou o curso ?");
                         e.setMateriaOuCurso(entrada.nextLine());
                         System.out.println("quantas horas de estudo ?");
                         e.setHora(entrada.nextInt());
                         System.out.println("Qual a data da Avaliação ? ");
                         e.setDataProva(entrada.nextLine());



                     }
                    // Adiciona a atividade na lista
                    lista.add(atividade);
                    System.out.println("Tarefa adicionada com sucesso! ✅");
                    break;
                case 2 :
                    // Marca uma tarefa como concluída
                    System.out.println("Digite o numero da tarefa para marcalá como concluida");
                    for(int indx = 0; indx<lista.size();indx++){
                        System.out.println((indx + 1) + "_" +lista.get(indx).getNome());
                    }
                    int posicao = entrada.nextInt();
                    entrada.nextLine();
                    if(posicao>=0 && posicao<=lista.size()){
                        Atividades tarefa = lista.get(posicao-1);
                        tarefa.marcaConcluido();
                        System.out.println(" Tarefa " + tarefa.getNome() + "  foi concluida com sucesso ✅");
                    }else {
                        System.out.println("Número invalido ❌");
                    }
                    break;
                case 3 :
                    // Remove uma tarefa da lista
                    System.out.println("Digite o numero da tarefa para retiralá da lista");
                    for(int indx = 0 ; indx<lista.size();indx++){
                        System.out.println((indx + 1) + "_" + lista.get(indx).getNome());
                    }
                    int retira = entrada.nextInt();
                    entrada.nextLine();
                    if(retira>0 && retira<=lista.size()){
                        Atividades removido = lista.remove(retira-1);
                        System.out.println("Tarefa \"" + removido.getNome() + "\" removida com sucesso 🗑️");
                    }else{
                        System.out.println("Número inválido ❌");
                    }
                    break;
                case 4:
                    // Lista todas as tarefas cadastradas
                    if(lista.isEmpty()){
                        System.out.println("Nehuma lista cadastrada");

                    }else{
                        System.out.println("=================================LISTA DE TRAREFAS =======================================");
                        for(int indx = 0; indx< lista.size();indx++){
                            System.out.println((indx+1) + " -- " + lista.get(indx));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa");
                    break;
            }
        }while(i>0);
        entrada.close();
    }}
