package com.cursojava.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }


    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("addProgrammer")
    //public ModelAndView add(@RequestParam("id") int id, @RequestParam("name") String name, ModelAndView mv){
    public String addProgrammer(Programmer programmer){

//        Programmer programmer = new Programmer();
//        programmer.setId(id);
//        programmer.setName(name);

//        mv.addObject("programmer", programmer);
//        mv.setViewName("result");

        //return mv;
        return "result";
    }

}
