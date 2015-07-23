package com.tatubus.web.action;

import com.tatubus.web.config.ApplicationContext;


public interface IAction {
    String execute(ApplicationContext context);
}