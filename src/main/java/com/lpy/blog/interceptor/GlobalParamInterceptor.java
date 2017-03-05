package com.lpy.blog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lulu on 16/3/28.
 */
public class GlobalParamInterceptor extends HandlerInterceptorAdapter {
    public static final String REQUEST_PARAM_GLOBAL = "GLOBAL";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {


        } catch (Exception e) {

        }
        return true;
    }
}
