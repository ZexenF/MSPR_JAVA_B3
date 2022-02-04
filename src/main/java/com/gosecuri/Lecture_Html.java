package com.gosecuri;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lecture_Html {
    public void creation_html(){
        try{
        BufferedReader file = new BufferedReader(new FileReader("C:\\template.html")); //Chemin du fichier à lire
            String line;
            StringBuffer inputBuffer = new StringBuffer();
            while ((line = file.readLine()) != null) {
                if (line == "<title>Fiche agent</title>"){

                }
            }
        }
        catch (IOException e) {
            System.out.println("Une erreur s'est passée.");
            e.printStackTrace(); //écrit ce qui s'est passé dans l'exception
        }

    }
}
