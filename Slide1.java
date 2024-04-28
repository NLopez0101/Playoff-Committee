import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Slide1 extends Application
{
   @Override
   public void start(Stage stage) throws IOException
   {
      AnchorPane root = FXMLLoader.load(getClass().getResource("slideUnoFXML.fxml"));
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Football");
      stage.show();
   }
}