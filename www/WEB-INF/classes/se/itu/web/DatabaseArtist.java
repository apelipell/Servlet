package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseArtist {
  private String artist_name="";
  private String artist_picture="";
  private String user_id="";
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

  public static List<Statistics> getArtist(String userId) {
    List<Statistics> artist = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM users_favorite_artists WHERE userid=" + userId + ";");
      while (rs.next()) {
        //User user = new User(rs.getString("user_name"), "",  "");
        Statistics a = new Statistics(rs.getString("artist_name"),
                                      rs.getString("picture_url"), rs.getString("rank"));
        artist.add(a);
      }
      System.out.println(artist);
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return artist;
  }

/*  public static List<StatisticsSong> getSong(String userId) {
    List<StatisticsSong> song = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_songs WHERE userid=" + userId + ";");
      while (rs.next()) {
        StatisticsSong s = new Statistics(rs.getString("song_name"), rs.getString("song_picture"),
                                          rs.getString("song_rank"));
        song.add(s);
      }
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return song;
  }*/

}
