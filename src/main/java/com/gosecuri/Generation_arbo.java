package com.gosecuri;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Generation_arbo {
    public static void generation_arborescence(Map map_agent, String destination){
        String chemin = "C:\\";
        Path path = Paths.get(chemin);
        map_agent.forEach((raccourci, complet) -> {
            new File(destination + raccourci).mkdir();
        });
    }
}
