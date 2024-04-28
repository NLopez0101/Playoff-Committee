
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;


public class SlideUno {
   private Model model;

    @FXML
    private ImageView cfp;

    @FXML
    private Button startbutton;

    @FXML
      private void buttonHandle(ActionEvent event) throws IOException
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("SlideDosFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      loader.<slideDos>getController().setModel(model);
    }
    
   public void setModel(Model model) 
  {
   this.model = model;
  }
  
   @FXML
   public void initialize()
   {
      model = new Model();
   }  

}
