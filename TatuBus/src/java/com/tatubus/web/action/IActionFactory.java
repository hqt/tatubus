package com.tatubus.web.action;

import com.tatubus.web.config.ApplicationContext;


public interface IActionFactory {
    IAction getAction(ApplicationContext context);
}