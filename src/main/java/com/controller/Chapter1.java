package com.controller;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 2019-06-20.
 */
@Controller
@RequestMapping(value = "/hello")
public class Chapter1 {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public HttpServletRequest hello(HttpServletRequest request, HttpServletResponse response) {

        System.out.println(request);
        System.out.println(response);

        return request;
    }


}
