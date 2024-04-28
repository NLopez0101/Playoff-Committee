import javafx.event.ActionEvent;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class slideDos {
   private Model model;

    @FXML
    private Button nextButton;
    
    @FXML
    private ImageView cfpLogo;

    @FXML
    private Label numbersOne;

    @FXML
    private Label numbersTwo;

    @FXML
    private Text scoreOne;

    @FXML
    private Text scoreTwo;

    @FXML
    private Button simulate;

    @FXML
    private Label teamFour;

    @FXML
    private Label teamOne;

    @FXML
    private Label teamThree;

    @FXML
    private Label teamTwo;

    @FXML
    private Text vsOne;

    @FXML
    private Text vsTwo;

    @FXML
    void handleSimulate(ActionEvent event) /*Sets all invisible labels
    to visible and queries database to set all the labels for each
    team and their score. No score or team that is competing
    with each other can be equal*/
    {
      scoreOne.setVisible(true);
      scoreTwo.setVisible(true);
      numbersOne.setVisible(true);
      numbersTwo.setVisible(true);
      teamOne.setVisible(true);
      teamTwo.setVisible(true);
      teamThree.setVisible(true);
      teamFour.setVisible(true);
      
      model.queryTeamOne();
      teamOne.setText(model.getTeamOne());
      
      model.queryTeamTwo();
      teamTwo.setText(model.getTeamTwo());
      
      while(model.getTeamOne().equals(model.getTeamTwo()))
      {
         model.queryTeamOne();
         teamOne.setText(model.getTeamOne());
      }
      
      model.queryTeamThree();
      teamThree.setText(model.getTeamThree());
      
      model.queryTeamFour();
      teamFour.setText(model.getTeamFour());
      
      while(model.getTeamThree().equals(model.getTeamFour()))
      {
         model.queryTeamThree();
         teamThree.setText(model.getTeamThree());
      }
      
      
      while(model.getTeamOne().equals(model.getTeamThree()))
      {
         model.queryTeamOne();
         teamOne.setText(model.getTeamOne());
      }
      
       while(model.getTeamOne().equals(model.getTeamFour()))
      {
         model.queryTeamOne();
         teamOne.setText(model.getTeamOne());
      }
      
      while(model.getTeamTwo().equals(model.getTeamThree()))
      {
         model.queryTeamOne();
         teamTwo.setText(model.getTeamTwo());
      }
      
       while(model.getTeamTwo().equals(model.getTeamFour()))
      {
         model.queryTeamTwo();
         teamTwo.setText(model.getTeamTwo());
      }
      
      model.queryTeamScoreOne();
      model.queryTeamScoreTwo();
      
      while(model.getTeamScoreOne() == model.getTeamScoreTwo())
      {
         model.queryTeamScoreOne();
      }
      
      numbersOne.setText(Integer.toString(model.getTeamScoreOne()) + " - " + Integer.toString(model.getTeamScoreTwo()));
      
      model.queryTeamScoreThree();
      model.queryTeamScoreFour();
      
      while(model.getTeamScoreThree() == model.getTeamScoreFour())
      {
         model.queryTeamScoreThree();
      }
      
      numbersTwo.setText(Integer.toString(model.getTeamScoreThree()) + " - " + Integer.toString(model.getTeamScoreFour()));
      
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
      
      if(model.getTeamScoreThree() > model.getTeamScoreFour())
      {
         model.setWinnerTwo(model.getTeamThree());
         System.out.print(model.getWinnerTwo());
      }
      
      else
      {
         model.setWinnerTwo(model.getTeamFour());
         System.out.print(model.getWinnerTwo());
      }
          
    }
    
    @FXML
    private void handleNextButton(ActionEvent event) throws IOException
    {
      if(model.getClicked() != 7)
      {
         Alert alert = new Alert(AlertType.WARNING);
      alert.setHeaderText("Try a Simulation!");
      alert.setContentText("You must simulate before continuing!");
      alert.show();
      return;
      }
      
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("SlideTresFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      loader.<slideTres>getController().setModel(model);
      loader.<slideTres>getController().setLabels();
    }
    
     public void setModel(Model model) 
  {
   this.model = model;
  }

}
