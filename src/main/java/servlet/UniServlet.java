package servlet;

import dao.DatabaseHiDao;
import dao.HiDao;
import dao.UniversityDaoDB;
import model.University;
import org.json.JSONArray;
import org.json.JSONObject;
import util.ConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

/**
 * Created by jakubinyi on 2017.05.17..
 */

@WebServlet("/uni")
public class UniServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("text");

        UniversityDaoDB universityDaoDB = new UniversityDaoDB();

        universityDaoDB.addUni(name);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UniversityDaoDB universityDaoDB = new UniversityDaoDB();

       /* JSONObject jsonObject = new JSONObject();

        for (University uni : universityDaoDB.getAllUniversity()) {
            jsonObject.put(String.valueOf(uni.getId()), uni.getName());
        }

        for (University uni : universityDaoDB.getAllUniversity()) {
            jsonObject.put(String.valueOf(uni.getId()), uni.toString());
        }*/

       JSONArray jsonArray = new JSONArray();

        for (University uni : universityDaoDB.getAllUniversity()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", uni.getId());
            jsonObject.put("name", uni.getName());
            jsonObject.put("city", uni.getCity());

            jsonArray.put(jsonObject);
        }

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.getWriter().println(jsonArray);
    }
}

