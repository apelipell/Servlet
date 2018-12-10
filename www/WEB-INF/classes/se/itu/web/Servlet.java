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


public class Servlet extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
   request.setCharacterEncoding(UTF_8.name());

   response.setContentType("application/json;charset="+UTF_8.name());

   PrintWriter out =
   new PrintWriter(new OutputStreamWriter(response.getOutputStream(),
   UTF_8), true);

   List<Statistics> stats = TestStatistics.getStats();

   JSONArray ja = new JSONArray();
   for (Statistics s : stats) {
     JSONObject jo = new JSONObject();
     JSONObject joSong = new JSONObject();
     JSONObject jsonUser = new JSONObject();

     jo.put("artist_name", s.artist_name());
     jo.put("artist_picture", s.artist_picture());
     jo.put("user_id", s.user_id());
     jo.put("rank", s.rank());
     ja.put(jo);

  }
  out.println(ja.toString(2));

 }
}
