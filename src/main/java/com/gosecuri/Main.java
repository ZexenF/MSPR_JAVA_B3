package com.gosecuri;

import java.util.Map;

public class Main {
    public static void main(String[] args){
    LecteurFichier l = new LecteurFichier();
    Map<String,Agent> ag = l.lecture_staff();
    Generation_arbo ga = new Generation_arbo();
    Generation_arbo.generation_arborescence(ag, "C:\\"); //on aura le 2e arguments lors de l'execution qui sera le dossier de destination des dossiers Agent

    System.out.println(l);
    }
}
