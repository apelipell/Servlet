package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseSong {
  private String song_name="";
  private String song_picture="";
  private String song_rank="";
  private String artist_name="";

/**
* Försöker skapa en koppling mot databasen statistics.db och kontrollerar
* ifall kopplingen lyckades eller misslyckades. Skriver ut ett meddelande
* beroende på utfall.
*/
  static Connection con;
  static {
    try {
      con = DriverManager.getConnection("jdbc:sqlite:statistics.db");
      System.out.println("Success!");
    } catch (SQLException e) {
      System.err.println("Error loading database: " + e.getMessage());
    }
  }

/**
* Skapar en ArrayList och lägger till user_name, song_name, song_picture, song_rank och artist_name
* från den skapade vyn i databasen efter en viss userId.
*
*/

  public static List<Statistics> getSong(String userId) {
    List<Statistics> song = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_songs WHERE userid=" + userId + ";");
      while (rs.next()) {

        Statistics s = new Statistics(rs.getString("song_name"),
                                      rs.getString("song_picture"), rs.getString("song_rank"),
                                      rs.getString("artist_name"));
        song.add(s);
      }

    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return song;
  }

}
