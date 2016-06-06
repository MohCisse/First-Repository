/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraft;

import java.util.ArrayList;

/**
 *
 * @author Mohammed
 */
public class Warcraft {

    String Personnage;
    String Genre;
    String Race;
    int PointsDeVie;
    int maxPDV;
    int Heal;
    int dps;
    String Arme;
    static ArrayList Inventaire;
    String Nom;
    int Nrj;

    /**
     ***** CONSTRUCTEUR
     *
     *****
     * @param pPersonnage Type de Personnage
     * @param pNom Nom du Personnage
     * @param pGenre Genre Male ou femelle
     * @param pRace Race Orc, Elfe ou Humain
     */
    public Warcraft(String pPersonnage,
            String pNom,
            String pGenre,
            String pRace) {

        this.Personnage = pPersonnage;
        Warcraft.Inventaire = new ArrayList();

        switch (this.Personnage) {
            case "Mage":
                this.PointsDeVie = 1000;
                this.maxPDV = 1000;
                this.Arme = "Bâton";
                this.Heal = 100;
                this.dps = 100;
                this.Nrj = 100;
                setInventaire("Potion");
                setInventaire("Livre");
                break;

            case "Guerrier":
                this.PointsDeVie = 5000;
                this.maxPDV = 5000;
                this.Arme = "Epée";
                this.Heal = 10;
                this.dps = 30;
                this.Nrj = 100;
                setInventaire("Potion");
                setInventaire("Bouclier");
                break;

            case "Druide":
                this.PointsDeVie = 3000;
                this.maxPDV = 3000;
                this.Arme = "Feuille de Vigne";
                this.Heal = 500;
                this.dps = 30;
                this.Nrj = 100;
                setInventaire("Potion");
                setInventaire("Chouchaine");
                break;

            default:
                System.out.println("Aucun Type de Personnage définit.");
        }

        this.Genre = pGenre;
        this.Nom = pNom;
        this.Race = pRace;

    }

    /**
     ***** Remplir L'inventaire
     *
     *****
     * @param pObjet Objet à ajouter à l'inventaire
     */
    public static void setInventaire(String pObjet) {

        Warcraft.Inventaire.add(pObjet);

    }

    /**
     ***** Fonction Attaquer
     *
     *****
     * @param pN Personnage à Attaquer
     * @return
     */
    public int Attaquer(Warcraft pN) {

        pN.PointsDeVie -= this.dps;
        this.Nrj--;
        return pN.PointsDeVie;

    }

    /**
     ***** Fonction Soigner
     *
     *****
     * // * @param pCible Personnage à soigner
     *
     * @return Nouvelle valeur des points de vie
     */
    public int Soigner(/*Warcraft pCible*/) {

//        if (pCible == this) {
        if (this.PointsDeVie < this.maxPDV) {
            this.PointsDeVie += this.Heal;
        }

        if (this.PointsDeVie > this.maxPDV) {
            this.PointsDeVie = this.maxPDV;
        }

        return this.PointsDeVie;
//        } else {
//            while (pCible.PointsDeVie < pCible.maxPDV) {
//                pCible.PointsDeVie += this.Heal;
//            }
//        }
//        return pCible.PointsDeVie;

    }

    /**
     ***** Fonction Voir les Points de Vie
     *
     *****
     * @return PointsDeVie
     */
    public int voirPointsDeVie() {

        return this.PointsDeVie;

    }

    /**
     ****** Fonction Voir Arme
     *
     *****
     * @param pJoueur
     * @return Arme
     */
    public String voirArme(Warcraft pJoueur) {

        return pJoueur.Arme;

    }

    /**
     ***** Fonction voir le Nom d'un Joueur
     *
     ****
     * @param pJoueur
     * @return Nom
     */
    public String voirNom(Warcraft pJoueur) {

        return pJoueur.Nom;

    }

    /**
     ***** Fonction Changer le Nom du personnage
     *
     *****
     * @param pNewName Nouveau Nom
     * @return Le nouveau Nom pour Affichage
     */
    public String changerNom(String pNewName) {

        this.Nom = pNewName;

        return this.Nom;

    }

}
