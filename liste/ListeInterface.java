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
public interface ListeInterface {
    
    public ArrayList<Element> Trier(ArrayList<Element> pListe);
    
    public String Next(String ToSearch);
    
    public String PremierElement();
    
}
