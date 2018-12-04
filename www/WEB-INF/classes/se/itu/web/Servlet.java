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
//import se.itu.web.TestStatistics;



public class Servlet extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
   request.setCharacterEncoding(UTF_8.name());

   response.setContentType("application/json;charset="+UTF_8.name());
   //response.setContentType("text/html;charset="+UTF_8.name());
   PrintWriter out =
   new PrintWriter(new OutputStreamWriter(response.getOutputStream(),
   UTF_8), true);

   List<Statistics> stats = TestStatistics.getStats();

   JSONArray ja = new JSONArray();
   for (Statistics s : stats) {
     JSONObject jo = new JSONObject();
     jo.put("artist", s.artist());
     jo.put("track", s.track());
     ja.put(jo);

  }
  out.println(ja.toString(2));

 }
}
