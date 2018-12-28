package se.itu.web;
import java.util.List;
import java.util.Collections;

class Song {
  private String name;
  private String picture;
  private String rank;
  private String artist;

  public Song(String name, String picture, String rank){
    this.name = name;
    this.picture = picture;
    this.rank = rank;

  }

  public String name() {
    return name;
  }
  public String picture() {
    return picture;
  }
  public String rank() {
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
  private Song song;
  private String artist_name="";
  private String artist_picture="";
  private String user_id="";
  private String artist_rank="";

  private String song_name="";
  private String song_picture="";
  private String song_rank="";

  private String user_name="";
  private String password="";

  public Statistics(String artistName, String picture, String rank) {
    this.artist_name = artistName;
    this.artist_picture = picture;
    this.artist_rank = rank;
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

  /*public Statistics(String name, String picture, String rank){

    this.song_name = name;
    this.song_picture = picture;
    this.song_rank = rank;
  }*/
  public Song song() {
    return song;
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
    return new StringBuilder(artist_name)
       .append(" ")
       .append(artist_rank)
       .append(" ")
       .append(artist_picture)
       .toString();
  }

  public String song_name(){
    return song_name;
  }

  public String song_picture(){
    return song_picture;
  }

  public String song_rank(){
    return song_rank;
  }

}
