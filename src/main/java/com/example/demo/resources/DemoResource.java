package com.example.demo.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/demo")
public class DemoResource {

	private final String TELA_DEMO = "demo";
	private final String TELA_PAGINA_TESTE = "pagina-teste";
	private final String TELA_TESTE = "teste";
	private final String TELA_NEW_FILE = "NewFile";
	
	@RequestMapping(value = "/ola", method = RequestMethod.GET)
	public String ola(ModelMap modelMap) {
		modelMap.addAttribute("atributo", "Thymeleaf");
		return TELA_DEMO;
	}
	
	@RequestMapping(value = "/demo",  method = RequestMethod.GET)
	public ModelAndView paginaDemo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(TELA_DEMO);
		return modelAndView;
	}
	
	@RequestMapping(value = "/pagina-teste",  method = RequestMethod.GET)
	public ModelAndView paginaTeste() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(TELA_PAGINA_TESTE);
		return modelAndView;
	}
	
	@RequestMapping(value = "/teste",  method = RequestMethod.GET)
	public ModelAndView teste() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(TELA_TESTE);
		return modelAndView;
	}
	
	@RequestMapping(value = "/new-file", method = RequestMethod.GET)
	public ModelAndView newFile() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(TELA_NEW_FILE);
		return modelAndView;
	}
}
