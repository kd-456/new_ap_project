package com.example.ap_pro_ject;

import javafx.animation.AnimationTimer;
import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class stickhero extends stickgame implements move, Serializable {

    @FXML
    private int score;
    private int noofCherries;
    private int newscoreofchery;
    private int recentStrickheight;
    private boolean scoreupdated;
    private int firstplatformlength;
    private boolean mousePressed = false;
    @FXML
    private Rectangle firstrectangle;
    private List<Rectangle> platforms = new ArrayList<>();
    private Group root = new Group();
    private Random random = new Random();
    private Label cherriesscore ;
    private Line stick;
    private Stage stage;
    private Scene scene;
    //private Parent root;
    private int platformWidth = 100;
    private int platformHeight = 70;
    private double stickHeight = 0;
    private List<ImageView> cherries = new ArrayList<>();
    private List<Integer> noofcherriesRemvoed=new ArrayList<>();
    private int intialgap;
    private int currentX = 0;
    private int platformCount = 0;
    private Scene scene1;
    private double platformTopY;
    private double initialX;
    private boolean haswalked;
    private double initialY;
    private double finalX;
    private double finalY;
    private ImageView imageView;
    private ArrayList pillarheight;
    private Image image;
    private boolean stickrotate;
    private boolean hadupdatedStick;
    private int lowerbound;
    private int upperbound;
    private Map<Integer, Integer> pillarcountAndPillarheight = new HashMap<>();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNoofCherries() {
        return noofCherries;
    }

    public void setNoofCherries(int noofCherries) {
        this.noofCherries = noofCherries;
    }

    public int getNewscoreofchery() {
        return newscoreofchery;
    }

    public void setNewscoreofchery(int newscoreofchery) {
        this.newscoreofchery = newscoreofchery;
    }

    public int getRecentStrickheight() {
        return recentStrickheight;
    }

    public void setRecentStrickheight(int recentStrickheight) {
        this.recentStrickheight = recentStrickheight;
    }

    public boolean isScoreupdated() {
        return scoreupdated;
    }

    public void setScoreupdated(boolean scoreupdated) {
        this.scoreupdated = scoreupdated;
    }

    public int getFirstplatformlength() {
        return firstplatformlength;
    }

    public void setFirstplatformlength(int firstplatformlength) {
        this.firstplatformlength = firstplatformlength;
    }

    public boolean isMousePressed() {
        return mousePressed;
    }

    public void setMousePressed(boolean mousePressed) {
        this.mousePressed = mousePressed;
    }

    public Rectangle getFirstrectangle() {
        return firstrectangle;
    }

    public void setFirstrectangle(Rectangle firstrectangle) {
        this.firstrectangle = firstrectangle;
    }

    public List<Rectangle> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Rectangle> platforms) {
        this.platforms = platforms;
    }

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Label getCherriesscore() {
        return cherriesscore;
    }

    public void setCherriesscore(Label cherriesscore) {
        this.cherriesscore = cherriesscore;
    }

    public Line getStick() {
        return stick;
    }

    public void setStick(Line stick) {
        this.stick = stick;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getPlatformWidth() {
        return platformWidth;
    }

    public void setPlatformWidth(int platformWidth) {
        this.platformWidth = platformWidth;
    }

    public int getPlatformHeight() {
        return platformHeight;
    }

    public void setPlatformHeight(int platformHeight) {
        this.platformHeight = platformHeight;
    }

    public double getStickHeight() {
        return stickHeight;
    }

    public void setStickHeight(double stickHeight) {
        this.stickHeight = stickHeight;
    }

    public List<ImageView> getCherries() {
        return cherries;
    }

    public void setCherries(List<ImageView> cherries) {
        this.cherries = cherries;
    }

    public List<Integer> getNoofcherriesRemvoed() {
        return noofcherriesRemvoed;
    }

    public void setNoofcherriesRemvoed(List<Integer> noofcherriesRemvoed) {
        this.noofcherriesRemvoed = noofcherriesRemvoed;
    }

    public int getIntialgap() {
        return intialgap;
    }

    public void setIntialgap(int intialgap) {
        this.intialgap = intialgap;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(int platformCount) {
        this.platformCount = platformCount;
    }

    public Scene getScene1() {
        return scene1;
    }

    public void setScene1(Scene scene1) {
        this.scene1 = scene1;
    }

    public double getPlatformTopY() {
        return platformTopY;
    }

    public void setPlatformTopY(double platformTopY) {
        this.platformTopY = platformTopY;
    }

    public double getInitialX() {
        return initialX;
    }

    public void setInitialX(double initialX) {
        this.initialX = initialX;
    }

    public boolean isHaswalked() {
        return haswalked;
    }

    public void setHaswalked(boolean haswalked) {
        this.haswalked = haswalked;
    }

    public double getInitialY() {
        return initialY;
    }

    public void setInitialY(double initialY) {
        this.initialY = initialY;
    }

    public double getFinalX() {
        return finalX;
    }

    public void setFinalX(double finalX) {
        this.finalX = finalX;
    }

    public double getFinalY() {
        return finalY;
    }

    public void setFinalY(double finalY) {
        this.finalY = finalY;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ArrayList getPillarheight() {
        return pillarheight;
    }

    public void setPillarheight(ArrayList pillarheight) {
        this.pillarheight = pillarheight;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isStickrotate() {
        return stickrotate;
    }

    public void setStickrotate(boolean stickrotate) {
        this.stickrotate = stickrotate;
    }

    public boolean isHadupdatedStick() {
        return hadupdatedStick;
    }

    public void setHadupdatedStick(boolean hadupdatedStick) {
        this.hadupdatedStick = hadupdatedStick;
    }

    public int getLowerbound() {
        return lowerbound;
    }

    public void setLowerbound(int lowerbound) {
        this.lowerbound = lowerbound;
    }

    public int getUpperbound() {
        return upperbound;
    }

    public void setUpperbound(int upperbound) {
        this.upperbound = upperbound;
    }

    public Map<Integer, Integer> getPillarcountAndPillarheight() {
        return pillarcountAndPillarheight;
    }

    public void setPillarcountAndPillarheight(Map<Integer, Integer> pillarcountAndPillarheight) {
        this.pillarcountAndPillarheight = pillarcountAndPillarheight;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showplatforms(Stage primaryStage) {
        scene = new Scene(root, 1000, 500);
        primaryStage.setTitle("Stick Hero Platforms");
        primaryStage.setScene(scene);
        Image backgroundImage = new Image("result.png");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());
        root.getChildren().add(backgroundImageView);
        generateInitialPlatforms();
        stick = new Line();
        stick.setStrokeWidth(3);
        stick.setStroke(Color.BLACK);
        root.getChildren().add(stick);
        initialX = scene.getWidth() / 2;
        initialY = scene.getHeight() / 2;
        image = new Image("gz54zeiq-removebg-preview.png");
        imageView = new ImageView(image);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        imageView.setX(50);
        imageView.setY(380);
        root.getChildren().add(imageView);
        backgroundImageView.toBack();
        scene.setOnMousePressed(this::handleMousePressed);
        scene.setOnMouseReleased(this::handleMouseReleased);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                movePlatforms();
                if (mousePressed) {
                    stickHeight += 1;
                    updateStick();
                }
            }
        };
        timer.start();
        primaryStage.show();
    }

    private void handleMousePressed(javafx.scene.input.MouseEvent event) {
        if (!mousePressed) {
            initialX = firstplatformlength;
            initialY = scene.getHeight() - platformHeight;
            stick.setStartX(initialX);
            stick.setStartY(initialY);
            stick.setEndX(initialX);
            stick.setEndY(initialY);
            stickHeight = 0;
            mousePressed = true;
        }

    }

    private void handleMouseReleased(MouseEvent event) {
        if (mousePressed) {
            mousePressed = false;
            if (hadupdatedStick == true) {
                if (mousePressed == false) {
                    stick.getTransforms().add(new Rotate(90, initialX, initialY));
                    stickrotate = true;
                    // hadupdatedStick = false;
                }
            }
        }
    }

    private void updateStick() {
        finalX = stick.getStartX();
        finalY = stick.getStartY() - stickHeight;
        System.out.println(finalY);
        System.out.println(finalX);
        stick.setEndX(finalX);
        stick.setEndY(finalY);
        hadupdatedStick = true;
    }

    private void generateInitialPlatforms() {
        for (int i = 0; i < 5; i++) {
            int gap = 100;
            if (platformCount == 0) {
                firstplatformlength = 100;
                firstrectangle = new Rectangle(firstplatformlength, platformHeight, Color.BLACK);
                firstrectangle.setY(scene.getHeight() - platformHeight);
                platforms.add(firstrectangle);
                pillarcountAndPillarheight.put(platformCount, firstplatformlength);
                root.getChildren().add(firstrectangle);
                int cherryY = (int) (scene.getHeight() - platformHeight - Math.random() * 20 - 30);
                int cherryX = (int) (firstrectangle.getX() + firstrectangle.getWidth() / 2);
                callingcherryclass(cherryX, cherryY);
                platformCount++;
            }
            if (platformCount < 5 && platformCount != 0) {
                int platformLength = random.nextInt(100) + 50;
                Rectangle platform = new Rectangle(platformLength, platformHeight, Color.BLACK);
                platform.setY(scene.getHeight() - platformHeight);
                pillarcountAndPillarheight.put(platformCount,platformLength);
                platform.setX(currentX);
                platforms.add(platform);
                root.getChildren().add(platform);
                int cherryY = (int) (scene.getHeight() - platformHeight - Math.random() * 20 - 30);
                int cherryX = currentX + (int) (Math.random() * gap);
                callingcherryclass(cherryX, cherryY);

                currentX += platformLength + gap;
                platformCount++;
            }
        }
    }

    public void callingcherryclass(int cherryX, int cherryY) {
        cherry cherryClass = new cherry();
        cherryClass.addCherryImage(cherryX, cherryY, root, cherries, imageView); // Pass the ImageView instance
    }
    private void calbounds() {
        if (firstplatformlength == pillarcountAndPillarheight.get(1)) {
            intialgap = 100;
            lowerbound = intialgap;

        } else if (firstplatformlength < pillarcountAndPillarheight.get(1)) {
            intialgap = 100 + (pillarcountAndPillarheight.get(1) - firstplatformlength);
            lowerbound = intialgap;
        } else if (firstplatformlength > pillarcountAndPillarheight.get(1)) {
            intialgap = 100 - (firstplatformlength - pillarcountAndPillarheight.get(1));
            lowerbound = intialgap;

        }
    }
    private void continuegeneratingplatofrms() {
        generateInitialPlatforms();
    }

    private void movePlatforms() {
        for (Rectangle platform : platforms) {
            if (hadupdatedStick && !mousePressed) {
                if (stickrotate == true) {
                    double endingstick = finalY;
                    System.out.println(endingstick);
                    TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), imageView);
                    recentStrickheight = (int) (stickHeight + 15);
                    transition.setToX(stickHeight + 15);
                    haswalked = true;
                    forwardmovem();
                    transition.setOnFinished(event -> {
                        transition.stop();
                        //movePlatformsbackward();
                    });
                    transition.play();
                }
            }
        }
    }
@Override
    public void forwardmovem() {
        for (Rectangle platform : platforms) {
            Iterator<ImageView> iterator = cherries.iterator();
            while (iterator.hasNext()) {
                ImageView cherry = iterator.next();
                if (imageView.getBoundsInParent().intersects(cherry.getBoundsInParent())) {
                    scorebutton();
                    root.getChildren().remove(cherry);
                    noofCherries++;
                    noofcherriesRemvoed.add(noofCherries);
                    iterator.remove();
                    break;
                }
            }
            for (int i = 1; i < pillarcountAndPillarheight.size(); i++) {
                int currentpillar = pillarcountAndPillarheight.get(i);
                System.out.println(currentpillar);
                int nextpillarwidth = pillarcountAndPillarheight.get(i + 1);
                System.out.println(nextpillarwidth);
                if (recentStrickheight < (nextpillarwidth + intialgap)) {
                    checkifgameover();
                    return;
                }  else if (recentStrickheight > intialgap && recentStrickheight < (nextpillarwidth + intialgap)) {
                    int presentlenght = nextpillarwidth + intialgap - recentStrickheight;

                    TranslateTransition transition1 = new TranslateTransition(Duration.seconds(0.5), imageView);
                    transition1.setToX((presentlenght));
                    movePlatforms();
                    if (mousePressed) {
                        stickHeight += 1;
                        updateStick();
                    }
                    transition1.play();
                }
            }

        }
    }

    private void checkifgameover(){
        if (stickrotate==true){
            if(haswalked==true) {
                if(scoreupdated==true) {
                    gameover();
                }
            }
        }
    }

    private void scorebutton(){
        Label scoreLabel = new Label("");
        scoreLabel.setLayoutX(scene.getWidth() - 250);
        scoreLabel.setLayoutY(20);
        root.getChildren().add(scoreLabel);

        Button updateScoreButton = new Button("click: cherries score");
        updateScoreButton.setLayoutX(scene.getWidth() - 250);
        updateScoreButton.setLayoutY(50);
        updateScoreButton.setOnAction(e -> {
            newscoreofchery=Collections.max(noofcherriesRemvoed);
            scoreLabel.setText("score" + newscoreofchery);
            PauseTransition pause = new PauseTransition(Duration.seconds(2)); // 2 seconds delay
            pause.setOnFinished(event -> scoreupdated = true);
            pause.play();

        });
        root.getChildren().add(updateScoreButton);
    }
    private void gameover() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gameover.fxml"));
            Parent root = loader.load();
            Scene gameOverScene = new Scene(root);
            Stage primaryStage = (Stage) imageView.getScene().getWindow();
            primaryStage.setScene(gameOverScene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Stage primaryStage;
    public void switchToScene1phelewala(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void falling() {

        double fallDistance = imageView.getLayoutY() + 100;
        TranslateTransition fallTransition = new TranslateTransition(Duration.seconds(0.5), imageView);
        fallTransition.setToY(fallDistance);
        fallTransition.play();

    }
}

