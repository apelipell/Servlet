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


public class ServletArtist extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
   request.setCharacterEncoding(UTF_8.name());

   response.setContentType("application/json;charset="+UTF_8.name());

   PrintWriter out =
   new PrintWriter(new OutputStreamWriter(response.getOutputStream(),
   UTF_8), true);
   String userId = request.getParameter("artist_user_id");

   List<Statistics> artist = DatabaseArtist.getArtist(userId);

   JSONObject stats = new JSONObject();
   out.println(stats.put("user_name", artist.get(0).user_name()));

   JSONArray ja = new JSONArray();
   for (Statistics a : artist) {
     JSONObject joArtist = new JSONObject();
     //joArtist.put("user_name", a.user_name());
     joArtist.put("artist_name", a.name());
     joArtist.put("artist_picture", a.picture());
     joArtist.put("artist_rank", a.rank());
     ja.put(joArtist);

  }
  out.println(ja.toString(2));

 }
}
