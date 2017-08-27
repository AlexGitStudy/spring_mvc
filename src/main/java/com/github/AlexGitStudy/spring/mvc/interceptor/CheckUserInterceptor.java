package com.github.AlexGitStudy.spring.mvc.interceptor;


import com.github.AlexGitStudy.spring.mvc.object.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (request.getRequestURI().contains("check-user")) {

//            User user = (User) request.getAttribute("user");//из запроса с помощью метода getAttribute мы получаем пользователя
            User user = (User) modelAndView.getModel().get("user");
            if (user == null || !user.isRole())
                response.sendRedirect(request.getContextPath() + "/failed");
        }
    }

}
