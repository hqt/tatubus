package com.tatubus.web.action;

import com.tatubus.web.config.ApplicationContext;

public class ActionFactory implements IActionFactory {

    @Override
    public IAction getAction(ApplicationContext context) {
        String parameter = context.getParameter("action");
        IAction action = null;

        // handle link such as localhost/qna/login.jsp 
        // forward to WEB-INF/login.jsp
        /*String url = context.getServletPath();
        if (url.equals("/list")) {
            action = new MainAction();
        } else if (url.equals("/questions")) {
            action = new DetailQuestionAction();
        } else if (url.equals("/login")) {
            context.setAttribute(Config.DIRECT_PAGE_ATTRIBUTE, "WEB-INF/login.jsp");
            action = new DirectPageAction();
        } else if (url.equals("/register")) {
            context.setAttribute(Config.DIRECT_PAGE_ATTRIBUTE, "WEB-INF/register.jsp");
            action = new DirectPageAction();
        } else if (url.equals("/search")) {
            action = new SearchAction();
        } else if (url.equals("/admin/management")) {
            action = new AdminManagementAction();
        } else if (url.equals("/ask")) {
            action = new PostQuestionAction();
        } else if (url.equals("/management/account")) {
            action = new ShowAccountAction();
        } else if (url.equals("/logout")) {
            action = new LogoutAction();
        }
        if (action != null) {
            return action;
        } */

        // handle "action" parameter that end with jsp. will go directly to jsp page
        /**
         * if (parameter.length() >= 4) { String lastStr =
         * parameter.substring(parameter.length() - 4, parameter.length()); if
         * (lastStr.equals(".jsp")) { return new JSPPageAction(); } }
         */
        /*if (parameter.equals("Log in")) {
         action = new LoginAction();
         } else if (parameter.equals("detailquestion")) {
         action = new DetailQuestionAction();
         } else if (parameter.equals("Register")) {
         action = new RegisterAction();
         } else if (parameter.equals("Create Tag")) {
         action = new CreateTagAction();
         } else if (parameter.equals("TagList")) {
         action = new TagListAction();
         } else if (parameter.equals("UpdateTag")) {
         action = new UpdateTagAction();
         } else if (parameter.equals("showtag")) {
         action = new ShowTagAction();
         } else if (parameter.equals("Delete Tag")) {
         action = new DeleteTagAction();
         } else if (parameter.equals("Mainpage")) {
         action = new MainAction();
         } else if (parameter.equals("myprofile")) {
         return new MyProfileAction();
         } else if (parameter.equals("postQuestion")) {
         action = new PostQuestionAction();
         } else if (parameter.equals("AJAX")) {
         action = new AJAXAction();
         } else if (parameter.equals("questionManagement")) {
         action = new QuestionManagementAction();
         } else if (parameter.equals("voteAction")) {
         action = new VoteAction();
         } else if (parameter.equals("accountManagement")) {
         action = new AccountManagementAction();
         } else if (parameter.equals("answerManagement")) {
         action = new QuestionManagementAction();
         }else if(parameter.equals("postAnswer")){
         action = new PostAnswerAction();
         }else if(parameter.equals("tagManagement")){
         action = new TagManagementAction();
         }else if(parameter.equals("addFavoriteTag")){
         action = new SaveFavoriteTagAction();
         } */
        return action;
    }
}
