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

    private boolean abSegunda, abTerca,abQuarta,abQuinta,abSexta,abSabado,abDomingo;
    private boolean aeSegunda, aeTerca,aeQuarta,aeQuinta,aeSexta,aeSabado,aeDomingo;
    private boolean antSegunda, antTerca,antQuarta,antQuinta,antSexta,antSabado,antDomingo;
    private boolean biSegunda, biTerca,biQuarta,biQuinta,biSexta,biSabado,biDomingo;
    private boolean coSegunda, coTerca,coQuarta,coQuinta,coSexta,coSabado,coDomingo;
    private boolean gluSegunda, gluTerca,gluQuarta,gluQuinta,gluSexta,gluSabado,gluDomingo;
    private boolean ombSegunda, ombTerca,ombQuarta,ombQuinta,ombSexta,ombSabado,ombDomingo;
    private boolean peiSegunda, peiTerca,peiQuarta,peiQuinta,peiSexta,peiSabado,peiDomingo;
    private boolean perSegunda, perTerca,perQuarta,perQuinta,perSexta,perSabado,perDomingo;
    private boolean triSegunda, triTerca,triQuarta,triQuinta,triSexta,triSabado,triDomingo;
     
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

    public boolean isAbSegunda() {
        return abSegunda;
    }

    public void setAbSegunda(boolean abSegunda) {
        this.abSegunda = abSegunda;
    }

    public boolean isAbTerca() {
        return abTerca;
    }

    public void setAbTerca(boolean abTerca) {
        this.abTerca = abTerca;
    }

    public boolean isAbQuarta() {
        return abQuarta;
    }

    public void setAbQuarta(boolean abQuarta) {
        this.abQuarta = abQuarta;
    }

    public boolean isAbQuinta() {
        return abQuinta;
    }

    public void setAbQuinta(boolean abQuinta) {
        this.abQuinta = abQuinta;
    }

    public boolean isAbSexta() {
        return abSexta;
    }

    public void setAbSexta(boolean abSexta) {
        this.abSexta = abSexta;
    }

    public boolean isAbSabado() {
        return abSabado;
    }

    public void setAbSabado(boolean abSabado) {
        this.abSabado = abSabado;
    }

    public boolean isAbDomingo() {
        return abDomingo;
    }

    public void setAbDomingo(boolean abDomingo) {
        this.abDomingo = abDomingo;
    }

    public boolean isAeSegunda() {
        return aeSegunda;
    }

    public void setAeSegunda(boolean aeSegunda) {
        this.aeSegunda = aeSegunda;
    }

    public boolean isAeTerca() {
        return aeTerca;
    }

    public void setAeTerca(boolean aeTerca) {
        this.aeTerca = aeTerca;
    }

    public boolean isAeQuarta() {
        return aeQuarta;
    }

    public void setAeQuarta(boolean aeQuarta) {
        this.aeQuarta = aeQuarta;
    }

    public boolean isAeQuinta() {
        return aeQuinta;
    }

    public void setAeQuinta(boolean aeQuinta) {
        this.aeQuinta = aeQuinta;
    }

    public boolean isAeSexta() {
        return aeSexta;
    }

    public void setAeSexta(boolean aeSexta) {
        this.aeSexta = aeSexta;
    }

    public boolean isAeSabado() {
        return aeSabado;
    }

    public void setAeSabado(boolean aeSabado) {
        this.aeSabado = aeSabado;
    }

    public boolean isAeDomingo() {
        return aeDomingo;
    }

    public void setAeDomingo(boolean aeDomingo) {
        this.aeDomingo = aeDomingo;
    }

    public boolean isAntSegunda() {
        return antSegunda;
    }

    public void setAntSegunda(boolean antSegunda) {
        this.antSegunda = antSegunda;
    }

    public boolean isAntTerca() {
        return antTerca;
    }

    public void setAntTerca(boolean antTerca) {
        this.antTerca = antTerca;
    }

    public boolean isAntQuarta() {
        return antQuarta;
    }

    public void setAntQuarta(boolean antQuarta) {
        this.antQuarta = antQuarta;
    }

    public boolean isAntQuinta() {
        return antQuinta;
    }

    public void setAntQuinta(boolean antQuinta) {
        this.antQuinta = antQuinta;
    }

    public boolean isAntSexta() {
        return antSexta;
    }

    public void setAntSexta(boolean antSexta) {
        this.antSexta = antSexta;
    }

    public boolean isAntSabado() {
        return antSabado;
    }

    public void setAntSabado(boolean antSabado) {
        this.antSabado = antSabado;
    }

    public boolean isAntDomingo() {
        return antDomingo;
    }

    public void setAntDomingo(boolean antDomingo) {
        this.antDomingo = antDomingo;
    }

    public boolean isBiSegunda() {
        return biSegunda;
    }

    public void setBiSegunda(boolean biSegunda) {
        this.biSegunda = biSegunda;
    }

    public boolean isBiTerca() {
        return biTerca;
    }

    public void setBiTerca(boolean biTerca) {
        this.biTerca = biTerca;
    }

    public boolean isBiQuarta() {
        return biQuarta;
    }

    public void setBiQuarta(boolean biQuarta) {
        this.biQuarta = biQuarta;
    }

    public boolean isBiQuinta() {
        return biQuinta;
    }

    public void setBiQuinta(boolean biQuinta) {
        this.biQuinta = biQuinta;
    }

    public boolean isBiSexta() {
        return biSexta;
    }

    public void setBiSexta(boolean biSexta) {
        this.biSexta = biSexta;
    }

    public boolean isBiSabado() {
        return biSabado;
    }

    public void setBiSabado(boolean biSabado) {
        this.biSabado = biSabado;
    }

    public boolean isBiDomingo() {
        return biDomingo;
    }

    public void setBiDomingo(boolean biDomingo) {
        this.biDomingo = biDomingo;
    }

    public boolean isCoSegunda() {
        return coSegunda;
    }

    public void setCoSegunda(boolean coSegunda) {
        this.coSegunda = coSegunda;
    }

    public boolean isCoTerca() {
        return coTerca;
    }

    public void setCoTerca(boolean coTerca) {
        this.coTerca = coTerca;
    }

    public boolean isCoQuarta() {
        return coQuarta;
    }

    public void setCoQuarta(boolean coQuarta) {
        this.coQuarta = coQuarta;
    }

    public boolean isCoQuinta() {
        return coQuinta;
    }

    public void setCoQuinta(boolean coQuinta) {
        this.coQuinta = coQuinta;
    }

    public boolean isCoSexta() {
        return coSexta;
    }

    public void setCoSexta(boolean coSexta) {
        this.coSexta = coSexta;
    }

    public boolean isCoSabado() {
        return coSabado;
    }

    public void setCoSabado(boolean coSabado) {
        this.coSabado = coSabado;
    }

    public boolean isCoDomingo() {
        return coDomingo;
    }

    public void setCoDomingo(boolean coDomingo) {
        this.coDomingo = coDomingo;
    }

    public boolean isGluSegunda() {
        return gluSegunda;
    }

    public void setGluSegunda(boolean gluSegunda) {
        this.gluSegunda = gluSegunda;
    }

    public boolean isGluTerca() {
        return gluTerca;
    }

    public void setGluTerca(boolean gluTerca) {
        this.gluTerca = gluTerca;
    }

    public boolean isGluQuarta() {
        return gluQuarta;
    }

    public void setGluQuarta(boolean gluQuarta) {
        this.gluQuarta = gluQuarta;
    }

    public boolean isGluQuinta() {
        return gluQuinta;
    }

    public void setGluQuinta(boolean gluQuinta) {
        this.gluQuinta = gluQuinta;
    }

    public boolean isGluSexta() {
        return gluSexta;
    }

    public void setGluSexta(boolean gluSexta) {
        this.gluSexta = gluSexta;
    }

    public boolean isGluSabado() {
        return gluSabado;
    }

    public void setGluSabado(boolean gluSabado) {
        this.gluSabado = gluSabado;
    }

    public boolean isGluDomingo() {
        return gluDomingo;
    }

    public void setGluDomingo(boolean gluDomingo) {
        this.gluDomingo = gluDomingo;
    }

    public boolean isOmbSegunda() {
        return ombSegunda;
    }

    public void setOmbSegunda(boolean ombSegunda) {
        this.ombSegunda = ombSegunda;
    }

    public boolean isOmbTerca() {
        return ombTerca;
    }

    public void setOmbTerca(boolean ombTerca) {
        this.ombTerca = ombTerca;
    }

    public boolean isOmbQuarta() {
        return ombQuarta;
    }

    public void setOmbQuarta(boolean ombQuarta) {
        this.ombQuarta = ombQuarta;
    }

    public boolean isOmbQuinta() {
        return ombQuinta;
    }

    public void setOmbQuinta(boolean ombQuinta) {
        this.ombQuinta = ombQuinta;
    }

    public boolean isOmbSexta() {
        return ombSexta;
    }

    public void setOmbSexta(boolean ombSexta) {
        this.ombSexta = ombSexta;
    }

    public boolean isOmbSabado() {
        return ombSabado;
    }

    public void setOmbSabado(boolean ombSabado) {
        this.ombSabado = ombSabado;
    }

    public boolean isOmbDomingo() {
        return ombDomingo;
    }

    public void setOmbDomingo(boolean ombDomingo) {
        this.ombDomingo = ombDomingo;
    }

    public boolean isPeiSegunda() {
        return peiSegunda;
    }

    public void setPeiSegunda(boolean peiSegunda) {
        this.peiSegunda = peiSegunda;
    }

    public boolean isPeiTerca() {
        return peiTerca;
    }

    public void setPeiTerca(boolean peiTerca) {
        this.peiTerca = peiTerca;
    }

    public boolean isPeiQuarta() {
        return peiQuarta;
    }

    public void setPeiQuarta(boolean peiQuarta) {
        this.peiQuarta = peiQuarta;
    }

    public boolean isPeiQuinta() {
        return peiQuinta;
    }

    public void setPeiQuinta(boolean peiQuinta) {
        this.peiQuinta = peiQuinta;
    }

    public boolean isPeiSexta() {
        return peiSexta;
    }

    public void setPeiSexta(boolean peiSexta) {
        this.peiSexta = peiSexta;
    }

    public boolean isPeiSabado() {
        return peiSabado;
    }

    public void setPeiSabado(boolean peiSabado) {
        this.peiSabado = peiSabado;
    }

    public boolean isPeiDomingo() {
        return peiDomingo;
    }

    public void setPeiDomingo(boolean peiDomingo) {
        this.peiDomingo = peiDomingo;
    }

    public boolean isTriSegunda() {
        return triSegunda;
    }

    public void setTriSegunda(boolean triSegunda) {
        this.triSegunda = triSegunda;
    }

    public boolean isTriTerca() {
        return triTerca;
    }

    public void setTriTerca(boolean triTerca) {
        this.triTerca = triTerca;
    }

    public boolean isTriQuarta() {
        return triQuarta;
    }

    public void setTriQuarta(boolean triQuarta) {
        this.triQuarta = triQuarta;
    }

    public boolean isTriQuinta() {
        return triQuinta;
    }

    public void setTriQuinta(boolean triQuinta) {
        this.triQuinta = triQuinta;
    }

    public boolean isTriSexta() {
        return triSexta;
    }

    public void setTriSexta(boolean triSexta) {
        this.triSexta = triSexta;
    }

    public boolean isTriSabado() {
        return triSabado;
    }

    public void setTriSabado(boolean triSabado) {
        this.triSabado = triSabado;
    }

    public boolean isTriDomingo() {
        return triDomingo;
    }

    public void setTriDomingo(boolean triDomingo) {
        this.triDomingo = triDomingo;
    }

    public boolean isPerSegunda() {
        return perSegunda;
    }

    public void setPerSegunda(boolean perSegunda) {
        this.perSegunda = perSegunda;
    }

    public boolean isPerTerca() {
        return perTerca;
    }

    public void setPerTerca(boolean perTerca) {
        this.perTerca = perTerca;
    }

    public boolean isPerQuarta() {
        return perQuarta;
    }

    public void setPerQuarta(boolean perQuarta) {
        this.perQuarta = perQuarta;
    }

    public boolean isPerQuinta() {
        return perQuinta;
    }

    public void setPerQuinta(boolean perQuinta) {
        this.perQuinta = perQuinta;
    }

    public boolean isPerSexta() {
        return perSexta;
    }

    public void setPerSexta(boolean perSexta) {
        this.perSexta = perSexta;
    }

    public boolean isPerSabado() {
        return perSabado;
    }

    public void setPerSabado(boolean perSabado) {
        this.perSabado = perSabado;
    }

    public boolean isPerDomingo() {
        return perDomingo;
    }

    public void setPerDomingo(boolean perDomingo) {
        this.perDomingo = perDomingo;
    }
    
    
    
}
