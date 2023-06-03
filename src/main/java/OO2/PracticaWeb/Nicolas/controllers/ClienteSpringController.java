package OO2.PracticaWeb.Nicolas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import OO2.PracticaWeb.Nicolas.entitys.Cliente;
import OO2.PracticaWeb.Nicolas.services.IClienteService;
import lombok.Data;

@Controller
@RequestMapping("/")
public class ClienteSpringController {
	@Autowired
	@Qualifier("clienteService")
	private IClienteService clienteService;
	
	@GetMapping("/Cliente")
	public String cliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "HelloWorld2";
		
	}
	
	@PostMapping("helloworld2")
	public ModelAndView newCliente(@ModelAttribute("cliente") Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/HelloWorld");
		clienteService.insertOrUpdate(cliente);
		return mv;
	}
	
}
