package com.gosecuri;
import java.io.*;
import java.nio.Buffer;
import java.util.List;

public class Lecture {
    String lecture_nom;
    String lecture_prenom;
    String lecture_fonction;
    String lecture_password;
    List<String> lecture_materiel = null;

    public Lecture(String lecture_nom, String lecture_prenom, String lecture_fonction, String lecture_password, List<String> lecture_materiel) {
        this.lecture_nom = lecture_nom;
        this.lecture_prenom = lecture_prenom;
        this.lecture_fonction = lecture_fonction;
        this.lecture_password = lecture_password;
        this.lecture_materiel = lecture_materiel;
    }

    public void lecture_staff() {
        String file = "cheminfichier"; //Chemin du fichier à lire
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                lecture_agent(line);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); //écrit ce qui s'est passé dans l'exception
        }
    }


    public Agent lecture_agent(String fiche) {

        try {
            FileReader file_agent = new FileReader(fiche + ".txt");
            BufferedReader buffer = new BufferedReader(file_agent);
            for (int i = 1; i < 15; i++) {
                if (i == 1) {
                    lecture_nom = buffer.readLine();
                }
                else if (i == 2) {
                    lecture_prenom = buffer.readLine();
                }
                else if (i == 3) {
                    lecture_fonction = buffer.readLine();
                }
                else if (i == 4) {
                    lecture_password = buffer.readLine();
                }
                else if (i> 5){
                    lecture_materiel.add(buffer.readLine());
                }
                else buffer.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); //écrit ce qui s'est passé dans l'exception
        }
        Agent agent_lu = new Agent(lecture_nom,lecture_prenom,lecture_password,lecture_fonction,lecture_materiel);
        return agent_lu;
    }
}
