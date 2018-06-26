package am.aro.servlets;


import am.aro.model.User;
import am.aro.repository.UsersRepository;
import am.aro.repository.UsersRepositoryInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    private UsersRepository usersRepository;


    @Override
    public void init() {
        this.usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersRepository.findAll();
        req.setAttribute("usersFromServer", users);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/signUp.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password = req.getParameter("password");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthdate"));
        User user = new User(name,password,birthDate);
        usersRepository.save(user);
        /*RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/signUp.jsp");
        dispatcher.forward(req, resp);*/
        doGet(req,resp);

    }
}
