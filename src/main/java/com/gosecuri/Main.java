package com.gosecuri;

import java.util.Map;

public class Main {
    public static void main(String[] args){
    LecteurFichier l = new LecteurFichier();
    Map<String,Agent> ag = l.lecture_staff();

    System.out.println(l);
    }
}
