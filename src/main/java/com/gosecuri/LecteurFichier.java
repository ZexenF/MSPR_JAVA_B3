package com.gosecuri;

import java.io.*;
import java.net.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LecteurFichier {


    public Map<String, Agent> lecture_staff() {

        Map<String, Agent> map_agent = new HashMap<>();
        String file = "C:\\Users\\Jeremy\\Documents\\GitHub\\MSPR_JAVA_B3_TXT\\txt\\staff.txt"; //Chemin du fichier à lire

        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                map_agent.put(line,lecture_agent(line)); //Map contenant l'ID de l'agent lié a sa fiche agent
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Une erreur s'est passée.");
            e.printStackTrace(); //écrit ce qui s'est passé dans l'exception
        }
        return map_agent;
    }


    public Agent lecture_agent(String fiche) {
        String lecture_nom = null;
        String lecture_prenom = null;
        String lecture_fonction = null;
        String lecture_password = null;
        List<String> lecture_materiel = new ArrayList<>();
        try {
            FileReader file_agent = new FileReader(String.format("C:\\Users\\Jeremy\\Documents\\GitHub\\MSPR_JAVA_B3_TXT\\txt\\%s.txt",fiche)); //chemin a modifié car test en dur

            BufferedReader buffer = new BufferedReader(file_agent);
            for (int i = 1; i < 15; i++) {
                if (i == 1) {
                    lecture_nom = buffer.readLine(); //si 1er ligne c'est le nom de famille
                }
                else if (i == 2) {
                    lecture_prenom = buffer.readLine(); //si 2e ligne c'est le prénom
                }
                else if (i == 3) {
                    lecture_fonction = buffer.readLine(); //si 3e ligne c'est la fonction
                }
                else if (i == 4) {
                    lecture_password = buffer.readLine(); //si 4e ligne c'est le mot de passe
                }
                else if (i> 5){
                    lecture_materiel.add(buffer.readLine()); //tout ce qui est après la 5e ligne (la 5e est vide) est du materiel qui est ajouté a une liste de String
                }
                else buffer.readLine(); //Comme la ligne 5 est vide il faut continuer de lire le fichier en ignorant cette ligne
            }
        }
        catch (IOException e) {
            System.out.println("Une erreur s'est passée.");
            e.printStackTrace(); //écrit ce qui s'est passé dans l'exception
        }
        Agent agent_lu = new Agent(lecture_nom,lecture_prenom,lecture_password,lecture_fonction,lecture_materiel);
        return agent_lu;
    }
}
