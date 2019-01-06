package se.itu.web;
import java.util.List;
import java.util.Collections;

public class StatisticsSong {
  private String song_name="";
  private String song_picture="";
  private String song_rank="";
  private String song_artist="";


  public StatisticsSong(String song_name, String song_picture, String song_rank, String song_artist) {
    this.song_name = song_name;
    this.song_picture = song_picture;
    this.song_rank = song_rank;
    this.song_artist = song_artist;
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
