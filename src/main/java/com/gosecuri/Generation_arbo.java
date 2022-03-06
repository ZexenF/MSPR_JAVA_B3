package com.gosecuri;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Generation_arbo {
    public static void generation_arborescence(Map<String, Agent> map_agent, String destination, Map<String, String> map_materiel) throws IOException {
        char guillemet ='"';
        map_agent.forEach((raccourci, complet) -> {
            new File(destination + raccourci).mkdir();
            try (PrintWriter writer = new PrintWriter(destination + "\\" + raccourci + "\\" + raccourci + ".html")) {
                writer.println("<head> <title>" + complet.getNom() + "</title> </head>");
                for (String comp : complet.getMateriel()) {
                    System.out.println(comp);
                    map_materiel.forEach((abrege, longue) -> {
                        if (abrege.equals(comp)) {
                            writer.println("<div><input type=\"checkbox\" name=\"" + longue + "\" checked>\n"
                                    + "<label for =\"" + longue + "\"> " + longue + "</label>\n</div>");
                        }
                    });
                }
                writer.println("<img src="+ guillemet +"C:\\Users\\jerem\\Documents\\GitHub\\MSPR_JAVA_B3_TXT\\id\\"+raccourci+".jpg" + guillemet);

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


