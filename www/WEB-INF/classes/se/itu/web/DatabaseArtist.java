package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseArtist {
  private String artist_name="";
  private String artist_picture="";
  private String user_name="";
  private String artist_rank="";

  static Connection con;
  static {
    try {
      con = DriverManager.getConnection("jdbc:sqlite:statistics.db");
      System.out.println("Success!");
    } catch (SQLException e) {
      System.err.println("Error loading database: " + e.getMessage());
    }
  }

  public static List<Statistics> getArtist(String userId) {
    List<Statistics> artist = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_artists WHERE userid=" + userId + ";");

      while (rs.next()) {

        Statistics a = new Statistics(rs.getString("user_name"), rs.getString("artist_name"),
                                      rs.getString("picture_url"), rs.getString("rank"));
        artist.add(a);
      }
    
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return artist;
  }

}
