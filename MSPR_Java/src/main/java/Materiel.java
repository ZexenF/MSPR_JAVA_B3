/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Materiel {
    public Boolean mousqueton;
    public Boolean gants;
    public Boolean brassard;
    public Boolean menottes;
    public Boolean cyno;
    public Boolean talky;
    public Boolean lampe;
    public Boolean kit;
    public Boolean taser;
    public Boolean lacrymo;

    public Materiel(Boolean mousqueton, Boolean gants, Boolean brassard, Boolean menottes, Boolean cyno, Boolean talky, Boolean lampe, Boolean kit, Boolean taser, Boolean lacrymo) {
        this.mousqueton = mousqueton;
        this.gants = gants;
        this.brassard = brassard;
        this.menottes = menottes;
        this.cyno = cyno;
        this.talky = talky;
        this.lampe = lampe;
        this.kit = kit;
        this.taser = taser;
        this.lacrymo = lacrymo;
    }
}
