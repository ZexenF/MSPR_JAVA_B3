package com.gosecuri;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generation_arbo {
    public static void generation_arborescence(Map map_agent, String destination){
        map_agent.forEach((raccourci, complet) -> {
            new File(destination + raccourci).mkdir();
            try(PrintWriter writer = new PrintWriter(destination+"\\"+ raccourci+"\\"+raccourci+".html")) {
                writer.println("<html><head><title>Titre </title></head>");

                writer.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}

