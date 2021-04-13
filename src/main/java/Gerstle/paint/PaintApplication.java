package Gerstle.paint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class PaintApplication extends Application
{
    @Override
    public void  start(Stage stage) throws Exception
    {
        PaintController controller = new PaintController();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paint_application.fxml"));
        loader.setController(controller);

        Scene scene = new Scene(loader.load(), 800, 600);

        stage.setTitle("Paint");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
