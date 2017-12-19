package ch.ucreek;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Hansfreddy on 28.03.2016.
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
//        Image IMAGE = new Image(this.getClass().getResource("map_clippy.png").toString());

        final ImageView imageView = new ImageView();
        Clippy clippy = new Clippy(imageView);
        Animation animation = clippy.atom();


        Scene scene = new Scene(new Group(imageView));
        scene.setFill(null);

        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();
        //animation.setCycleCount(1);
        animation.play();
        //primaryStage.hide();
    }
}