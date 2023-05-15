package com.example.partie1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;


public class Exo2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Permet le déplacement, mais pas le redimensionnement
        primaryStage.setResizable(false);

        // Création du conteneur principal
        GridPane Gp = new GridPane();
        Gp.setGridLinesVisible(true);

        //Labels et tableau
        Label case1 = new Label();
        Label case2 = new Label();
        Label case3 = new Label();
        Label case4 = new Label();
        Label case5 = new Label();
        Label case6 = new Label();
        Label case7 = new Label();
        Label case8 = new Label();
        Label case9 = new Label();
        Label[] tab = {case1, case2, case3, case4, case5, case6, case7, case8, case9};

        Gp.add(case1, 0, 0); //colonne, ligne = (0, 0)
        Gp.add(case2, 0, 1);
        Gp.add(case3, 0, 2);
        Gp.add(case4, 1, 0);
        Gp.add(case5, 1, 1);
        Gp.add(case6, 1, 2);
        Gp.add(case7, 2, 0);
        Gp.add(case8, 2, 1);
        Gp.add(case9, 2, 2);

        // Chargement de l'image
        Image CCroix = new Image(Exo2.class.getResource("Croix.png").toString());
        Image RRond = new Image(Exo2.class.getResource("Rond.png").toString());
        Image VVide = new Image(Exo2.class.getResource("Vide.png").toString());


        //Génération random
        for (int i = 0; i < 9; ++i) {
            Random random = new Random();
            int nombre = random.nextInt(3);
            ImageView Croix = new ImageView();
            Croix.setImage(CCroix);
            ImageView Rond = new ImageView();
            Rond.setImage(RRond);
            ImageView Vide = new ImageView();
            Vide.setImage(VVide);
            switch (nombre) {
                case 1:
                    tab[i].setGraphic(Croix);
                    break;
                case 2:
                    tab[i].setGraphic(Rond);
                    break;
                case 3:
                    tab[i].setGraphic(Vide);
                    break;
            }
        }
        //AFFICHAGE
        //gp.getchildren
        // Ajout du conteneur à la scene
        Scene scene = new Scene(Gp);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}
