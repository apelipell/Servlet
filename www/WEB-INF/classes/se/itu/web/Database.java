package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class Database {
  private String artist_name;
  private String artist_picture;
  private String user_id;
  private String artist_rank;

  private String song_name;
  private String song_picture;
  private String song_rank;
  private String song_artist;

  static Connection con;
  static {
    try {
      con = DriverManager.getConnection("jdbc:sqlite:statistics.db");
      System.out.println("Success!");
    } catch (SQLException e) {
      System.err.println("Error loading database: " + e.getMessage());
    }
  }

  //}
  /*public static void main(String[] args) {
    List<Statistics> stats = getStats();//new ArrayList<>();
    JSONArray ja = new JSONArray();
    for (Statistics s : stats) {
      JSONObject jo = new JSONObject();
      jo.put("artist", s.artist());
      jo.put("track", s.track());
      ja.put(jo);
    }
    System.out.println(ja.toString(2));
  }*/

  public static List<Statistics> getArtist() {
    List<Statistics> artist = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM artist;");
      while (rs.next()) {
        Statistics a = new Statistics(rs.getString("artist_name"), rs.getString("artist_picture"),
        rs.getString("user_id"), rs.getString("artist_rank"));
        artist.add(a);
      }
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return artist;
  }

  /*public static List<Statistics> getSong() {
    List<Statistics> Song = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM song;");
      while (rs.next()) {
        Statistics s = new Statistics(rs.getString("song_name"), rs.getString("song_picture"),
        rs.getString("user_id"), rs.getString("song_rank"), rs.getString("song_artist"));
        artist.add(s);
      }
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return song;
  }*/

}
