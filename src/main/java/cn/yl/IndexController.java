package cn.yl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	    @RequestMapping(value = "login")
	    public String login(HttpServletRequest request, String username){

	        request.getSession().setAttribute("user", "tom");

	        return "g";
	    }
	    
	    @RequestMapping(value = "index")
	    public String index(HttpServletRequest request, Model model){

	        String user = request.getSession().getAttribute("user").toString();

	        model.addAttribute("user", user);

	        return "index";
	    }
}