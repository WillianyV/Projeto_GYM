/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public class FichaDeTreino {
    private int id;
    private Aluno aluno;
    private Instrutor instrutor;
    private ArrayList<FichaExercicio> exercicios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<FichaExercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<FichaExercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
}
