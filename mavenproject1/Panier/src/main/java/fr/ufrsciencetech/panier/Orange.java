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
public class Orange {
public double prix;
public String origine;

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setPrix(double prix) {
        if(prix > 0)
        {
            this.prix = prix;
        }
        else
        {
            System.out.println("Veuillez rentrer un prix positif");
        }
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

public Orange()
{
    this.prix = 0.0;
    this.origine = "";
}

public Orange(double p, String o)
{
    this.setPrix(p);
    this.setOrigine(o);
}

}
