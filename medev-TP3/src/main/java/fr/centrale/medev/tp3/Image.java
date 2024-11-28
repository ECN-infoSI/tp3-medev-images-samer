package fr.centrale.medev.tp3;
import java.util.ArrayList;

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
    private ArrayList<int> pixels;
    private int valeurMaxGris;
    private int[] listeOccurenceGris;
    
    // Constructeur
    /**
     * 
     * @param largeur
     * @param longueur
     * @param pixels
     * @param valeurMaxGris
     * @param listeOccurenceGris 
     */
    public Image(int largeur, int longueur, ArrayList<int> pixels, int valeurMaxGris, int[] listeOccurenceGris) {
        this.largeur = largeur;
        this.longueur = longueur;
        this.pixels = pixels;
        this.valeurMaxGris = valeurMaxGris;
        this.listeOccurenceGris = listeOccurenceGris;
    }
    
    
    public Image(){
       super(0,0, null, 0, null); 
    }
    
    //Methods
    public void lecturePGM(String chemin){
        PGMIO image = new PGMIO();
        image.read(chemin);
    }
    
    public void compterOccurenceGris(){
        
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

    public ArrayList<<any>> getPixels() {
        return pixels;
    }

    public void setPixels(ArrayList<<any>> pixels) {
        this.pixels = pixels;
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
    
    //toString

    @Override
    public String toString() {
        return "Image{" + "largeur=" + largeur + ", longueur=" + longueur + ", pixels=" + pixels + ", valeurMaxGris=" + valeurMaxGris + ", listeOccurenceGris=" + listeOccurenceGris + '}';
    }
    
    
    
}
