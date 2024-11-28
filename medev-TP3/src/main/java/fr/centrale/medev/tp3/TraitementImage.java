/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp3;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author samer
 */
public class TraitementImage {
    public TraitementImage(){
    }
    
    public Image genererHistogramme(Image image){
        int longeurIMG = image.getLongeur();
        int largeurIMG = image.getLargeur();
        Image histogram = new Image();
        histogram.setLongeur(256);
        ArrayList<Integer> pixels = image.getPixels();
        int nbPixels = pixels.size();
        int[] listOccurenceGris = image.getListeOccurenceGris();
        int max = listOccurenceGris[0]; // Assume the first element is the largest initially
        for (int i = 1; i < listOccurenceGris.length; i++) {
            if (listOccurenceGris[i] > max) {
                max = listOccurenceGris[i];
        }
        histogram.SetLargeur(max);
        histogram.SetLongeur(image.getValeurMaxGris()+1);
           
    }
      return null;  
    }
    
    public Image seuillage(Image image){
        return null;      
    }
    
    public int[] comparaison(Image image1, Image image2){
        return null;
    }
    
    public Image agrandir(Image image,int facteur){
        return null;
    }
    
    public Image reduire(Image image,int facteur){
        return null;
    }
}
