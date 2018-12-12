package se.itu.web;
import java.util.List;
import java.util.Collections;

public class Statistics{
  private String artist_name;
  private String artist_picture;
  private String user_id;
  private String artist_rank;

  private String song_name;
  private String song_picture;
  private String song_rank;
  private String song_artist;

  private String user_name;
  private String password;

  public Statistics(String artist_name, String artist_picture, String user_id, String artist_rank/*,
                    String song_name, String song_picture, String song_rank, String song_artist*/){
    this.artist_name = artist_name;
    this.artist_picture = artist_picture;
    this.user_id = user_id;
    this.artist_rank = artist_rank;

    /*this.song_name = song_name;
    this.song_picture = song_picture;
    this.song_rank = song_rank;
    this.song_artist = song_artist;*/
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

  public String artist_rank(){
    return artist_rank;
  }

  /*public String song_name(){
    return song_name;
  }

  public String song_picture(){
    return song_picture;
  }

  public String song_rank(){
    return song_rank;
  }

  public String song_artist(){
    return song_artist;
  }*/

}
