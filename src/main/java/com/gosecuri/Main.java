package com.gosecuri;


import java.io.IOException;
import java.util.Map;

import static com.gosecuri.Generation_arbo.generation_arborescence;

public class Main {
    public static void main(String[] args) throws IOException {

        LecteurFichier l = new LecteurFichier();
        Map<String, Agent> ag = l.lecture_staff();
        Generation_arbo ga = new Generation_arbo();
        generation_arborescence(ag, "C:\\Users\\jerem\\Desktop\\test\\"); //on aura le 2e arguments lors de l'execution qui sera le dossier de destination des dossiers com.gosecuri.Agent


    }
}