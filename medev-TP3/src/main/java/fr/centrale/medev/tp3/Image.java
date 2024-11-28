package fr.centrale.medev.tp3;
import java.io.File;  // Import the File class
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Larissa
 */
public class Image {
    private int largeur;
    private int longueur;
    private int[][] image;
    private int valeurMaxGris;
    private int[] listeOccurenceGris;
    
    /**
     * Constructeur
     */
    public Image() {
        this.largeur = 0; 
        this.longueur = 0;
        this.valeurMaxGris = 0;
        this.listeOccurenceGris = new int[256];
    }
    
    //Methods
    public void lecturePGM(String chemin){
         File imgFile = new File(chemin);
         
        try {
           this.image =  PGMIO.read(imgFile);
        } catch (IOException ex) {
       }
        
    }
    
    /**
     * Compte l'occurence de chaque ton de gris et l'ajoute
     * dans l'array listeOccurrenceGris dans la position respective.
     * Par exemple: le nombre d'occurences de blanc est stocké dans 
     * listeOccurenceGris[0]
     */
    public void compterOccurenceGris(){
        for (int[] image1 : this.image) {
            for (int j = 0; j < image1.length; j++) {
                listeOccurenceGris[image1[j]] += 1;
            }
        }
        
    }
    
    public void ecriturePGM(String chemin){
        
    }

    
    //Getters and Setters
    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int[][] getImage() {
        return image;
    }

    public void setImage(int[][] image) {
        this.image = image;
    }


    public int getValeurMaxGris() {
        return valeurMaxGris;
    }

    public void setValeurMaxGris(int valeurMaxGris) {
        this.valeurMaxGris = valeurMaxGris;
    }

    public int[] getListeOccurenceGris() {
        return listeOccurenceGris;
    }

    public void setListeOccurenceGris(int[] listeOccurenceGris) {
        this.listeOccurenceGris = listeOccurenceGris;
    }

    @Override
    public String toString() {
        return "Image{" + "largeur=" + largeur + ", longueur=" + longueur +  ", valeurMaxGris=" + valeurMaxGris + '}';
    }
    
    
    
}
