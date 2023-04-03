package Entities.Exo1;

import java.util.ArrayList;

public class Captage implements Comparable
{
    private int idCaptage;
    private String nom;
    private int hauteur;
    private int DebitMax;
    private ArrayList<Captage> lesCaptages;


    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        DebitMax = debitMax;
        lesCaptages = new ArrayList<>();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    /*public String GetDescription(){

        for(Captage capt:  lesCaptages){
            nom = capt.nom;
            hauteur = capt.hauteur;
            DebitMax = capt.DebitMax;

        }
        //return lesCaptages;
    }*/
}
