/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.centrale.medev.tp3;

/**
 *
 * @author samer
 */
public class MedevTP3 {

    public static void main(String[] args) {
        System.out.println("Init");
        
       Image image1 = new Image();
       image1.lecturePGM("./ImagesTestPGM/baboon.pgm");
       image1.compterOccurenceGris();
       
       image1.affiche();
             
        
    }
}

//ocurrence:
// comparaison par histogramme:
//nb de pixels 