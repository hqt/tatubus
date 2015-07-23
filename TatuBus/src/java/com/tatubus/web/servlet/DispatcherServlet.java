package com.tatubus.web.servlet;

import com.tatubus.web.action.ActionFactory;
import com.tatubus.web.action.IAction;
import com.tatubus.web.action.IActionFactory;
import com.tatubus.web.config.ApplicationContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huynhthao
 */
public class DispatcherServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ApplicationContext context = new ApplicationContext(request, response);
        IActionFactory factory = new ActionFactory();
        IAction action = factory.getAction(context);
        String view = action.execute(context);
        //check if ajax call , don't forward or redirect
        // if (view.equals(Config.AJAX_FORMAT)) {
        //    return;
        //}
        if (view.length() >= 9 && view.substring(0, 9).equals("redirect.")) {
            view = view.substring(9, view.length());
            context.redirect(view);
        } else {
            context.forward(view);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
