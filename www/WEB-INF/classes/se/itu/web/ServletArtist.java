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

   /**
   * Läser in det bestämda userId i artist.
   */
   String userId = request.getParameter("artist_user_id");
   List<StatisticsArtist> artist = DatabaseArtist.getArtist(userId);

   /**
   * Skapar en JSONArray och lägger in informationen från databasen.
   */
   JSONArray jsonArray = new JSONArray();
   for (StatisticsArtist a : artist) {
     JSONObject joArtist = new JSONObject();
     joArtist.put("artist_name", a.artist_name());
     joArtist.put("artist_picture", a.artist_picture());
     joArtist.put("artist_rank", a.artist_rank());
     jsonArray.put(joArtist);

  }

  /**
  * Lägger in JSONArrayen i ett JSONObjekt, ger det titeln artists och skriver ut allt.
  */
  JSONObject stats = new JSONObject();
  stats.put("artists", jsonArray);
  out.println(stats.toString(2));
 }
}
