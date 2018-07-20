/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Elvis
 */
public class FichaExercicio {
   private int id, repeticoes,ordem; 
   private Exercicio exercicio;
   private FichaDeTreino fichaDeTreino;
   private String dia;

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public FichaDeTreino getFichaDeTreino() {
        return fichaDeTreino;
    }

    public void setFichaDeTreino(FichaDeTreino fichaDeTreino) {
        this.fichaDeTreino = fichaDeTreino;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
   
   
}
