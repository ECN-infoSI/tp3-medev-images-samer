package fr.centrale.medev.tp3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class GUI_traitements extends JFrame {

    private final GUI fenetrePrincipale; // Référence à la fenêtre principale

    public GUI_traitements(Image image, GUI fenetrePrincipale) {
        this.fenetrePrincipale = fenetrePrincipale; // Stocker la référence
        setTitle("Traitements d'image");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        TraitementImage traitement = new TraitementImage(); // Classe pour les traitements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10)); // Disposition verticale

        JLabel label = new JLabel("Image chargée. Choisissez un traitement.");
        JButton boutonHistogramme = new JButton("Générer Histogramme");
        JButton boutonSeuillage = new JButton("Appliquer Seuillage");
        JButton boutonRetour = new JButton("Retour");

        // Action pour générer un histogramme
        boutonHistogramme.addActionListener(e -> {
            Image histogram = traitement.genererHistogramme(image);
            JOptionPane.showMessageDialog(this,
                    "Histogramme généré avec succès!",
                    "Traitement",
                    JOptionPane.INFORMATION_MESSAGE);
            // Générer une image BufferedImage du histogramme
            HistogramPanel panelHistogramme = new HistogramPanel(histogram);
            BufferedImage bufferedImage = panelHistogramme.toBufferedImage(800, 600);

            // Ouvrir une nouvelle fenêtre pour afficher le histogramme
            HistogramImageViewer viewer = new HistogramImageViewer(bufferedImage);
            viewer.setVisible(true); // Afficher la fenêtre du histogramme
        });

        // Action pour le seuillage
        boutonSeuillage.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Le seuillage est en cours de développement.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        // Action pour revenir à GUI
        boutonRetour.addActionListener(e -> {
            fenetrePrincipale.setVisible(true); // Réafficher GUI principale
            dispose(); // Fermer GUI_traitements
        });

        panel.add(label);
        panel.add(boutonHistogramme);
        panel.add(boutonSeuillage);
        panel.add(boutonRetour);

        add(panel);
    }
}
