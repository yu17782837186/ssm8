package com.ning.servlet;

import com.ning.pojo.PageInfo;
import com.ning.service.StudentService;
import com.ning.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
//    private StudentService stuService = new StudentServiceImpl();
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        request.setCharacterEncoding("utf-8");
////        response.setContentType("text/html;charset=utf-8");
////        String sname = request.getParameter("sname");
////        if (sname != null && !sname.equals(""))
////        sname = new String(sname.getBytes("iso-8859-1"),"utf-8");
////        String tname = request.getParameter("tname");
////        if (tname != null && !tname.equals(""))
////        tname = new String(tname.getBytes("iso-8859-1"),"utf-8");
////        String pageSize = request.getParameter("pageSize");
////        String pageNumber = request.getParameter("pageNumber");
////        PageInfo pi = stuService.showPage(sname, tname, pageSize, pageNumber);
////        request.setAttribute("pageinfo",pi);
////        request.getRequestDispatcher("/show.jsp").forward(request,response);
//        String sname = request.getParameter("sname");
//        if (sname != null && !sname.equals(""))
//            sname = new String(sname.getBytes("iso-8859-1"), "UTF-8");
//        String tname = request.getParameter("tname");
//        if (tname != null && !tname.equals(""))
//            tname = new String(tname.getBytes("iso-8859-1"), "UTF-8");
//        String pageSize = request.getParameter("pageSize");
//        String pageNumber = request.getParameter("pageNumber");
//        PageInfo pi = stuService.showPage(sname, tname, pageSize, pageNumber);
//        System.out.println(pi);
//        request.setAttribute("pageinfo", pi);
//        request.getRequestDispatcher("show.jsp").forward(request, response);
//    }

    private StudentService stuService = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String sname = req.getParameter("sname");
        if (sname != null && !sname.equals(""))
            sname = new String(sname.getBytes("iso-8859-1"), "utf-8");
        String tname = req.getParameter("tname");
        if (tname != null && !tname.equals(""))
            tname = new String(tname.getBytes("iso-8859-1"), "utf-8");
        String pageSize = req.getParameter("pageSize");
        String pageNumber = req.getParameter("pageNumber");
        PageInfo pi = stuService.showPage(sname, tname, pageSize, pageNumber);
        System.out.println(pi);
        req.setAttribute("pageinfo", pi);
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
