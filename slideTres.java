import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class slideTres {
   private Model model;
    @FXML
    private ImageView cfpLogo;

    @FXML
    private Button nextRound;

    @FXML
    private Label teamOne;

    @FXML
    private Label teamTwo;

    @FXML
    private void handleNext(ActionEvent event) throws IOException
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("SlideCuatroFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      loader.<SlideCuatro>getController().setModel(model);
      loader.<SlideCuatro>getController().setLabels();
    }
    
     public void setModel(Model model) 
  {
   this.model = model;
  }
  
  public void setLabels()
  {
   teamOne.setText(model.getWinnerOne());
   teamTwo.setText(model.getWinnerTwo());
  }

}
