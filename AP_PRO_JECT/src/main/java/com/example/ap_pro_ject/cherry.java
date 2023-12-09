package com.example.ap_pro_ject;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class cherry {
    private List<ImageView> cherries = new ArrayList<>();
    private ImageView imageView;

    public List<ImageView> getCherries() {
        return cherries;
    }

    public void setCherries(List<ImageView> cherries) {
        this.cherries = cherries;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void addCherryImage(int x, int y, Group root, List<ImageView> cherries, ImageView imageView) {
        Image cherry = new Image("img_1-removebg-preview.png");
        ImageView imageViewcherries = new ImageView(cherry);
        imageViewcherries.setFitWidth(20);
        imageViewcherries.setFitHeight(20);
        imageViewcherries.setX(x);
        imageViewcherries.setY(y);
        root.getChildren().add(imageViewcherries);
        cherries.add(imageViewcherries);
    }
}
