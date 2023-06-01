package OO2.PracticaWeb.Nicolas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import OO2.PracticaWeb.Nicolas.entitys.Cliente;
import lombok.Data;

@Controller
@RequestMapping("/")
public class ClienteSpringController {
	
	@GetMapping("/Cliente")
	public String cliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "HelloWorld2";
		
	}
	
	@PostMapping("helloworld2")
	public ModelAndView newCliente(@ModelAttribute("cliente") Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/HelloWorld");
		mv.addObject("cliente", cliente);
		
		return mv;
	}
	
}
