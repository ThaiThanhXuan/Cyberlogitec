package vn.com.cyberlogitec.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/**
	 * 
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		return new ModelAndView("greeting");
	}
}
