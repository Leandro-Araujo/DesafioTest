package org.example.comparators;

import org.example.Tarefa;

import java.util.Comparator;

public class DescricaoComparator implements Comparator<Tarefa> {

    @Override
    public int compare(Tarefa tarefa1, Tarefa tarefa2) {
        return CharSequence.compare(tarefa1.getDescricao(), tarefa2.getDescricao());
    }
}
