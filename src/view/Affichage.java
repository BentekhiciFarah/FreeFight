package view;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import model.*;

public class Affichage extends JPanel {

    private List<Troupe> troupes;

    private Image barbareImg;
    private Image sorcierImg;
    private Image pekkaImg;

    public Affichage(List<Troupe> troupes) {
        this.troupes = troupes;
        setBackground(new Color(34,139,34)); // vert terrain

        barbareImg = new ImageIcon("img/barbare.png").getImage();
        sorcierImg = new ImageIcon("img/sorcier.png").getImage();
        pekkaImg = new ImageIcon("img/pekka.png").getImage();
    }

    // Affiche les troupes et les éléments du jeu
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessine la bare en bas de l'écran
        g.setColor(new Color(50, 50, 50));
        g.fillRect(0, getHeight() - 100, getWidth(), 100);

        // Dessine les troupes
        drawAvatars(g);
    }

    private void drawAvatars(Graphics g) {

        int avatarSize = 50;         
        int spacing = 120;
        int totalWidth = spacing * 2;
        int startX = (getWidth() - totalWidth) / 2;
        int y = getHeight() - 80;     // Affichage en bas de l'écran

        // Barbare
        g.drawImage(barbareImg, startX, y, avatarSize, avatarSize, this);
        g.drawString("Barbare", startX, y - 5);

        // Sorcier
        g.drawImage(sorcierImg, startX + spacing, y, avatarSize, avatarSize, this);
        g.drawString("Sorcier", startX + spacing, y - 5);

        // Pekka
        g.drawImage(pekkaImg, startX + spacing * 2, y, avatarSize, avatarSize, this);
        g.drawString("Pekka", startX + spacing * 2, y - 5);
    }
}