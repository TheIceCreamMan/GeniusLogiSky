/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencetech.panier;

/**
 *
 * @author jm274343
 */
public class Panier {
    public java.util.ArrayList<Orange> listeOrange;
    int tailleMax;
    
    public Panier()
    {
        listeOrange = new java.util.ArrayList<Orange>();
        tailleMax = 10;
    }
    
    public boolean estVide()
    {
        return listeOrange.isEmpty();
    }
    
    public boolean estPlein()
    {
        return listeOrange.size()==tailleMax;
    }
    
    public String ToString()
    {
        String s = "";
        s+="Prix : "+listeOrange                                                     
    }
    
}
