import javafx.fxml.FXML;
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
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SlideCuatro {
   private Model model;
    @FXML
    private Button buttonNext;

    @FXML
    private Button buttonSimulate;

    @FXML
    private ImageView imageViewCfb;

    @FXML
    private Label labelOne;

    @FXML
    private Label labelScore;

    @FXML
    private Label labelTwo;

    @FXML
    private Text textScore;

    @FXML
    private Text textVs;

    @FXML
    private void handleNext(ActionEvent event) throws IOException
    {
    
     if(model.getCount() != 7)
      {
         Alert alert = new Alert(AlertType.WARNING);
      alert.setHeaderText("Try a Simulation!");
      alert.setContentText("You must simulate before continuing!");
      alert.show();
      return;
      }
    
    
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("slideCincoFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      loader.<slideCinco>getController().setModel(model);
      loader.<slideCinco>getController().setLabels();
    }

    @FXML
    void handleSimulate(ActionEvent event) 
    {
      textScore.setVisible(true);
      labelScore.setVisible(true);
      model.queryTeamScoreOne();
      model.queryTeamScoreTwo();
      labelScore.setText(Integer.toString(model.getTeamScoreOne()) + " - " + Integer.toString(model.getTeamScoreTwo()));
      
      if(model.getTeamScoreOne() > model.getTeamScoreTwo())
      {
         model.setWinnerOne(model.getTeamOne());
         System.out.print(model.getWinnerOne());
      }
      
      else
      {
         model.setWinnerOne(model.getTeamTwo());
         System.out.print(model.getWinnerOne());
      }
    }
    
    public void setLabels()
    {
      labelOne.setText(model.getWinnerOne());
      labelTwo.setText(model.getWinnerTwo());
    }
    
     public void setModel(Model model) 
  {
   this.model = model;
  }
}
