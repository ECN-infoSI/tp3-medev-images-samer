/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.centrale.medev.tp3;

/**
 *
 * @author samer
 */
public class MedevTP3 {

    /**
     * Fonction principale
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Init");
        
       Image image1 = new Image();
       image1.lecturePGM("C:\\Users\\User\\Documents\\INFOSI\\MEDEV\\tp3-medev-images-samer\\medev-TP3\\src\\main\\java\\fr\\centrale\\medev\\tp3\\ImagesTestPGM/baboon.pgm");
       image1.compterOccurenceGris();
       
       image1.affiche();
             
        
    }
}