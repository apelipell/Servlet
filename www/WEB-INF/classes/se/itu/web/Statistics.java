package se.itu.web;
import java.util.List;
import java.util.Collections;

class User {
  private String name;
  private String userId;
  private String password;
  public User(String name, String userId, String password) {
    this.name = name;
    this.userId = userId;
    this.password = password;
  }
  public String name() {
    return name;
  }
  public String userId() {
    return userId;
  }
  public String password() {
    return password;
  }
  public String toString() {
    return new StringBuilder(name)
      .append(" ")
      .append(userId)
      .append(" ")
      .append(password)
      .toString();
  }
}
public class Statistics {
  private User user;
//  private Song song;
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

  public Statistics(String name, String picture, String rank) {
    this.name = name;
    this.picture = picture;
    this.rank = rank;
  }

  public Statistics(String name, String picture, String rank, String songArtist) {
    this.name = name;
    this.picture = picture;
    this.rank = rank;
    this.songArtist = songArtist;
  }

  public Statistics(User user, String artist, String rank, String picture) {
    this.user = user;
    this.artist_name = artist;
    this.artist_rank = rank;
    this.artist_picture = picture;
  }

  public User user() {
    return user;
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

  public String rank(){
    return rank;
  }
/*
private User user;
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
*/

  public String toString() {
    return new StringBuilder(name)
       .append(" ")
       .append(rank)
       .append(" ")
       .append(picture)
       .toString();
  }

/*
  public String song_name(){
    return song_name;
  }

  public String song_picture(){
    return song_picture;
  }

  public String song_rank(){
    return song_rank;
  }
*/
}
