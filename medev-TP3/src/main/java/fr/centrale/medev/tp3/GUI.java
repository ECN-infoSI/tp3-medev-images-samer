/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Fernando ROJAS
 */
public class GUI extends JFrame {
    public GUI() {
        setTitle("Interface avec Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Créer un panneau
        JPanel panneau = new JPanel();
        panneau.setLayout(new FlowLayout()); // Layout simple

        // Création du bouton pour choisir un fichier PMG local
        JButton bouton = new JButton("Choisir un fichier");
        
        // Ajouter une action au bouton
        bouton.addActionListener(e -> {
            // Créer le sélecteur de fichier
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Sélectionnez un fichier PGM");

            // Ajouter un filtre pour les fichiers .pgm
            FileNameExtensionFilter filtre = new FileNameExtensionFilter("Fichiers PGM", "pgm");
            fileChooser.setFileFilter(filtre);

            // Afficher le dialogue de sélection
            int resultat = fileChooser.showOpenDialog(this);
            
            // Vérifier si l'utilisateur a sélectionné un fichier
            if (resultat == JFileChooser.APPROVE_OPTION) {
                File fichier = fileChooser.getSelectedFile();
                String cheminAcces = fichier.getAbsolutePath();

                // Vérifier si le fichier a l'extension correcte
                if (cheminAcces.endsWith(".pgm")) {
                    JOptionPane.showMessageDialog(this, 
                        "Fichier sélectionné :\n" + cheminAcces, 
                        "Chemin du fichier", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, 
                        "Le fichier sélectionné n'est pas un fichier PGM.", 
                        "Erreur", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Aucun fichier sélectionné", 
                    "Information", 
                    JOptionPane.WARNING_MESSAGE);
            }
        });
        
        // Ajouter le bouton à la fenêtre
        add(bouton, BorderLayout.CENTER);
        
        
        
}
}