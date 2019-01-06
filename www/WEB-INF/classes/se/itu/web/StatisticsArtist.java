package se.itu.web;
import java.util.List;
import java.util.Collections;

public class StatisticsArtist {
  private String artist_name="";
  private String artist_picture="";
  private String artist_rank="";

  public StatisticsArtist(String artist_name, String artist_picture, String artist_rank) {
    this.artist_name = artist_name;
    this.artist_picture = artist_picture;
    this.artist_rank = artist_rank;
  }

  public String artist_name(){
    return artist_name;
  }

  public String artist_picture(){
    return artist_picture;
  }

  public String artist_rank(){
    return artist_rank;
  }

}
