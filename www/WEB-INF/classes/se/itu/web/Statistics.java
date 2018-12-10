package se.itu.web;
import java.util.List;
import java.util.Collections;

public class Statistics{
  private String artist_name;
  private String artist_picture;
  private String user_id;
  private String rank;

  public Statistics(String artist_name, String artist_picture, String user_id, String rank){
    this.artist_name = artist_name;
    this.artist_picture = artist_picture;
    this.user_id = user_id;
    this.rank = rank;
  }

  public String artist_name(){
    return artist_name;
  }

  public String artist_picture(){
    return artist_picture;
  }

  public String user_id(){
    return user_id;
  }

  public String rank(){
    return rank;
  }
  /*@Override
  public String toString() {
    return new StringBuilder()
      .append("\n\"")
      .append(artist)
      .append(" | ")
      .append(track)
      .append("\"\n")
      .append(String.format("This is the track", track))

      .toString();
  }*/


}
