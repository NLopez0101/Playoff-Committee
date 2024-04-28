import java.sql.*;

public class Model
{
   private String teamOne;
   private String teamTwo;
   private String teamThree;
   private String teamFour;
   
   private int teamScoreOne;
   private int teamScoreTwo;
   private int teamScoreThree;
   private int teamScoreFour;
   
   private String winnerOne;
   private String winnerTwo;
   
   private int clicked = 0;
   private int count = 0;
   
   public Model()
   {
   
   }
   
   public void queryTeamOne()
   {
      Connection connection = null;
      
      try
      {
         
         
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT Team FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamOne(rs.getString("Team"));
         }
      }
      
      
      catch (Exception e)
      {
         e.printStackTrace();
      }
      
   }
   
   public void queryTeamTwo()
   {
      Connection connection = null;
      
      try
      {
         
         
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT Team FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamTwo(rs.getString("Team"));
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
   
   public void queryTeamThree()
   {
   
      Connection connection = null;
      
      try
      {
         
         
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT Team FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamThree(rs.getString("Team"));
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
   
   public void queryTeamFour()
   {
      Connection connection = null;
      
      try
      {
         
         
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT Team FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamFour(rs.getString("Team"));
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
      
   public void queryTeamScoreOne()
   {
      Connection connection = null;
      
      try
      {  
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT TeamScore FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamScoreOne(rs.getInt("TeamScore"));
         }
      }
      
      
      catch (Exception e)
      {
         e.printStackTrace();
      }
      
   }
   
   public void queryTeamScoreTwo()
   { count = 7;
      Connection connection = null;
      
      try
      {  
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT TeamScoreTwo FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamScoreTwo(rs.getInt("TeamScoreTwo"));
         }
      }
      
      
      catch (Exception e)
      {
         e.printStackTrace();
      }
      
   }
   
    public void queryTeamScoreThree()
   { clicked = 7;
      Connection connection = null;
      
      try
      {  
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT TeamScoreTwo FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamScoreThree(rs.getInt("TeamScoreTwo"));
         }
      }
      
      
      catch (Exception e)
      {
         e.printStackTrace();
      }
      
   }
   
    public void queryTeamScoreFour()
   { count = 0;
      Connection connection = null;
      
      try
      {  
         connection = DriverManager.getConnection("jdbc:sqlite:resources/football.db");
         
         Statement statement = connection.createStatement();
         
         ResultSet rs = statement.executeQuery("SELECT TeamScoreTwo FROM football ORDER BY RANDOM() LIMIT 1");
         
         while(rs.next())
         {
            setTeamScoreFour(rs.getInt("TeamScoreTwo"));
         }
      
      }
      
      
      catch (Exception e)
      {
         e.printStackTrace();
      }
      
   }  
   
   
   public String getTeamOne()
   {
      return teamOne;
   }
   
   public void setTeamOne(String teamOne)
   {
      this.teamOne = teamOne;
   }
   
   public String getTeamTwo()
   {
      return teamTwo;
   }
   
   public void setTeamTwo(String teamTwo)
   {
      this.teamTwo = teamTwo;
   }
   
   public String getTeamThree()
   {
      return teamThree;
   }
   
   public void setTeamThree(String teamThree)
   {
      this.teamThree = teamThree;
   }
   
   public String getTeamFour()
   {
      return teamFour;
   }
   
   public void setTeamFour(String teamFour)
   {
      this.teamFour = teamFour;
   }
   
   public int getTeamScoreOne()
   {
      return teamScoreOne;
   }
   
   public void setTeamScoreOne(int teamScoreOne)
   {
      this.teamScoreOne = teamScoreOne;
   }
   
   public int getTeamScoreTwo()
   {
      return teamScoreTwo;
   }
   
   public void setTeamScoreTwo(int teamScoreTwo)
   {
      this.teamScoreTwo = teamScoreTwo;
   }
   
   public int getTeamScoreThree()
   {
      return teamScoreThree;
   }
   
   public void setTeamScoreThree(int teamScoreThree)
   {
      this.teamScoreThree = teamScoreThree;
   }
   
   public int getTeamScoreFour()
   {
      return teamScoreFour;
   }
   
   public void setTeamScoreFour(int teamScoreFour)
   {
      this.teamScoreFour = teamScoreFour;
   }
   
    public String getWinnerOne()
   {
      return winnerOne;
   }
   
   public void setWinnerOne(String winnerOne)
   {
      this.winnerOne = winnerOne;
   }
   
    public String getWinnerTwo()
   {
      return winnerTwo;
   }
   
   public void setWinnerTwo(String winnerTwo)
   {
      this.winnerTwo = winnerTwo;
   }
   
   public int getClicked()
   {
      return clicked;
   }
   
   public void setClicked()
   {
   this.clicked = clicked;
   }
   
   public int getCount()
   {
      return count;
   }
   
   public void setCount()
   {
      this.count = count;
   }
   
}