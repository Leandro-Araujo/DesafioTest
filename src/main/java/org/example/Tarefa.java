package org.example;

import java.util.Comparator;

public class Tarefa  {
    private int id;
    private String descricao;
    private boolean concluida;

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    public boolean isConcluida(){
        return this.concluida;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }


}
