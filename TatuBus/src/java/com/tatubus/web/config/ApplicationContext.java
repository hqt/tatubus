package com.tatubus.web.config;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huynhthao
 */
public class ApplicationContext {

    private final HttpServletRequest request;
    private final HttpServletResponse response;
    
    public ApplicationContext(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public void redirect(String url) {
        try {
            response.sendRedirect(url);
        } catch (IOException ex) {
            Logger.getLogger(ApplicationContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void forward(String url) {
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ApplicationContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ApplicationContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getParameter(String parameter) {
        return request.getParameter(parameter);
    }

    public int getIntParameter(String parameter) {
        return Integer.parseInt(request.getParameter(parameter));
    }

    public void setAttribute(String attributeName, Object attributeValue) {
        request.setAttribute(attributeName, attributeValue);
    }
    
    public Object getAttribute(String attributeName) {
        return request.getAttribute(attributeName);
    }

    public void setSessionAttribute(String attributeName, Object attributeValue) {
        request.getSession().setAttribute(attributeName, attributeValue);
    }

    public Object getSessionAttribute(String attributeName) {
        return request.getSession().getAttribute(attributeName);
    }
    
    public String getServletPath() {
        return request.getServletPath();
    }
    
    public String getPathInfo() {
        return request.getPathInfo();
    }
    /*
     * 
     * Description : get Writer
     * 
     * @return 
     */  
    public PrintWriter getWriter(){
        try {
            return response.getWriter() ;
        } catch (IOException ex) {
            Logger.getLogger(ApplicationContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null ;
    }
    /*
     * 
     * Description : getParameterValues
     * 
     * @return 
     */ 
    public String[] getParameterValues(String name){
        return request.getParameterValues(name);
    }
    
    /*
     * 
     * Description : 
     * 
     * @return 
     */    
    public void invalidate(){
        request.getSession().invalidate();
    }
    
}