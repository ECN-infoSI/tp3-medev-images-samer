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
        Image histogram = new Image();
        int[] listOccurenceGris = image.getListeOccurenceGris();
        // Calculer le nb maximum d'occurence pour une valuer donnée de niveua de gris
        int maxOccurence = listOccurenceGris[0]; 
        for (int i = 1; i < listOccurenceGris.length; i++) {
            if (listOccurenceGris[i] > maxOccurence) {
                maxOccurence = listOccurenceGris[i];
        }
        int maxValuerGris = image.getValeurMaxGris();
        
        histogram.SetLongeur(maxOccurence);
        histogram.SetLargeur(maxValeurGris);
        int[][] histogramPixels;
        for (int j=0;j <= histogram.getLargeur();j++){ // j = valeur de gris
            for (int k=0;k <= histogram.getLongeur();k++){
                int nbOccurence = listOccurenceGris[j];
                if (nbOccurence > 0) {
                    histogramPixels[k][j] = 255;
                    nbOccurence--;
                }
                else {
                    histogramPixels[k][j] = 0;
                }
            }
        }
        histogram.setImage(histogramPixels);
    }
      return histogram;  
    }
    
    public Image seuillage(Image image, int seuil){
        Image imageBinaire = new Image(image);
        int[][] pixels = image.getImage();
        for (int i=0;i<pixels.length;i++){
            for (int j=0;j<pixels[0].length;j++){
                if (pixels[i][j] <= seuil){
                    pixels[i][j] = 255;
                }
                else {
                    pixels[i][j] = 0;
                }
            }
        }
        imageBinaire.setImage(pixels);
        
        return imageBinaire;      
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
