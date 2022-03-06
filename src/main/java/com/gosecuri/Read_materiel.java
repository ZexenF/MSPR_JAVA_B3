package com.gosecuri;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Read_materiel {
    public Map<String, String> fiche_materiel() throws IOException {
        Map<String, String> map_materiel = new HashMap<>();
        String line;
        String str[] = new String[20];
        InputStream input = new FileInputStream("/var/lib/jenkins/workspace/MSPR_JAVA_B3/MSPR_JAVA_B3/src/main/resources/txt/liste.txt"); /* chemin du fichier liste.txt */
        InputStreamReader inputstr = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(inputstr);
        while ((line = br.readLine()) != null) { /* lit toutes les lignes du fichier jusqu'à tombé sur une ligne vide*/
            str = line.split("\t");   /* str est un tableau de 2 String, le premier est les caractères avant le tabulation, le 2e celui après la tabulation */
            map_materiel.put(str[0], str[1]); /* dans ce map on aura la key qui sera donc l'abrégé du matériel, et la valeur sera le matériel complet */
        }

        return map_materiel;

    }
}
