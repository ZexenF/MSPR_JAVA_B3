package com.gosecuri;

import java.util.*;

public class Agent {
    private String nom;
    private String prenom;
    private String password;
    private String job;
    private List<String> materiel;
    private String carteIdentite;

    public Agent(String nom, String prenom, String password, String job, List<String> materiel, String carteIdentite) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.job = job;
        this.materiel = materiel;
        this.carteIdentite = carteIdentite;
    }
}
