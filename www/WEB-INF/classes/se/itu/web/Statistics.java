package se.itu.web;
import java.util.List;
import java.util.Collections;

public class Statistics {
  private String artist_name="";
  private String artist_picture="";
  private String user_id="";
  private String artist_rank="";

  private String songArtist;
  private String name="";
  private String picture="";
  private String rank="";

  private String user_name="";
  private String password="";

  public Statistics(String user_name, String name, String picture, String rank) {
    this.user_name = user_name;
    this.name = name;
    this.picture = picture;
    this.rank = rank;
  }

  public Statistics(String user_name, String name, String picture, String rank, String songArtist) {
    this.user_name = user_name;
    this.name = name;
    this.picture = picture;
    this.rank = rank;
    this.songArtist = songArtist;
  }

  public String name(){
    return name;
  }

  public String songArtist(){
    return songArtist;
  }

  public String picture(){
    return picture;
  }

  public String user_id(){
    return user_id;
  }
  public String user_name(){
    return user_name;
  }

  public String rank(){
    return rank;
  }

  public String toString() {
    return new StringBuilder(name)
       .append(" ")
       .append(rank)
       .append(" ")
       .append(picture)
       .toString();
  }

}
