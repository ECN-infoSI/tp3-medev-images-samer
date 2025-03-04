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
    /**
     * Fait la lecture d'une image et mets à jour les attributs largeur, longuer et maxValeurGris
     * @param chemin : chemin absolu de l'image
     */
    public void lecturePGM(String chemin){
         File imgFile = new File(chemin);
         
        try {
           this.image =  PGMIO.read(imgFile);
        } catch (IOException ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
       }
       
        try {
           int[] attributes = PGMIO.getAttributes(imgFile);
           
           this.longueur = attributes[0];
           this.largeur = attributes[1];
           this.valeurMaxGris = attributes[2];
           
        } catch (IOException ex) {
            ex.printStackTrace();
       }
       
    }
    
    /**
     * Compte l'occurence de chaque ton de gris et l'ajoute
     * dans l'array listeOccurrenceGris dans la position respective.
     * Par exemple: le nombre d'occurences de blanc est stocké dans 
     * listeOccurenceGris[0]
     */
    public void compterOccurenceGris(){
        for (int i = 0; i<this.image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                listeOccurenceGris[image[i][j]] += 1;
            }
        }
        
    }
    
    /**
     *
     * @param chemin
     */
    public void ecriturePGM(String chemin){
        
    }

    
    //Getters and Setters

    /**
     *
     * @return
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     *
     * @param largeur
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     *
     * @return
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     *
     * @param longueur
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     *
     * @return
     */
    public int[][] getImage() {
        return image;
    }

    /**
     *
     * @param image
     */
    public void setImage(int[][] image) {
        this.image = image;
    }

    /**
     *
     * @return
     */
    public int getValeurMaxGris() {
        return valeurMaxGris;
    }

    /**
     *
     * @param valeurMaxGris
     */
    public void setValeurMaxGris(int valeurMaxGris) {
        this.valeurMaxGris = valeurMaxGris;
    }

    /**
     *
     * @return
     */
    public int[] getListeOccurenceGris() {
        return listeOccurenceGris;
    }

    /**
     *
     * @param listeOccurenceGris
     */
    public void setListeOccurenceGris(int[] listeOccurenceGris) {
        this.listeOccurenceGris = listeOccurenceGris;
    }
    
    //Print results

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return "Image{" + "largeur=" + largeur + ", longueur=" + longueur +  ", valeurMaxGris=" + valeurMaxGris + '}';
    }
    
    /**
     *
     */
    public void affiche(){
        System.out.println(toString());
        
        
        
    }
    
    
    
}
