package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Barracks extends Building {
    private ImageView imageView;

    public Barracks() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL,Values.BARRACKS_SCORE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Barracks.png").toString()));
    }
    public Barracks(double size) {
        this();
        getImageView(size);

    }

    @Override
    public ImageView getImageView(double size) {
        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }


}
