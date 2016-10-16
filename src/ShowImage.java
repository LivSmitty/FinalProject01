import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by scott_000 on 10/15/2016.
 */

public class ShowImage extends Application {
    public void start(Stage primaryStage){
        //Create pane
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.autosize();

        //show image
        ImageView imageView2 = new ImageView("http://b-i.forbesimg.com/darrenheitner/files/2013/08/nfl.jpg");
        imageView2.setFitWidth(400);
        imageView2.setFitHeight(400);
        pane.getChildren().add(imageView2);

        //Create button
        Button btSTART = new Button("START");
        btSTART.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btSTART);



        //create scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("NFL Draft 2017");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
