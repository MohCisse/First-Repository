/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intapp;

import java.util.ArrayList;

/**
 *
 * @author formation
 */
public class Liste implements ListeInterface {

    private ArrayList<Element> MaListe;
    private int i = 0;

//CONSTRUCTEUR
    public Liste() {
        this.MaListe = new ArrayList<>();
    }

//FONCTION ADD
    public void Add(String ToAdd) {
        i++;
        Element Rand = new Element(ToAdd, i);
        Rand.setElement(ToAdd);
        MaListe.add(Rand);
    }

//FONCTION SUPPRESSION
    public void Remove(String ToRemove) {
        int index = 0;
        for (Element x : MaListe) {
            if (x.Element.equals(ToRemove)) {
                index = MaListe.indexOf(x);
                break;
            }
        }
        MaListe.remove(index);
        i--;
    }

//FONCTIONS DE L'INTERFACE
    @Override
    public ArrayList<Element> Trier(ArrayList<Element> pListe) {

        Integer k, j, min;
        Element temp1, temp2;
        for (k = 0; k < pListe.size(); k++) {
            min = k;
            for (j = k; j < pListe.size(); j++) {
                if (pListe.get(min).Element.compareTo(pListe.get(j).Element) > 0) {
                    min = j;
                }
            }
            temp1 = pListe.get(k);
            temp1.Next = min + 1;
            temp2 = pListe.get(min);
            temp2.Next = k + 1;
            pListe.set(k, temp2);
            pListe.set(min, temp1);
        }
        return pListe;
    }

    @Override
    public String Next(String ToSearch) {
        int index = 0;
        for (Element x : MaListe) {
            if (x.Element.equals(ToSearch)) {
                index = x.Next;
                break;
            }
        }
        Element Tampon = (Element) MaListe.get(index);
        return Tampon.Element;
    }

    @Override
    public String PremierElement() {
        Element Tampon = (Element) MaListe.get(0);
        return Tampon.Element;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Liste Test = new Liste();

        Test.Add("Bonjour");
        Test.Add("Je");
        Test.Add("m'appelle");
        Test.Add("Momo");
        Test.Add("Cissé");

        for (int i = 0; i < Test.MaListe.size(); i++) {

            Element Tampon = Test.MaListe.get(i);
            System.out.println("donnée à l'indice " + i + " = " + Tampon.Element);
        }

        System.out.println("/*****************************************************************/");

        System.out.println("Premier Element de la liste : " + Test.PremierElement());

        System.out.println("/*****************************************************************/");

        System.out.println("Element de la liste situé après 'Je' : " + Test.Next("Je"));

        System.out.println("/*****************************************************************/");

        System.out.println("Trions ce Tableau par Ordre Alphabétique");

        System.out.println("/*****************************************************************/");
        
        Test.MaListe = Test.Trier(Test.MaListe);

        for (int i = 0; i < Test.MaListe.size(); i++) {

            Element Tampon = Test.MaListe.get(i);
            System.out.println("donnée à l'indice " + i + " = " + Tampon.Element);
        }

        System.out.println("/*****************************************************************/");

        System.out.println("Element de la liste situé après 'Je' : " + Test.Next("Je"));

        System.out.println("/*****************************************************************/");

        Test.Remove("Momo");

        for (int i = 0; i < Test.MaListe.size(); i++) {

            Element Tampon = Test.MaListe.get(i);
            System.out.println("donnée à l'indice " + i + " = " + Tampon.Element);
        }
    }

}
