package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class DatabaseSong {
  private String song_name="";
  private String song_picture="";
  private String user_id="";
  private String song_rank="";

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

  public static List<Statistics> getSong(String userId) {
    List<Statistics> song = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM user_favorite_songs WHERE userid=" + userId + ";");
      while (rs.next()) {
        //User user = new User(rs.getString("user_name"), "",  "");
        Statistics s = new Statistics(rs.getString("song_name"),
                                      rs.getString("song_picture"), rs.getString("song_rank"));
        song.add(s);
      }
      System.out.println(song);
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return song;
  }

}