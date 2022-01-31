package com.example.demo.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/demo")
public class DemoResource {

//	private final String TELA_DEMO = "demo";
	
	@RequestMapping(value = "/ola", method = RequestMethod.GET)
	public String ola(ModelMap modelMap) {
		modelMap.addAttribute("atributo", "Thymeleaf");
		return "demo";
	}
	
	@RequestMapping(value = "/demo",  method = RequestMethod.GET)
	public ModelAndView paginaDemo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("demo");
		return modelAndView;
	}
	
	@RequestMapping(value = "/pagina-teste",  method = RequestMethod.GET)
	public ModelAndView paginaTeste() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pagina-teste");
		return modelAndView;
	}
	
	@RequestMapping(value = "/teste",  method = RequestMethod.GET)
	public ModelAndView teste() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("teste");
		return modelAndView;
	}
}
