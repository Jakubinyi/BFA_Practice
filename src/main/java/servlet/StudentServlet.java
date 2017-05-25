package servlet;

import dao.StudentDaoDB;
import dao.UniversityDaoDB;
import model.Student;
import model.University;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jakubinyi on 2017.05.17..
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer uid = Integer.valueOf(req.getParameter("id"));

        StudentDaoDB studentDaoDB = new StudentDaoDB();

        JSONArray jsonArray = new JSONArray();

        for (Student student : studentDaoDB.getStudentsByUID(uid)) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", student.getId());
            jsonObject.put("name", student.getName());
            jsonObject.put("department", student.getDepartment());
            jsonObject.put("uid", student.getUid());

            jsonArray.put(jsonObject);
        }

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.getWriter().println(jsonArray);
    }
}
