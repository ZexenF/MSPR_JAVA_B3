package com.gosecuri;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Generation_arbo {
    public static void generation_arborescence(Map<String, Agent> map_agent, String destination, Map<String, String> map_materiel) throws IOException {
        char guillemet ='"';
        map_agent.forEach((raccourci, complet) -> {                         //on parcourt tous les agents
            new File(destination + raccourci).mkdir();
            try (PrintWriter writer = new PrintWriter(destination + "/" + raccourci + "/" + raccourci + ".html")) {     //on crée le dossier et le fichier html correspondant a l'agent lu
                writer.println("<head> <title>" + complet.getNom() + "</title> </head><link rel="+ guillemet +"stylesheet"+ guillemet +" style=" + guillemet + "text\\css href=" + guillemet + ".css/>" +guillemet); //écriture du titre avec le nom de l'agent
                for (String comp : complet.getMateriel()) {                                                                     //On parcourt le matériel de l'agent
                    map_materiel.forEach((abrege, longue) -> {                                                                  //On parcourt la Hashmap du fichier materiel
                        if (abrege.equals(comp)) {                                                                              //On regarde si le materiel de l'agent fait bien parti de la liste de materiel si c'est la cas on rajoute ce matériel dans le fichier html
                            writer.println("<div><input type=\"checkbox\" name=\"" + longue + "\" checked>\n"
                                    + "<label for =\"" + longue + "\"> " + longue + "</label>\n</div>");
                        }
                    });
                }
                writer.println("<img src="+ guillemet +"/var/lib/jenkins/workspace/MSPR_JAVA_B3/MSPR_JAVA_B3/src/main/resources/id/"+raccourci+".jpg" + guillemet);         //importe l'image correspondant a l'agent.
                writer.flush();
                writer.println("</body>");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
    /* public static void generation_arborescence2(Map map_agent, String destination){
        map_agent.forEach((raccourci, complet) -> {
            File src = new File("C:\\cheminsource");
            File dest = new File (destination+"\\"+ raccourci+"\\"+raccourci+".html");
            InputStream is = null;
            OutputStream os = null;

            try{
                is = new FileInputStream(src);
                os = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) > 0){
                    os.write(buffer, 0,len);
                }
                is.close();
                os.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }); */


