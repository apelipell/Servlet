package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseSong {
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
  * Läser ut allting från den skapade vyn user_favorite_songs efter ett visst userId.
  */

  public static List<StatisticsSong> getSong(String userId) {
    List<StatisticsSong> song = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_songs WHERE userid=" + userId + ";");

      /**
      * Kör igenom den valda vyn i databasen, läser in song_name, song_picture, song_rank och artist_name
      * och lägger till i arraylistan song.
      */

      while (rs.next()) {

        StatisticsSong s = new StatisticsSong(rs.getString("song_name"),
                                      rs.getString("song_picture"), rs.getString("song_rank"),
                                      rs.getString("artist_name"));
        song.add(s);
      }
      /**
      * Fångar exceptions ifall det blir problem med att läsa från databasen.
      */
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return song;
  }

}
