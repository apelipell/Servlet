package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseArtist {
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

  public static List<StatisticsArtist> getArtist(String userId) {
    List<StatisticsArtist> artist = new ArrayList<>();
    try {
/**
* Läser ut allting från den skapade vyn user_favorite_artists efter ett visst userId.
*/
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_artists WHERE userid=" + userId + ";");

      /**
      * Kör igenom vyn i databasen, läser in artist_name, picture_url och rank och lägger till
      * i arraylistan artist.
      */
      while (rs.next()) {

        StatisticsArtist a = new StatisticsArtist(rs.getString("artist_name"),
                                      rs.getString("picture_url"), rs.getString("rank"));
        artist.add(a);
      }
      /**
      * Fångar exceptions ifall det blir problem med att läsa från databasen.
      */
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return artist;
  }

}
