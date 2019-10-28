package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yan hongbo
 * @date 2019/10/28 11:07
 * @description
 */
@Controller
public class DataController {

    @RequestMapping("/value")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("message", "success!");
        return new ModelAndView("test1");
    }
    @RequestMapping("/value1")
    public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("test1");
        mav.addObject("message", "success!");
        return mav;
    }
    @RequestMapping("/value2")
    public String handleRequest2(Model model) {
        model.addAttribute("message", "success!");
        return "test1";
    }

    @ModelAttribute
    public void model(Model model) {
        model.addAttribute("message", "Annotations success!");
    }
    @RequestMapping("/value3")
    public String handleRequest3() {
        return "test1";
    }

}
