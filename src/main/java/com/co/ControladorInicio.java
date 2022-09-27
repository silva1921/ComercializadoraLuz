
package com.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorInicio {
    
//    El page es la pagina web
    @GetMapping("/")
    public String inicio(){
       return  ("page");
    }
    
//    Login
    @GetMapping("/login")
    public String login(){
        return("login");
    }
    
    
    @GetMapping("/index")
    public String index(){
        return("index");
    }
    
    
}
