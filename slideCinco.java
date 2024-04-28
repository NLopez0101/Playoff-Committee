import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class slideCinco {
   private Model model;
    @FXML
    private Button buttonStartOver;

    @FXML
    private ImageView imageViewCfb2;

    @FXML
    private Label labelScoreTwo;

    @FXML
    private Label labelWinner;

    @FXML
    private Text textScore;

    @FXML
    private Text textWinner;
    
    @FXML
    private void handleStartOver(ActionEvent event) throws IOException
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("slideUnoFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      loader.<SlideUno>getController().setModel(model);

    }
    
     public void setModel(Model model) 
  {
   this.model = model;
  }
  
  public void setLabels()
  {
   labelWinner.setText(model.getWinnerOne());
   labelScoreTwo.setText(Integer.toString(model.getTeamScoreOne()) + " - " + Integer.toString(model.getTeamScoreTwo()));
  }

}
