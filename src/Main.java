import model.Barbare;
import model.Pekka;
import model.Sorcier;
import model.Troupe;
import view.Affichage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans FreeFight !");
        // Lancement de l'affichage
        List<Troupe> troupes = new ArrayList<>();
        troupes.add(new Barbare(50, 500));
        troupes.add(new Sorcier(120, 500));
        troupes.add(new Pekka(190, 500));

        new Affichage(troupes);
    }
        
}
