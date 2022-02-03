package main.java.com.gosecuri;

import java.util.*;

public class Agent {
    private final String nom;
    private final String prenom;
    private final String password;
    private final String job;
    private final List<String> materiel;

    public Agent(String nom, String prenom, String password, String job, List<String> materiel) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.job = job;
        this.materiel = materiel;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    public List<String> getMateriel() {
        return materiel;
    }
}
