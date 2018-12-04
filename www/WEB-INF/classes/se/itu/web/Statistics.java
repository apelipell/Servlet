package se.itu.web;
import java.util.List;
import java.util.Collections;

public class Statistics{
  private String artist;
  private String track;

  public Statistics(String artist, String track){
    this.artist=artist;
    this.track=track;
  }

  public String artist(){
    return artist;
  }

  public String track(){
    return track;
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
