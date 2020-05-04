package vn.com.cyberlogitec.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private String test() {
		return new String("1");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		String a = test();
		String b = test();
		if (a == b) {
			System.out.println("Test");
		}
		return new ModelAndView("home");
	}
	
	/**
	 * 
	 * @param name
	 * @return ModelAndView
	 */
	@RequestMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		return new ModelAndView("greeting");
	}
}
