package com.yanjie.assignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Assignment extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane border= new BorderPane();
        StackPane messagePane = new StackPane();

        Image bckImage = new Image(Assignment.class.getResource("game.png").toString());
        BackgroundSize backgroundSize = new BackgroundSize(
                BackgroundSize.AUTO,
                BackgroundSize.AUTO,
                false,
                false,
                true,
                true);
        BackgroundImage background = new BackgroundImage(
                bckImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);


        border.setBackground(new Background(background));

        messagePane.getChildren().addAll(gameName(),socialMedia(),menuBar());

        border.setTop(messagePane);

        border.setRight(messageBox());

        border.setCenter(selectionBarContainer());


        Scene scene = new Scene(border, 950, 700,Color.TRANSPARENT);
        stage.setTitle("GALAXY UNHEARD");
        stage.setScene(scene);
        stage.show();
    }

    public HBox gameName(){
        Text gameNameText = new Text("GALAXY " + "\nUNHEARD");
        HBox gameName=new HBox(gameNameText);

        gameNameText.setFill(Color.WHITE);
        gameNameText.setFont(Font.font("Georgia", 30));

        gameName.setAlignment(Pos.TOP_LEFT);
        gameName.setPadding(new Insets(10));

        return gameName;
    }
    public HBox menuBar () {
        MenuBar mBar=new MenuBar();
        mBar.setStyle("-fx-background-color: transparent;-fx-color: #000000;-fx-font-family: Arial; -fx-font-size: 14px;");

        HBox menuBarContainer = new HBox(mBar);
        menuBarContainer.setAlignment(Pos.TOP_CENTER);
        menuBarContainer.setPadding(new Insets(10));


        Image iconImage1 = new Image(Assignment.class.getResource("info.png").toString());
        ImageView iconImageView1 = new ImageView(iconImage1);
        iconImageView1.setFitWidth(16);
        iconImageView1.setFitHeight(16);

        Image iconImage2 = new Image(Assignment.class.getResource("tools.png").toString());
        ImageView iconImageView2 = new ImageView(iconImage2);
        iconImageView2.setFitWidth(16);
        iconImageView2.setFitHeight(16);

        Image iconImage3 = new Image(Assignment.class.getResource("app.png").toString());
        ImageView iconImageView3 = new ImageView(iconImage3);
        iconImageView3.setFitWidth(16);
        iconImageView3.setFitHeight(16);

        Menu menuMenu = new Menu("Menu");
        Menu docsMenu = new Menu("Docs");
        Menu whitepaperMenu = new Menu("Whitepaper");
        menuMenu.setStyle("-fx-text-fill: white;");

        MenuItem infoItem = new MenuItem("Info");
        infoItem.setGraphic(iconImageView1);

        MenuItem toolsItem = new MenuItem("Tool");
        toolsItem.setGraphic(iconImageView2);

        MenuItem appsItem = new MenuItem("Apps");
        appsItem.setGraphic(iconImageView3);

        menuMenu.getItems().addAll(infoItem, toolsItem,appsItem);



        mBar.getMenus().addAll(menuMenu, docsMenu, whitepaperMenu);


        return menuBarContainer;
    }
    public HBox socialMedia(){
        HBox socialMediaBox = new HBox(5);
        socialMediaBox.setAlignment(Pos.TOP_RIGHT);
        socialMediaBox.setPadding(new Insets(10));

        Image facebookIcon = new Image(Assignment.class.getResource("facebook_icon.png").toString());
        ImageView facebookImageView = new ImageView(facebookIcon);
        facebookImageView.setFitWidth(30);
        facebookImageView.setFitHeight(30);

        Image twitterIcon = new Image(Assignment.class.getResource("twitter_icon.png").toString());
        ImageView twitterImageView = new ImageView(twitterIcon);
        twitterImageView.setFitWidth(30);
        twitterImageView.setFitHeight(30);

        Image instagramIcon = new Image(Assignment.class.getResource("insta_icon.png").toString());
        ImageView instagramImageView = new ImageView(instagramIcon);
        instagramImageView.setFitWidth(30);
        instagramImageView.setFitHeight(30);

        socialMediaBox.getChildren().addAll(facebookImageView, twitterImageView, instagramImageView);

        return socialMediaBox;
    }
    public VBox messageBox(){
        VBox messageBox = new VBox(15); // Set the spacing between the heading and message
        messageBox.setPadding(new Insets(0,0,0,35));
        messageBox.setSpacing(10);
        messageBox.setAlignment(Pos.CENTER_LEFT);


        Label gameTitle = new Label("Mystery.Detective." +
                "\nRPG.Simulation.");
        gameTitle.setTextFill(Color.WHITE);
        gameTitle.setFont(Font.font("Georgia",FontWeight.BOLD,50));


        Label gameDiscript = new Label("If there is a technology that can collect voices from the scene of the crime," +
                "\nit can easily find out who is behind the scenes and solve the mysterious case. " +
                "\nHowever, reasoning with sound is far more difficult than imagined. " +
                "\nTo this end, we are looking for a suitable user for the system - \"Sound Detector\"! " +
                "\nPlease go back to the scene of the crime," +
                "\nuse your voice to track everyone's actions, " +
                "\nand tell us whether there is an ultimate secret" +
                "\nhidden under these seemingly unrelated cases.\n\n\n");
        gameDiscript.setTextFill(Color.WHITE);
        gameDiscript.setFont(Font.font("Verdana",FontPosture.ITALIC,12));


        Button btnPlay=new Button("Play");
        btnPlay.setFont(Font.font("Arial", 16));
        btnPlay.setStyle("-fx-pref-width: 120px; -fx-pref-height: 40px;bold;-fx-background-radius: 30;-fx-border-radius: 30;-fx-font-weight: bold;-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #FF9692, #99CCFF);-fx-border-color: white;");


        messageBox.getChildren().addAll(gameTitle,gameDiscript,btnPlay );

        return messageBox;
    }
    public VBox selectionBarContainer (){
        VBox vb = new VBox(10);
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(10));


        Button singlePlayer = new Button("SINGLE PLAYER");
        singlePlayer.setPrefHeight(50);
        singlePlayer.setPrefWidth(180);
        singlePlayer.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-color: #000000;-fx-border-color: white;-fx-font-weight: bold;-fx-background-radius: 10;-fx-border-radius: 10;");


        Button multiPlayer = new Button("MULTIPLAYER");
        multiPlayer.setPrefHeight(50);
        multiPlayer.setPrefWidth(180);
        multiPlayer.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-color: #000000;-fx-border-color: white;-fx-font-weight: bold;-fx-background-radius: 10;-fx-border-radius: 10;");


        Button addition = new Button("ADDITIONAL CONTENT");
        addition.setPrefHeight(50);
        addition.setPrefWidth(180);
        addition.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-color: #000000;-fx-border-color: white;-fx-font-weight: bold;-fx-background-radius: 10;-fx-border-radius: 10;");


        Button tutorial = new Button("TUTORIAL");
        tutorial.setPrefHeight(50);
        tutorial.setPrefWidth(180);
        tutorial.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);-fx-color: #000000;-fx-border-color: white;-fx-font-weight: bold;-fx-background-radius: 10;-fx-border-radius: 10;");


        vb.getChildren().addAll(singlePlayer,multiPlayer,addition,tutorial);

        return vb;
    }

    public static void main(String[] args) {
        launch();
    }
}