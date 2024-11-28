package fr.centrale.medev.tp3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class HistogramImageViewer extends JFrame {

    public HistogramImageViewer(BufferedImage image) {
        setTitle("Visualisation du Histogramme");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fermer uniquement cette fenêtre
        setLocationRelativeTo(null);

        // Vérifier que l'image n'est pas nulle
        if (image == null) {
            System.err.println("L'image du histogramme est nulle.");
            return;
        }

        // Ajouter un panneau pour afficher l'image
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        add(imageLabel, BorderLayout.CENTER);
    }
}
