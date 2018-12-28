package se.itu.web;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import org.json.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


public class ServletSongs extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
   request.setCharacterEncoding(UTF_8.name());

   response.setContentType("application/json;charset="+UTF_8.name());

   PrintWriter out =
   new PrintWriter(new OutputStreamWriter(response.getOutputStream(),
   UTF_8), true);
   String userId = request.getParameter("song_user_id");
   // TODO: vad göra om parametern saknas???
   List<Statistics> song = DatabaseSong.getSong(userId);

     JSONArray js = new JSONArray();
     for (Statistics s : song) {
       JSONObject joSong = new JSONObject();
       joSong.put("song_name", s.song_name());
       joSong.put("song_picture", s.song_picture());
       joSong.put("song_rank", s.song_rank());
       js.put(joSong);

  }
  out.println(js.toString(2));

 }
}