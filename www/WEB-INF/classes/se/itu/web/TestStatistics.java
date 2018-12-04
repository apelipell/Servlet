package se.itu.web;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;

public class TestStatistics {
  private String artist;
  private String track;
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

  public static List<Statistics> getStats() {
    List<Statistics> stats = new ArrayList<>();
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM statistics;");
      while (rs.next()) {
        Statistics s = new Statistics(rs.getString("artist"), rs.getString("track"));
        stats.add(s);
      }
    } catch (SQLException e) {
      System.err.println("Error reading from db " + e.getMessage());
    }
    return stats;
  }

}
