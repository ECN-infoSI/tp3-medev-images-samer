package fr.centrale.medev.tp3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {

    String cheminAcces = null;

    public GUI() {
        setTitle("Interface avec Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Créer un panneau
        JPanel panneau = new JPanel();
        panneau.setLayout(new FlowLayout()); // Layout simple

        // Création du bouton pour choisir un fichier PGM local
        JButton bouton = new JButton("Choisir un fichier");

        // Ajouter une action au bouton
        bouton.addActionListener((ActionEvent e) -> {
            // Créer le sélecteur de fichier
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Sélectionnez un fichier PGM");
            // Ajouter un filtre pour les fichiers .pgm
            FileNameExtensionFilter filtre = new FileNameExtensionFilter("Fichiers PGM", "pgm");
            fileChooser.setFileFilter(filtre);
            // Afficher le dialogue de sélection
            int resultat = fileChooser.showOpenDialog(GUI.this);
            // Vérifier si l'utilisateur a sélectionné un fichier
            if (resultat == JFileChooser.APPROVE_OPTION) {
                File fichier = fileChooser.getSelectedFile();
                cheminAcces = fichier.getAbsolutePath();
                // Vérifier si le fichier a l'extension correcte
                if (cheminAcces.endsWith(".pgm")) {
                    Image image = new Image();
                    image.lecturePGM(cheminAcces);
                    JOptionPane.showMessageDialog(GUI.this, "Fichier lu avec succès : " + cheminAcces, "Succès", JOptionPane.INFORMATION_MESSAGE);
                    // Mostrar GUI_traitements y ocultar GUI
                    setVisible(false); // Ocultar GUI
                    GUI_traitements fenetreTraitements = new GUI_traitements(image, GUI.this);
                    fenetreTraitements.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(GUI.this, "Le fichier sélectionné n'est pas un fichier PGM.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(GUI.this, "Aucun fichier sélectionné", "Information", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Ajouter le bouton au panneau principal
        panneau.add(bouton);

        // Ajouter le panneau à la fenêtre principale
        add(panneau, BorderLayout.CENTER);
    }
}
