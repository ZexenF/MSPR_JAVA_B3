package com.gosecuri;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Read_materiel {
    public Map<String, String> fiche_materiel() throws IOException {
        Map<String, String> map_materiel = null;
        String line;
        String str[] = new String[0];
        InputStream input = new FileInputStream("C:\\Users\\jerem\\Documents\\GitHub\\MSPR_JAVA_B3_TXT\\txt\\liste.txt");
        InputStreamReader inputstr = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(inputstr);
        while ((line = br.readLine()) != null) {
            str = line.split("\t");

        }
        for (int j = 0; j <= str.length; j= j+2) {
            map_materiel.put(str[j], str[j + 1]);
            System.out.println(str[j]);
        }
        System.out.println(map_materiel);
        return map_materiel;

    }
}
