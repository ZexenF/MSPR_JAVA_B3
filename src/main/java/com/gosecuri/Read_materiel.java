package com.gosecuri;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Read_materiel {
    public Map<String, String> fiche_materiel() throws IOException {
        Map<String, String> map_materiel = new HashMap<>();
        String line;
        String str[] = new String[20];
        InputStream input = new FileInputStream("/var/lib/jenkins/workspace/MSPR_JAVA_B3/MSPR_JAVA_B3/src/main/resources/txt/liste.txt");
        InputStreamReader inputstr = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(inputstr);
        while ((line = br.readLine()) != null) {
            str = line.split("\t");
            map_materiel.put(str[0], str[1]);
        }

        return map_materiel;

    }
}
