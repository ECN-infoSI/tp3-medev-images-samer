package fr.centrale.medev.tp3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HistogramSaver {

    public static void saveHistogram(Image histogram, String filePath) {
        int width = 800;  // Largeur de l'image
        int height = 600; // Hauteur de l'image

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // Dessiner le histogramme sur le BufferedImage
        HistogramPanel panel = new HistogramPanel(histogram);
        panel.setSize(width, height);
        panel.paint(g2d); // Utiliser la méthode paint pour dessiner sur l'image
        g2d.dispose();

        // Sauvegarder l'image
        try {
            ImageIO.write(bufferedImage, "png", new File(filePath));
            System.out.println("Histogramme sauvegardé : " + filePath);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde de l'image : " + e.getMessage());
        }
    }
}