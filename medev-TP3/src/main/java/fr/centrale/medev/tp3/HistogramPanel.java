package fr.centrale.medev.tp3;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class HistogramPanel extends JPanel {

    private final int[] occurrences;
    private final int maxOccurrence;

    public HistogramPanel(Image histogram) {
        this.occurrences = histogram.getListeOccurenceGris();
        this.maxOccurrence = histogram.getLongueur();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dimensiones del panel
        int width = getWidth();
        int height = getHeight();

        // Validar datos
        if (occurrences == null || occurrences.length == 0) {
            g.setColor(Color.RED);
            g.drawString("Aucun donnée à afficher", width / 2 - 50, height / 2);
            return;
        }

        // Dimensiones de las barras
        int barWidth = Math.max(1, width / occurrences.length);

        // Dibujar cada barra
        for (int i = 0; i < occurrences.length; i++) {
            int barHeight = (int) ((double) occurrences[i] / maxOccurrence * height);
            g.setColor(new Color(i, i, i)); // Color basado en el nivel de gris
            g.fillRect(i * barWidth, height - barHeight, barWidth, barHeight);
        }
    }

    // Convertir le histogramme en BufferedImage
    public BufferedImage toBufferedImage(int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        this.setSize(width, height);
        this.paint(g2d); // Dibujar el histograma en el BufferedImage
        g2d.dispose();
        return image;
    }

}
