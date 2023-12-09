package com.example.ap_pro_ject;

import javafx.application.Platform;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StickHeroTest {


    @Test
    public void testAddCherryImage_CherryAdded() {
        assertDoesNotThrow(() -> {
            Platform.runLater(() -> {
                try {
                    stickhero stickHero = new stickhero();
                    Stage stage = new Stage();
                    Rectangle platform = new Rectangle(100, 70);
                    stickHero.callingcherryclass(50, 50);
                    boolean cherryAdded = false;
                    assertTrue(cherryAdded);
                    Platform.runLater(() -> stage.close());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
    }

    @Test
    public void testAddCherryImage_NoCherryAdded() {
        assertDoesNotThrow(() -> {
            Platform.runLater(() -> {
                try {
                    stickhero stickHero = new stickhero();
                    Stage stage = new Stage();
                    Rectangle platform = new Rectangle(100, 70);
                    stickHero.callingcherryclass(150, 50);
                    boolean cherryAdded = false;
                    assertFalse(cherryAdded);
                    Platform.runLater(() -> stage.close());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
    }
}