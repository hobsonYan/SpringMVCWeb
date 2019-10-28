package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yan hongbo
 * @date 2019/10/24 19:19
 * @description
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception{
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);
        return null;
    }
    @RequestMapping("/login1")
    public ModelAndView getLogin1(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
        return null;
    }
    @RequestMapping("/login2")
    public ModelAndView getLogin2(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        System.out.println(userName);
        System.out.println(password);
        return null;
    }

    //jump to /hello
    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/hello");
        return mav;
    }
    @RequestMapping("/jump1")
    public String jump1() {
        return "redirect: ./hello";
    }
}