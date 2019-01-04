package se.itu.web;
import java.util.List;
import java.util.Collections;

public class Statistics {
  private String artist_name="";
  private String artist_picture="";
  private String artist_rank="";

  private String song_name="";
  private String song_picture="";
  private String song_rank="";
  private String song_artist="";

  public Statistics(String artist_name, String artist_picture, String artist_rank) {
    this.artist_name = artist_name;
    this.artist_picture = artist_picture;
    this.artist_rank = artist_rank;
  }

  public Statistics(String song_name, String song_picture, String song_rank, String song_artist) {
    this.song_name = song_name;
    this.song_picture = song_picture;
    this.song_rank = song_rank;
    this.song_artist = song_artist;
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

  public String song_name(){
      return song_name;
  }

  public String song_rank(){
    return song_rank;
  }

  public String song_picture(){
    return song_picture;
  }

  public String song_artist(){
    return song_artist;
  }

}
