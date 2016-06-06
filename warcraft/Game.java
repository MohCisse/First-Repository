/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraft;

/**
 *
 * @author formation
 */
public class Game {

    public static void main(String[] args) {

        Warcraft Bouboulover = new Warcraft("Mage", "Bernard", "Homme", "Orc");
        Warcraft LyinKing = new Warcraft("Guerrier", "Josiane", "Femme", "Humain");
        Warcraft Burt = new Warcraft("Druide", "Cunegonde", "Femme", "Elfe");

        System.out.println("Les points de vie de Bouboulover : " + Bouboulover.voirPointsDeVie());

        System.out.println("Les points de vie de LyinKing : " + Burt.voirPointsDeVie());

        System.out.println("Les nouveaux points de vie de LyinKing : " + Burt.Attaquer(LyinKing));

        System.out.println("Les nouveaux points de vie de LyinKing : " + Burt.Attaquer(LyinKing));

        System.out.println("Les nouveaux points de vie de LyinKing après soins : " + LyinKing.Soigner());

    }

}
