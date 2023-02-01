package com.freestack.helloworld;

import com.freestack.helloworld.youtube.apis.VideoApi;
import com.freestack.helloworld.youtube.models.Creator;
import com.freestack.helloworld.youtube.models.Video;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/videoServlet")
public class VideoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        addVideosToRequestThenForwardToListVideos(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String url = req.getParameter("url");
        String title = req.getParameter("title");

        Creator user = (Creator) req.getSession().getAttribute("userLogged");

        Video video = new Video(title, user);
        video.setCreationDate(new Date());
        video.setTitle(title);
        video.setUrl(url);

        VideoApi.upload(user, video);
        addVideosToRequestThenForwardToListVideos(req, resp);
    }

    private void addVideosToRequestThenForwardToListVideos(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Creator user = (Creator) req.getSession().getAttribute("userLogged");
        List<Video> videos =  VideoApi.listVideoByCreator(user);
        req.setAttribute("videos", videos);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
                "/listVideos.jsp");
        dispatcher.forward(req, resp);
    }
}
