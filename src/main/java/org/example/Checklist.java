package org.example;

import org.example.comparators.DescricaoComparator;

import java.util.ArrayList;
import java.util.List;

public class Checklist {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }

    public List<Tarefa> getTodasAsTarefas(){
        return this.tarefas;
    }

    public List<Tarefa> getTodasAsTarefasConcluidas(){
        return this.tarefas.stream().filter( tarefa -> tarefa.isConcluida() ).toList();
    }

    public List<Tarefa> getTodasAsTarefasPendentes(){
        return this.tarefas.stream()
                .filter( tarefa -> !tarefa.isConcluida() )
                .toList();
    }

    public void alterarStatusTarefa(int id, boolean concluida){
        this.tarefas.stream()
                .filter( tarefa -> tarefa.getId() == id )
                .toList()
                .get(0)
                .setConcluida(concluida);
    }

    public List<String> getTodasAsDescricoes(){
        return this.tarefas.stream()
                .map(tarefa -> tarefa.getDescricao())
                .toList();
    }

    public List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao(){
        List<Tarefa> todasTarefas = new ArrayList<>();
        todasTarefas.addAll(this.getTodasAsTarefasConcluidas().stream().sorted(new DescricaoComparator()).toList());
        todasTarefas.addAll(this.getTodasAsTarefasPendentes().stream().sorted(new DescricaoComparator()).toList());
        return todasTarefas;
    }


}
