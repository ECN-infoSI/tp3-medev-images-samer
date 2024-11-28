package fr.centrale.medev.tp3;


import javax.swing.*;
import fr.centrale.medev.tp3.Image;

/**
 *
 * @author Samer & Fernando & Larissa
 */
public class MedevTP3 {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            GUI fenetre = new GUI();
            fenetre.setVisible(true);
        }); 
    }
}

//ocurrence:
// comparaison par histogramme:
//nb de pixels 
